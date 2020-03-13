package myUtil;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ArrayStuff {
	static Scanner input = new Scanner(System.in);
	public void initializeArray(int arr[],int arrayLength){
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Element no. " + i + " : ");
			arr[i] = input.nextInt();
		}
	}
	
	public boolean checkElementInArray(int arr[], int arrayLength, int element) {
		for(int i = 0; i < arrayLength; i++){
			if(element == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public int min(int arr[], int arrayLength){
		int minVal = arr[0];
		for(int i = 0; i < arrayLength; i++){
			minVal = arr[i] < minVal ? arr[i] : minVal;
		}
		return minVal;
	}
	public int max(int arr[], int arrayLength){ 
		int maxVal = arr[0];
		for(int i = 0; i < arrayLength; i++){
			maxVal = arr[i] > maxVal ? arr[i] : maxVal;
		}
		return maxVal;
	}
	
	public int sum(int arr[], int arrayLength){
		int total = 0;
		for(int i = 0; i < arrayLength; i++){
			total += arr[i];
		}
		return total;
	}
	public int product(int arr[], int arrayLength){
		int total = 1;
		for(int i = 0; i < arrayLength; i++){
			total *= arr[i];
		}
		return total;
	}
	
	public void printingCertainNumbers(int arr[], int arrayLength){
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
	
	public boolean checkReversed(int arr[], int arrayLength) {
		for(int i = 0; i < arrayLength; i++) {
			if(arr[i] != arr[arrayLength - i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	public void shiftRight(int arr[], int arrayLength) {
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
	
	public void splitHighestValue(int arr[], int arrayLength) {
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
	
	public  void splitMiddle(int inputArr[], int firstOutput[], int secondOutput[]){
//		set the length at main
		int arrayLength = inputArr.length;
		for(int i = 0; i < (arrayLength / 2) - 1; i++) {
			firstOutput[i] = inputArr[i];
		}
		for(int i = (arrayLength / 2); i < arrayLength ; i++) {
			secondOutput[i - (arrayLength / 2)] = inputArr[i];
		}
	}
	
	public void sorter(int arr[], int arrayLength) {
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
				sorted = true;
			}
		}
		
	}
	
	public void printArray(int arr[], int arrayLength){
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
}
