package Febo;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {

        Scanner commandReader = new Scanner(System.in);
        System.out.println("Welcome to Java Program to perform binary search on int array");
        System.out.println("Enter total number of elements : ");
        int length = commandReader.nextInt();
        int[] input = new int[length];

        System.out.printf("Enter %d integers %n", length);
        for (int i = 0; i < length; i++) {
            input[i] = commandReader.nextInt();
        }

        System.out.println("Please enter number to be searched in array (sorted order)");
        int key = commandReader.nextInt();

        int index = performBinarySearch(input, key);

        if (index == -1) {
            System.out.printf("Sorry, %d is not found in array %n", key);
        } else {
            System.out.printf("%d is found in array at index %d %n", key,
                                                         index);
        }

        commandReader.close();

    }

    public static int performBinarySearch(int[] input, int number) {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            } else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }

}