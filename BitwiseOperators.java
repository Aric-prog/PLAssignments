public class Asciis {
	public static void main(String[] args) {
//			uppercase to lowercase
		int maskU = '\u0020';
		int uc = 'B';
		int lc = uc | maskU;
		
		System.out.printf("%c",lc);
		
//			ascii to digit
		int maskA = '\u000F';
		int asciiNum = '2';
		int digitNum = asciiNum & maskA;
		System.out.println(digitNum);
		
//			digit to ascii
		int maskD = '\u0030';
		int asc = 2;
		int dig = asc | maskD;
		System.out.println(dig);
	}
}
