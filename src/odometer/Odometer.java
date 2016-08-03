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
}
