// A naive method based JAVA program
// to check if a number is prime
class isPrime {
	static boolean isPrime(int n)
	{
		// Corner case
		if (n <= 1)
			return false;
		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
	// Driver Program
	public static void main(String args[])
	{
		if (isPrime(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(15))
			System.out.println(" true");
		else
			System.out.println(" false");
	}
}

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class isPrime {	
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i=2; i*i<=n; i++)
		{
			if(n % i == 0)
				return false; 
		}
		return true;
	}
	public static void main (String[] args) {
		
		int n = 65;
		System.out.println(isPrime(n));

	}
}

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class  isPrime{	
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5; i*i<=n; i=i+6)
		{
			if(n % i == 0 || n % (i + 2) == 0)
				return false; 
		}
		return true;
	}
	public static void main (String[] args) {
		
		int n = 1031;

		System.out.println(isPrime(n));
	}
}