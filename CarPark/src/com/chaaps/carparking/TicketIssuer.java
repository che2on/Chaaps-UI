/*
 * Project name: CarPark
 * File name: TicketIssuer.java
 * File description: The file holds the class TicketIssuer.
 * 				``	 sameColorCars(), slotNumberForCarsWithSpecificColor(),
 * 					 slotNumberForCar() are the core methods for the given problem's solution.
 * Author: Chethan Thimmappa
 * Last Modified date: 20/04/2011
 */

package com.chaaps.carparking;


import com.chaaps.VO.*;

import java.util.ArrayList;
import java.util.HashMap;


class TicketIssuer
{
 public static TicketIssuer ticketIssuer;
 private HashMap slots;
 private int n;
 
 private TicketIssuer(int n)
 {
  this.n = n;
 }

 public static TicketIssuer getInstance(String n)
 {
  if (ticketIssuer == null)
  {
   ticketIssuer = new TicketIssuer(Integer.valueOf(n).intValue());
   ticketIssuer.initializeSlots();
   System.out.println("Created a parking lot with "+n +" slots");
   }
   return ticketIssuer;
 }

 public boolean isEmptySpace()
 {
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == false)
   {
    return true;
   }
  }
  System.out.println("Sorry, parking lot is full\n");
  return false;
 }
 
 private void getNextSlot(Car car)
 {
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == false)
   {
    System.out.println("Allocated slot number: "+ i);

    slots.put(new Integer(i), new Slot(i,car,true));
    break;
   }
  }
  System.out.println("\n");
 }
 
 public void issueTicket(Car car)
 {
  if(isEmptySpace())
  {
   getNextSlot( car);
  }
 }

 void sameColorCars(String color)
 {
 
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == true && ((Slot)slots.get(new Integer(i))).getCar().getColor().equals(color))
   {  
     System.out.print(", "+((Slot)slots.get(new Integer(i))).getCar().getRegNo());
   }
  }
  System.out.println("\n");
 }

 void slotNumberForCarsWithSpecificColor(String color)
 {
 
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == true && ((Slot)slots.get(new Integer(i))).getCar().getColor().equals(color))
   {
   
     System.out.print(", "+i);
   }
  System.out.println("\n");
  }
 }
 
 void slotNumberForCar(String regno)
 {
  boolean found = false;
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == true && ((Slot)slots.get(new Integer(i))).getCar().getRegNo().equals(regno) )
   {
    found = true;
    System.out.println(i);
   }
  }
  if (!found)
  {
   System.out.println("Not found");
  }

  System.out.println("\n");
 }

 public void checkOutCar(Integer slotNumber)
 {
  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).getSlotNumber().intValue() == slotNumber.intValue())
   {
    System.out.println("Slot number "+ i+" is free");

    slots.put(new Integer(i), new Slot(i,null,false));
   }
  }
  System.out.println("\n");
 }
 
 private void initializeSlots()
 {
  slots = new HashMap();
  for (int i=1; i<=n;i++)
  {
   slots.put(new Integer(i), new Slot(i, null, false));
  }
 }


 public void displayStatus()
 {
  System.out.println("Slot No.\t  \t \t   Registration No \t \t  \t  \t  \t  Colour");

  for (int i=1; i<=n;i++)
  {
   if(((Slot)slots.get(new Integer(i))).isAllocated() == true)
   {
    System.out.println(i+"\t  \t \t "+((Slot)slots.get(new Integer(i))).getCar().getRegNo()+"\t \t  \t  \t  \t "+((Slot)slots.get(new Integer(i))).getCar().getColor()+"\n" );
   }
  }
  System.out.println("\n");
 }
}