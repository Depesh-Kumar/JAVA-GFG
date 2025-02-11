//If statement

class if {
    public static void main(String args[])
    {
        int i = 10;
        if (i > 15)
            System.out.println("10 is less than 15");
        // This statement will be executed
        // as if considers one statement by default
        System.out.println("I am Not in if");
    }
}

// Java program to illustrate if-else statement

class if {
    public static void main(String args[])
    {
        int i = 10;
        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
    }
}

// Java program to illustrate nested-if statement

class if {
    public static void main(String args[])
    {
        int i = 10;
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println("i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }
    }
}

// Java program to illustrate if-else-if ladder

class if {
    public static void main(String args[])
    {
        int i = 20;
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}

// Java program to illustrate using
// continue in an if statement
class if {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}

// Java program to illustrate using return
class Return {
    public static void main(String args[])
    {
        boolean t = true;
        System.out.println("Before the return.");
        if (t)
            return;
        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");
    }
}