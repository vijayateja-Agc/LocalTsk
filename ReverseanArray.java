package Febo;

import java.util.Arrays;

public class ReverseanArray {

	 public static void main(String args[]){
	       
	        String[] names = {"vijaya teja" ,"sai ", "bhavani", "lakshmi" , " Bhadram "};
	        System.out.println("original array: " + Arrays.toString(names) );
	       
	        reverse(names);
	        System.out.println("reversed array: " + Arrays.toString(names) );
	       
	        String[] test = {" print my family "};
	        System.out.println("original array: " + Arrays.toString(test) );
	       
	        reverse(test);
	        System.out.println("reversed array: " + Arrays.toString(test) );
	    }

	  
	    public static void reverse(String[] array) {

	        if (array == null || array.length < 2) {
	            return;
	        }

	        for (int i = 0; i < array.length / 2; i++) {
	            String temp = array[i];
	            array[i] = array[array.length - 1 - i];
	            array[array.length - 1 - i] = temp;
	        }

	    }

	}
