package reverseofnumbers;

public class ReverseofDigits {
	
	static int reverseofdigits(int STDIN) {
		int STDOUT = 0;
		while(STDIN > 0) {
			STDOUT = STDOUT * 10 + STDIN % 10;
			STDIN = STDIN / 10;
		}
		return STDOUT;
		
	}

	public static void main(String[] args) {
		
		int STDIN = 21;
		System.out.println("reverse of a number is: " + reverseofdigits(STDIN));

		
	}

}
