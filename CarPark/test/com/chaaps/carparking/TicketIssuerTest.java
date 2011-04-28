package com.chaaps.carparking;

import org.junit.*;
import java.util.HashMap;
import junit.framework.*;

import com.chaaps.VO.Car;
import com.chaaps.VO.Slot;

public class TicketIssuerTest  {

	private TicketIssuer ticketissuer;
	
	@Before
	public void setUp() throws Exception {
		
		ticketissuer = TicketIssuer.getInstance("6");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private void TestisEmptySpace()
	 {
		ticketissuer.issueTicket(new Car("KA-01","white"));
		boolean expected=true;
	//	assertTrue(ticketissuer.isEmptySpace());
		
	 
	 }
	 
	 private void TestgetNextSlot(Car car)
	 {
	 
	
	 }
	 
	 public void TestissueTicket(Car car)
	 {
	  
	 }

	 public void TestsameColorCars(String color)
	 {
	   
	 }

	 public void TestslotNumberForCarsWithSpecificColor(String color)
	 {
	 
	  
	 }
	 
	 public void TestslotNumberForCar(String regno)
	 {
		 ticketissuer.issueTicket(new Car("KA-01","white"));
		 int expected = 1;
	//	 assertEquals(expected, ticketissuer.slotNumberForCar("KA-01"));
	  
	 }

	 public void TestcheckOutCar(Integer slotNumber)
	 {
	  
	 }
	 
	 private void TestinitializeSlots()
	 {
	  
	 }

}
