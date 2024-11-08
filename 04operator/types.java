//Terniary operator :-   condition ? if true : if false

public class types {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 30, result;
        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);
    }
}

//Instance of()

class types {
    public static void main(String[] args)
    {
        Person obj1 = new Person();
        Person obj2 = new Boy();
        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "+ (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "+ (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "+ (obj2 instanceof MyInterface));
    }
}
class Person {
}
class Boy extends Person implements MyInterface {
}
interface MyInterface {
}

//Example

public class operators {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        // prints a+(b/d)
        System.out.println("a+b/d = " + (a + b / d));
        // if same precedence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = " + (a + b * d - e / f));
    }
}

//Example2

public class operators {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 0;
        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b++ + c;
        System.out.println("Value of a(b+c), "+ " b(b+1), c = " + a + ", " + b+ ", " + c);
        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
    }
}

//Example3

public class operators {
    public static void main(String[] args)
    {
        int x = 5, y = 8;
        // concatenates x and y as
        // first x is added to "concatenation (x+y) = "
        // producing "concatenation (x+y) = 5"
        // and then 8 is further concatenated.
        System.out.println("Concatenation (x+y)= " + x + y);
        // addition of x and y
        System.out.println("Addition (x+y) = " + (x + y));
    }
}