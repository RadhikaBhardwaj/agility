package com.agilityroots.assignement.ParkingLot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateParking {

  
  
  //Validating the Registration No of the Car.
  /*
   * Example : 
   *  valid :
   *    KA-51-EQ-4681
   *  invalid :
   *    ka-51-EQ-4681
   *    KA-51-eqs-4681
   */
  
  public static boolean validateRegistrationNo(String registrationNo){
    final String regsitrationNoREGEX = "[A-Z]{2}-\\d{2}-[A-Z]{1,2}-\\d{3,4}";
    Pattern  pattern = Pattern.compile(regsitrationNoREGEX);
    Matcher matcher = pattern.matcher(registrationNo);
    boolean isValidRegistrationNo = false;     
    isValidRegistrationNo = matcher.matches();   
    if(!isValidRegistrationNo){
    	System.out.println("Registration No. : " + registrationNo +" not of valid Format: XX-00-XX-0000 or XX-00-XX-000 or XX-00-X-0000 or XX-00-X-000.\n");
    }
    return isValidRegistrationNo;
    
  }
  
  //Validate the Color String
  //It Must contain only Alpabhates
  public static boolean validateColor(String color){
    final String colorREGEX = "[A-Za-z]*";
    boolean isvalidColor = false;
    Pattern  pattern = Pattern.compile(colorREGEX);
    Matcher matcher = pattern.matcher(color);
    isvalidColor = matcher.matches();  
    if(!isvalidColor){
    	System.out.println("Colour : " + color + " not of valid format.\n");
    }
    return isvalidColor;
  }
  
  
 

}
