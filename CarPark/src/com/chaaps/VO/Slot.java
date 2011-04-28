/*
 * Project name: CarPark
 * File name: Slot.java
 * File description: The file holds the class Slot.
 * 					 slotNumber, car and allocated being its attributes.
 * Author: Chethan Thimmappa
 * Last Modified date: 20/04/2011
 */

package com.chaaps.VO;


public class Slot
{
       private Integer slotNumber;
       private Car car;
       private boolean allocated ;

       public Slot(int s, Car c, boolean a)
       {
               slotNumber = new Integer(s);
               car = c;
               allocated = a;
       }

       public Integer getSlotNumber()
       {
               return slotNumber;
       }

       public Car getCar()
       {
               return car;
       }

       public boolean isAllocated()
       {
               return allocated;
       }

}
