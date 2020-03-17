import java.util.Scanner;

import myUtil.utility;
public class Driver {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
//		Sample input no. 1
		utility util = new utility();
		int sample[] = {1,8,6,3,2};
		
		System.out.print("Sample array : " );
		util.printArray(sample, sample.length);
		System.out.print("Splitting highest value of the array : ");
		util.splitHighestValue(sample,sample.length);
		
//		Shifting array to the right
		int sample2[] = {1,2,3,4,5};
		System.out.print("Shifting array : ");
		util.printArray(sample2, sample2.length);
		System.out.print("Insert amount of shift : ");
		int shift = input.nextInt();
		util.shiftRight(sample2, sample2.length, shift);
		System.out.print("\nShifted Array : ");
		util.printArray(sample2,sample2.length);
		
//		Check if an array is symmetric 
//		Symmetric : An array, if transposed, is still the same
		
		int arr2D[][] = {{1,2,3},
						 {4,5,6},
						 {7,8,9}};
		
		if(util.checkSymmetric(arr2D)) {
			System.out.println("True, array is symmetric");
		} else {
			System.out.println("False, array is NOT symmetric");
		}
		
//		Magic squares 
		int arrayLength = 5;
		int magicSquare[][] = new int[arrayLength][arrayLength];
		
		util.createMagicSquareOdd(magicSquare,3);
		util.print2DArray(magicSquare);
		
		
//		util.createMagicSquareSinglyEven();
	}
}
