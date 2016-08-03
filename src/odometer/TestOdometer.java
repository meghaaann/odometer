package odometer;

public class TestOdometer {
	public static boolean testPrevious() {
		int digit = 1235;
		int size = 4;
		if (Odometer.previous(digit, size) != 1234) {
			return false;
		}
		digit = 1234;
		if (Odometer.previous(digit, size) != 6789) {
			return false;
		}
		return true;
	}
	
	public static boolean testNext() {
		int digit = 1234;
		int size = 4;
		if (Odometer.next(digit, size) != 1235) {
			return false;
		}
		digit = 6789;
		if (Odometer.next(digit, size) != 1234) {
			return false;
		}
		return true;
	}
	
	public static boolean testDifference() {
		int digit1 = 1234;
		int digit2=1237;
		int size=4;
		if( Odometer.differenceBetweenOdNumbers(digit1, digit2, size)!=3) {
			return false;
		}
		digit1 = 1234;
		digit2 = 1245;
		if(Odometer.differenceBetweenOdNumbers(digit1, digit2, size)!=6) {
			return false;
		}
		return true;
	}
	
	public static boolean testIsValid() {
		int digit = 1234;
		int size = 4;
		if (Odometer.isValid(digit, size)) {
			return true;
		}
		digit = 6889;
		if (Odometer.isValid(digit, size)) {

			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(testPrevious());
		System.out.println(testNext());
		System.out.println(testDifference());
		System.out.println(testIsValid());
	}
}
