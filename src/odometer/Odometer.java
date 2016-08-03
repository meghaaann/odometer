package odometer;

public class Odometer {
	public static int previous(int digit, int size) {
		do {
			digit--;
			if (digit<0) {
				digit = (int) Math.pow(10, size) - 1;
			}
		}
		while (!isValid(digit, size))
		return digit;
	}
	
	public static int nAfter(int digit, int n, int size) {
		int counter = 0;
		while (counter < n) {
			digit = next(digit, size);
		}
		return digit;
	}
	
	public static int nBefore(int digit, int n, int size) {
		int counter = 0;
		while (counter < n) {
			digit = previous(digit, size);
		}
		return digit;
	}
}
