/*
 * Project name: CarPark
 * File name: CarParking.java
 * File description: The file holds the class CarParking which contains the
 * 					 main(). 
 * Author: Chethan Thimmappa
 * Last Modified date: 20/04/2011
 */

package com.chaaps.carparking;

import com.chaaps.VO.*;
import java.io.*;
import java.util.*;

public class CarParking
{

 public static void main(String [] args)
 {
  TicketIssuer ticketIssuer  = null;
  BufferedReader reader = null;
  StringTokenizer st = null;
  if (args.length > 0)
  {
   try
   {
    reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File (args[0]))));
   }
   catch(Exception e)
   {
    System.out.println("unable to find file!!");
   }
  }
  else
  {

   reader = new BufferedReader(new InputStreamReader(System.in));
  }
  String command = null;

  try
  {
	  do
	  {
	  command = reader.readLine();

	  if (command!=null && !"".equals(command))
	  {
	  st = new StringTokenizer(command);
	  command = st.nextToken();
	  }
	  if ("create_parking_lot".equals(command))
	  {
	  ticketIssuer = TicketIssuer.getInstance(st.nextToken());
	  }
	  else if (ticketIssuer != null)
	  {
	  if ("park".equals(command))
	  {
	  ticketIssuer.issueTicket(new Car(st.nextToken(), st.nextToken()));
	  }
	  else if ("leave".equals(command))
	  {
	  ticketIssuer.checkOutCar(new Integer (st.nextToken()));
	  }
	  else if ("status".equals(command))
	  {
	  ticketIssuer.displayStatus();
	  }
	  else if ("registration_numbers_for_cars_with_colour".equals(command))
	  {
	  ticketIssuer.sameColorCars(st.nextToken());
	  }
	  else if ("slot_numbers_for_cars_with_colour".equals(command))
	  {
	  ticketIssuer.slotNumberForCarsWithSpecificColor(st.nextToken());
	  }
	  else if ("slot_number_for_registration_number".equals(command))
	  {
	  ticketIssuer.slotNumberForCar(st.nextToken());
	  }
	  else if ("exit".equals(command))
	  {
	  System.exit(0);
	  }
	  else
	  {
	  if (command!=null && !"".equals(command))
	  System.out.println("invalid input!!!");
	  if (command==null)
	  System.exit(0);

	  }
	  }
	  else
	  {
	  System.out.println("Please create car park first!!!");
	  }
	  } while (true);
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.println("somthing wrong which is not handled!!");

  }
 }
}
