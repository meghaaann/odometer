package odometer;

public class Odometer {
	public static boolean isValid(int number, int size) {
		int digit;
		if (number < Math.pow(10, size - 1) - 1) {
			return false;
		}
		for (int i = 0; i < size - 1; i++) {
			digit = number % 10;
			number = number / 10;
			if (digit <= number % 10)
				return false;
		}
		return true;
	}

	public static int differenceBetweenOdNumbers(int firstNum, int secondNum, int size) {
		int count = 0;
		for (int i = firstNum; i < secondNum; i++) {
			if (isValid(i, size))
				count++;
		}
		return count;
	}

	public static int previous(int digit, int size) {
		do {
			digit--;
			if (digit < 0) {
				digit = (int) Math.pow(10, size) - 1;
			}
		} while (!isValid(digit, size));
		return digit;
	}

	public static int next(int digit, int size) {
		int nextVal = digit+1;
		while (!isValid(nextVal, size)) {
			if (nextVal >= Math.pow(10, size)) {
				nextVal = 1;
			}
			nextVal++;
		}
		return nextVal;
	}

	public static int nAfter(int digit, int n, int size) {
		int counter = 0;
		while (counter < n) {
			digit = next(digit, size);
			counter++;
		}
		return digit;
	}

	public static int nBefore(int digit, int n, int size) {
		int counter = 0;
		while (counter < n) {
			digit = previous(digit, size);
			counter++;
		}
		return digit;
	}
}
