package Febo;

import java.util.Calendar;

public class LeapYear {

	public static void main(String args[]) {
		 
        System.err.println("Is 2045 a leap year ? : " + isLeapYear(2045));
        System.err.println("Is 2024 a leap year ? : " + isLeapYear(2024));
        System.err.println("Is 2020 a leap year ? : " + isLeapYear(2020));
        System.err.println("Is 2090 a leap year ? : " + isLeapYear(2090));
     
     
        System.err.println("Does 2000 a leap year : " + doesLeapYear(2000));
        System.err.println("Does 2012 a leap year : " + doesLeapYear(2012));
        System.err.println("Does 1990 a leap year : " + doesLeapYear(1990));
        System.err.println("Does 1945 a leap year : " + doesLeapYear(1945));
    }  
 
 
   public static boolean isLeapYear(int year){
       Calendar cal = Calendar.getInstance(); //gets Calendar based on local timezone and locale
       cal.set(Calendar.YEAR, year); //setting the calendar year
       int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
     
       if(noOfDays > 365){
           return true;
       }
     
       return false;
   }
 
 
   public static boolean doesLeapYear(int year){
       return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
   }
}
