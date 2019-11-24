package Febo;

public class Pyramid {

	public static void main(String args[]) {
        System.out.println("Pyramid pattern of star in Java : ");
        drawPyramidType();
        
        System.out.println("Pyramid of numbers in Java : ");
        drawPyramidOfNumbers();
    }

    public static void drawPyramidType() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
 
    public static void drawPyramidOfNumbers() {
        for (int i = 0; i <8; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
	
