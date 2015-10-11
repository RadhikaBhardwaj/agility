package com.agilityroots.assignement.ParkingLot;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingTest{
	
	@Test
	public void TestisParkingCreated() throws Exception{
	
		Parking createParkingTester = new Parking();
		
		//asserts
		assertEquals(false,createParkingTester.isParkingLotCreated());
		
		createParkingTester.createParkingLot(6);
		
		assertEquals(true,createParkingTester.isParkingLotCreated());
	}
	

}
