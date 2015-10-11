package com.agilityroots.assignement.ParkingLot.model;


//POJO class to store parked cars info
public class Car {
  
	
  private String registrationNo;
  private String color;
  
  public String getRegistrationNo() {
    return registrationNo;
  }
  public void setRegistrationNo(String registrationNo) {
    this.registrationNo = registrationNo;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  

	public Car(String registrationNo,String color){
    this.registrationNo = registrationNo;
    this.color = color;
 
  }
  
  

}
