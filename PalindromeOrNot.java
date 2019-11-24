
/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
package Febo;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String args[]){
	       
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
	 public static boolean isPalindrome(int number) {
	        int palindrome = number; // copied number into variable
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }
	
	        if (number == reverse) {
	            return true;
	        }
	        return false;
	    }

	}


