//BOOLEAN EXAMPLE

class datatypes {
    public static void main(String args[])
    {
          //Boolean data type is a data type that has one of two possible values (usually denoted true and false).
        // Setting boolean to false and true initially
          boolean a = false;
        boolean b = true;
        // If condition holds
        if (b == true){
            // Print statement
            System.out.println("Hi Geek");
        }
           // If condition holds
          if(a == false){ 
          // Print statement
            System.out.println("Hello Geek");         
        }
    }
}

//BYTE EXAMPLE

class datatypes {
    public static void main(String args[]) {
        byte a = 126;
        // byte is 8 bit value
        System.out.println(a);
        a++;
        System.out.println(a);
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
        // Looping back within the range
        a++;
        System.out.println(a);
    }
}

//FLOAT EXAMPLE

import java.io.*;
class datatypes {
    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing float value
        // float value1 = 9.87;
        // Print statement
        // System.out.println(value1);  gives error loosly conversion.
        float value2 = 9.87f;
        System.out.println(value2);
    }
}

//PRIMITIVE EXAMPLE

class datatypes {
    public static void main(String args[])
    {
        // Creating and initializing custom character
        char a = 'G';
        // Integer data type is generally
        // used for numeric values
        int i = 89;
        // use byte and short
        // if memory is a constraint
        byte b = 4;
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
        short s = 56;
        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;
        // by default fraction value
        // is double in java
        double d = 4.355453532;
        // for float use 'f' as suffix as standard
        float f = 4.7333434f;
        //need to hold big range of numbers then we need this data type
        long l = 12121;
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}