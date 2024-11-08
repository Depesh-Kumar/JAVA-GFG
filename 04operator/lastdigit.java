//Last digit of a number in java

import java.math.*;
class GFG {	
	// Find the last digit
	static int lastDigit(int n)
	{
		// return the last digit
		return (n % 10);
	}	
	// Driver program
	public static void main(String args[])
	{
		int n = 98562;
		System.out.println(lastDigit(Math.abs(n)));
	}
}