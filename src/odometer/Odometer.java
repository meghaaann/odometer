package odometer;

import java.util.Scanner;

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
	
	public static int next(int digit,int size)
	{
		
		int nextVal;
		
		while(isValid(digit))
		{
		nextVal=digit++;
		
		if((digit%10^(size+1))==1)
		{
			nextVal=1;
		}
		}
		return nextVal;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the value");
		Scanner reader = new Scanner(System.in); 
		int digit=reader.nextInt();
	}
}
