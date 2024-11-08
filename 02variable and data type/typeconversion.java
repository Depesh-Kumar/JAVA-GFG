//AUTOMATIC TYPE CONVERSION

class typeconversion {

	// Main driver method
	public static void main(String[] args)
	{
		int i = 100;

		// Automatic type conversion
		// Integer to long type
		long l = i;

		// Automatic type conversion
		// long to float type
		float f = l;

		// Print and display commands
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
	}
}

//EXPLICIT TYPE CONVERSION

public class typeconversion {
	// Main driver method
	public static void main(String[] args)
	{
		// Double datatype
		double d = 100.04;
		// Explicit type casting by forcefully getting
		// data from long datatype to integer type
		long l = (long)d;
		// Explicit type casting
		int i = (int)l;
		// Print statements
		System.out.println("Double value " + d);
		// While printing we will see that
		// fractional part lost
		System.out.println("Long value " + l);
		// While printing we will see that
		// fractional part lost
		System.out.println("Int value " + i);
	}
}

//DOUBLE TO BYTE

class typeconversion {
	// Main driver method
	public static void main(String args[])
	{
		// Declaring byte variable
		byte b;
		// Declaring and initializing integer and double
		int i = 257;
		double d = 323.142;
		// Display message
		System.out.println("Conversion of int to byte.");
		// i % 256
		b = (byte)i;
		// Print commands
		System.out.println("i = " + i + " b = " + b);
		System.out.println(
			"\nConversion of double to byte.");
		// d % 256
		b = (byte)d;
		// Print commands
		System.out.println("d = " + d + " b= " + b);
	}
}
