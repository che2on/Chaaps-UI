/*
 * Project name: CarPark
 * File name: Car.java
 * File description: The file holds the class Car.
 * 					 regNo and color being its attributes.
 * Author: Chethan Thimmappa
 * Last Modified date: 20/04/2011
 */

package com.chaaps.VO;


public class Car
{
       private String regNo;
       private String color;
       public Car(String r, String c)
       {
               setRegNo(r);
               setColor(c);
       }
       public String getRegNo()
       {
               return regNo;
       }

       public String getColor()
       {
               return color;
       }

       public void setRegNo(String r)
       {
               regNo = r;
       }
       public void setColor(String c)
       {
               color = c;
       }
}