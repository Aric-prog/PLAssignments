public class Loops {
	public static void main(String[] args) {
//		input = 1,2,3,4,5
//		output = 5,4,3,2,1
		
		int a[] = {1,2,3,4,5};
		
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int arrLength = a.length;
		for(int i = 0; i<a.length;i++) {
			a[i] = arrLength - i;
			System.out.print(a[i] + " ");
		}
	}
}
