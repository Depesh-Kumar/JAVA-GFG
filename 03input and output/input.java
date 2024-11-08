//Scanner input

import java.util.Scanner;
public class input
{
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        // String input
        String name = sc.nextLine();
        // Character input
        char gender = sc.next().charAt(0);
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}

//Scaanner input example

import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        // Initialize sum and count of input elements
        int sum = 0, count = 0;
        // Check if an int value is available
        while (sc.hasNextInt())//breaks when a char is added in input stream
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);
    }
}


// Java Program to Illustrate BufferedReader Class

import java.io.*;

// Main class
class input {

    // Main driver method
    public static void main(String args[])
        throws IOException
    {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have entered:- " + a
                          + " and name as " + b);
    }
}

//Java Program to Illustrate Scanner Class

// Importing Scanner class from
// java.util package
import java.util.Scanner;

// Main class
class input {

    // Main driver method
    public static void main(String args[])
    {

        // Creating object of Scanner class to
        // read input from keyboard
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an integer");

        // Using nextInt() to parse integer values
        int a = scn.nextInt();

        System.out.println("Enter a String");

        // Using nextLine() to parse string values
        String b = scn.nextLine();

        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);
    }
}

//BUFFERED READER EXAMPLE

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        // Reading data using readLine
        String name = reader.readLine();
        // Printing the read line
        System.out.println(name);
    }
}

//USING SCANNER CLASS

import java.util.Scanner;
class GetInputFromUser {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string " + s);
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}

//USING CONSOLE CLASS

public class Sample {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();
        System.out.println("You entered string " + name);
    }
}

//USING COMMAND LINE ARGUMENT

class Hello {
    public static void main(String[] args)
    {
        // check if length of args array is
        // greater than 0
        if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");

            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
    }
}