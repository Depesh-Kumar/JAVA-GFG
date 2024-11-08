// Java program to illustrate using
// break to exit a loop
class continue_break {
	public static void main(String args[])
	{
		// Initially loop is set to run from 0-9
		for (int i = 0; i < 10; i++) {
			// terminate loop when i is 5.
			if (i == 5)
				break;
			System.out.println("i: " + i);
		}
		System.out.println("Loop complete.");
	}
}

// Java program to demonstrates the continue
// statement to continue a loop
class continue_break {
	public static void main(String args[])
	{
		for (int i = 0; i < 10; i++) {
			// If the number is 2
			// skip and continue
			if (i == 2)
				continue;
			System.out.print(i + " ");
		}
	}
}