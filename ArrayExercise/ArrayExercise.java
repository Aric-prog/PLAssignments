import java.util.Scanner;
import java.util.LinkedHashMap;;

public class index {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String args[]){
		int tenArr[] = new int[10]; 
		int twentyArr[] = new int[20];
		
//		No. 1
		System.out.println("Taking 10 integer and printing it.");
		initializeArray(tenArr,tenArr.length);
		printArray(tenArr,tenArr.length);
		
//		No. 2
		System.out.println("Taking 10 integer and checking if certain element exist.");
		initializeArray(tenArr,tenArr.length);
		System.out.println("What element do you want to check");
		int element = input.nextInt();
		
		if(checkElementInArray(tenArr, tenArr.length, element)) {
			System.out.println("Element is in array");
		}
		else {
			System.out.println("Element is not in array");
		}
		System.out.println();
		
//		No. 3
		System.out.println("Taking 20 integer and printing numbers with certain criterias.");
		initializeArray(twentyArr,twentyArr.length);
		printingCertainNumbers(twentyArr, twentyArr.length);
		System.out.println();
		
//		No. 4
		System.out.println("Using the 10 array to print sum and product of array.");
		System.out.println("Sum : " + sum(tenArr,tenArr.length));
		System.out.println("Product : " + product(tenArr,tenArr.length));
		System.out.println();
		
//		No. 5
		System.out.println("Finding largest and smallest element of array");
		System.out.println("Min : " + min(tenArr,tenArr.length));
		System.out.println("Max : " + max(tenArr,tenArr.length));
		System.out.println();
		
//		No. 6
		System.out.println("Checking if an array is an array is the same when reversed");
		if(checkReversed(tenArr,tenArr.length)) {
			System.out.println("This array is the same when read backwards");
		}
		else {
			System.out.println("This array is not the same when read backwards");
		}
		System.out.println();
		
//		No. 7
		int firstPart[] = new int[tenArr.length/2];
		int secondPart[] = new int[tenArr.length/2];
		System.out.println("Splitting the ten array in the middle ");
		System.out.print("Ten Array : ");
		printArray(tenArr,tenArr.length);
		splitMiddle(tenArr,firstPart,secondPart);
		
		System.out.print("First Part : ");
		printArray(firstPart,firstPart.length);
		System.out.print("Second Part : ");
		printArray(secondPart,secondPart.length);
		
//		No. 8
		int uniqueArr[] = {1,2,7,4,5};
		System.out.print("Splitting highest value of a unique array into two parts ");
		splitHighestValue(uniqueArr,uniqueArr.length);
		System.out.println();
		
//		No. 9
		System.out.println("Shifting an element to the right");
		shiftRight(uniqueArr, uniqueArr.length);
		printArray(uniqueArr, uniqueArr.length);
		
//		No. 10
		sorter(uniqueArr,uniqueArr.length);
		printArray(uniqueArr,uniqueArr.length);
	}
	
	public static void initializeArray(int arr[],int arrayLength){
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Element no. " + i + " : ");
			arr[i] = input.nextInt();
		}
	}
	
	public static boolean checkElementInArray(int arr[], int arrayLength, int element) {
		for(int i = 0; i < arrayLength; i++){
			if(element == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static int min(int arr[], int arrayLength){
		int minVal = arr[0];
		for(int i = 0; i < arrayLength; i++){
			minVal = arr[i] < minVal ? arr[i] : minVal;
		}
		return minVal;
	}
	public static int max(int arr[], int arrayLength){ 
		int maxVal = arr[0];
		for(int i = 0; i < arrayLength; i++){
			maxVal = arr[i] > maxVal ? arr[i] : maxVal;
		}
		return maxVal;
	}
	
	public static int sum(int arr[], int arrayLength){
		int total = 0;
		for(int i = 0; i < arrayLength; i++){
			total += arr[i];
		}
		return total;
	}
	public static int product(int arr[], int arrayLength){
		int total = 1;
		for(int i = 0; i < arrayLength; i++){
			total *= arr[i];
		}
		return total;
	}
	
	public static void printingCertainNumbers(int arr[], int arrayLength){
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("Positive Numbers", 0);
		map.put("Negative Numbers", 0);
		map.put("Odd Numbers", 0);
		map.put("Even Numbers", 0);
		map.put("Zeroes", 0);
		
		for(int i = 0; i < arrayLength; i++) {
			if(arr[i] >= 0) {
				map.replace("Positive Numbers", map.get("Positive Numbers") + 1);
				if(arr[i] == 0) {
					map.replace("Zeroes", map.get("Zeroes") + 1);
				}
			}
			else {
				map.replace("Negative Numbers", map.get("Negative Numbers") + 1);
			}
			
			if(arr[i] % 2 == 1) {
				map.replace("Odd Numbers", map.get("Odd Numbers") + 1);
			}
			else {
				map.replace("Even Numbers", map.get("Even Numbers") + 1);
			}
		}
		System.out.println(map);
	}
	
	public static boolean checkReversed(int arr[], int arrayLength) {
		for(int i = 0; i < arrayLength; i++) {
			if(arr[i] != arr[arrayLength - i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void shiftRight(int arr[], int arrayLength) {
		int tempArr[] = arr.clone();
		for(int i = 0; i < arrayLength; i++) {
			if(i + 1 == arrayLength) {
				arr[0] = tempArr[i];
			}
			else {
				arr[i + 1] = tempArr[i];
			}
		}
	}
	
	public static void splitHighestValue(int arr[], int arrayLength) {
		int arrClone[] = arr.clone();
		int maxVal = max(arr,arrayLength);
		int maxValIndex = 0;
//		gets the index of the max value and replaces the max value of the clone with -1
//		searching the maximum value of the clone will result in the second highest value
		for(int i = 0; i < arrayLength; i++) {
			if(arr[i] == maxVal) {
				maxValIndex = i;
				arrClone[maxValIndex] = -1;
			}
		}
		boolean extraValueAdded = false;
		int secondMaxVal = max(arrClone,arrClone.length);
		int newArr[] = new int[arrayLength + 1];
		for(int i = 0; i < arrayLength; i++) {
			if(extraValueAdded) {
				newArr[i+1] = arr[i];
			}
			else {
				if(i == maxValIndex) {
					newArr[i] = secondMaxVal;
					newArr[i+1] = maxVal - secondMaxVal;
					extraValueAdded = true;
				}
				newArr[i] = arr[i];
			}
		}
		printArray(newArr,newArr.length);
	}
	
	public static void splitMiddle(int inputArr[], int firstOutput[], int secondOutput[]){
//		set the length at main
		int arrayLength = inputArr.length;
		for(int i = 0; i < (arrayLength / 2) - 1; i++) {
			firstOutput[i] = inputArr[i];
		}
		for(int i = (arrayLength / 2); i < arrayLength ; i++) {
			secondOutput[i - (arrayLength / 2)] = inputArr[i];
		}
	}
	
	public static void sorter(int arr[], int arrayLength) {
		boolean sorted = false;
		
		boolean didSwap = false;
		int tempVal = 0;
		
		while(sorted != true) {
			didSwap = false;
			for(int i = 0; i < arrayLength - 1; i++) {
				if(arr[i] > arr[i+1]) {
					tempVal = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = tempVal;
					didSwap = true;
				}
			}
			if(!didSwap) {
				break;
			}
		}
	}
	
	public static void printArray(int arr[], int arrayLength){
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}			
}


