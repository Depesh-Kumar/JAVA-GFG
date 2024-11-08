//CLASS LEVEL SCOPE  (MEMBER VARIABLE)

public class scope
{
    // All variables defined directly inside a class 
    // are member variables
    int a;
    private String b;
    void method1() {....}
    int method2() {....}
    char c;
}

//METHOD LEVEL SCOPE (LOCAL VARIABLES)

public class scope
{
    void method1() 
    {
       // Local variable (Method level scope)
       int x;
    }
}

class scope
{
    private int x;
    public void setX(int x)
    {
        this.x = x;
    }
}

//EXAMPLE

public class scope
{
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        Test t = new Test();
        this.x = 22;
        y = 44;
        System.out.println("Test.x: " + this.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }
    public static void main(String args[])
    {
        Test t = new Test();
        t.method1(5);
    }
}

//BLOCK SCOPE

public class scope
{
    public static void main(String args[])
    {
        {
            // The variable x has scope within
            // brackets
            int x = 10;
            System.out.println(x);
        }
        // Uncommenting below line would produce
        // error since variable x is out of scope.

        // System.out.println(x); 
    }
}

//example ERROR

class Test
{
    public static void main(String args[])
    {
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
        // Will produce error
        System.out.println(x);
    }
}

//CORRECT WAY OF ABOVE CODE

class Test
{
    public static void main(String args[])
    {
        int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
       System.out.println(x);
    }
}

//EXAMPLE

class Test {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}
