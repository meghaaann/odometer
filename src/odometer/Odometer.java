package odometer;

public class Odometer {
	public static boolean isValid(int number, int size) {
		int digit;
		for(int i=0;i<size-1;i++) {
			digit=number%10;
			number=number/10;
			if(digit<number%10)
				return false;
		}
		return true;
	}
	
	public static int differenceBetweenOdNumbers(int firstNum,int secondNum,int size) {
		int count=0;
		for(int i=firstNum;i<secondNum;i++){
			if(isValid(i,size))
				count++;
		}
		return count;
	}
	
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
