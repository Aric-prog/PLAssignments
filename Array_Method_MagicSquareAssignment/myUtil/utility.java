package myUtil;

public class utility {
	
	public void printArray(int arr[], int arrayLength){
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	
	public int max(int arr[], int arrayLength){ 
		int maxVal = arr[0];
		for(int i = 0; i < arrayLength; i++){
			maxVal = arr[i] > maxVal ? arr[i] : maxVal;
		}
		return maxVal;
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
				else {
					newArr[i] = arr[i];
				}
			}
		}
		printArray(newArr,newArr.length);
	}
	
	public void shiftRight(int arr[], int arrayLength, int shiftAmount) {
		for(int j = 0; j < shiftAmount; j++) {
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
	}
	
	public void print2DArray(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public boolean checkSymmetric(int arr[][]) {
		int arrClone[][] = new int[arr.length][arr[0].length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arrClone[i][j] = arr[j][i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arrClone[i][j] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void createMagicSquareOdd(int arr[][]) {
		boolean done = false;
		int currentNumber = 1;
		
		int xLength = arr.length;
		int yLength = arr[0].length;
		
		int y = 0;
		int x = (arr[0].length / 2);
		while(!done) {
			arr[y][x] = currentNumber;
			if(checkValid(x + 1,xLength) && checkValid(y - 1, yLength)) {
				if(arr[y - 1][x + 1] != 0) {
					y += 1;
				} else {
					x += 1;
					y -= 1;
				}
			} else {
				x += 1;
				y -= 1;
				
				if(x > xLength - 1 && y < 0) {
					x -= 1;
					y += 2;
				}
				else if(x > xLength - 1) {
					x = 0;
				}
				else if(y < 0) {
					y = yLength - 1;
				}
				
			}
			
			if(currentNumber == xLength * yLength) {
				done = true;
			}
			currentNumber++;
		}
	}
	
	public void createMagicSquareOdd(int arr[][], int startIncrement) {
		boolean done = false;
		int currentNumber = 1 + startIncrement;
		
		int xLength = arr.length;
		int yLength = arr[0].length;
		
		int y = 0;
		int x = (arr[0].length / 2);
		while(!done) {
			arr[y][x] = currentNumber;
			if(checkValid(x + 1,xLength) && checkValid(y - 1, yLength)) {
				if(arr[y - 1][x + 1] != 0) {
					y += 1;
				} else {
					x += 1;
					y -= 1;
				}
			} else {
				x += 1;
				y -= 1;
				
				if(x > xLength - 1 && y < 0) {
					x -= 1;
					y += 2;
				}
				else if(x > xLength - 1) {
					x = 0;
				}
				else if(y < 0) {
					y = yLength - 1;
				}
				
			}
			
			if(currentNumber == (xLength * yLength + startIncrement)) {
				done = true;
			}
			currentNumber++;
		}
	}
	
	public void createMagicSquareSinglyEven(int arr[][]) {
//						0,0 is the starting point of the slice, while the second element is the end point
//						y,x
		
//		Divides the full grid into 4, where you
		int sliceA[][] = {{0,0},{arr.length / 2 - 1,arr[0].length / 2 - 1}};
		int sliceC[][] = {{0,arr.length / 2},{arr.length / 2 - 1, arr[0].length}};
		int sliceD[][] = {{arr.length/2, 0},{arr.length/2 , arr[0].length / 2}};
		int sliceB[][] = {{arr.length/2, arr[0].length / 2},{arr.length, arr[0].length}};
		
		
	}
	
	
	
	public boolean checkValid(int a, int aLength) {
		return (a >= 0 && a < aLength);
	}
}

