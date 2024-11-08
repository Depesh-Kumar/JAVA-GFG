public class switch_case {

    // Main driver method
    public static void main(String[] args)
    {
        int day = 5;
        String dayString;
        // Switch statement with int data type
        switch (day) {
        // Case
        case 1:
            dayString = "Monday";
            break;
        // Cas
        case 2:
            dayString = "Tuesday";
            break;
            // Case
        case 3:
            dayString = "Wednesday";
            break;
            // Case
        case 4:
            dayString = "Thursday";
            break;
        // Case
        case 5:
            dayString = "Friday";
            break;
            // Case
        case 6:
            dayString = "Saturday";
            break;
            // Case
        case 7:
            dayString = "Sunday";
            break;
        // Default case
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}

//Switch without break

public class switch_case {
    // main driver method
    public static void main(String[] args)
    {
        int day = 2;
        String dayType;
        String dayString;
        // Switch case
        switch (day) {
        // Case
        case 1:
            dayString = "Monday";
            break;
        // Case
        case 2:
            dayString = "Tuesday";
            break;
            // Case
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
        switch (day) {
            // Multiple cases without break statements
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;
        default:
            dayType = "Invalid daytype";
        }
        System.out.println(dayString + " is a " + dayType);
    }
}

//Nested switch case

public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String Branch = "CSE";
        int year = 2;
        // Switch case
        switch (year) {
        // Case
        case 1:
            System.out.println("elective courses : Advance english, Algebra");
            // Break statement to hault execution here
            // itself if case is matched
            break;
            // Case
        case 2:
            // Switch inside a switch
            // Nested Switch
            switch (Branch) {
            // Nested case
            case "CSE":
            case "CCE":
                System.out.println("elective courses : Machine Learning, Big Data");
                break;
            // Case
            case "ECE":
                System.out.println("elective courses : Antenna Engineering");
                break;
                // default case
                // It will execute if above cases does not
                // execute
            default:
                // Print statement
                System.out.println(
                    "Elective courses : Optimization");
            }
        }
    }
}

//Use of enum

public class GFG {
    // Enum
    public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat }
    // Main driver method
    public static void main(String args[])
    {
        // Enum
        Day[] DayNow = Day.values();
        // Iterating using for each loop
        for (Day Now : DayNow) {
            // Switch case
            switch (Now) {
            // Case 1
            case Sun:
                System.out.println("Sunday");
                // break statement that hault further
                // execution once case is satisfied
                break;
            // Case 2
            case Mon:
                System.out.println("Monday");
                break;
            // Case 3
            case Tue:
                System.out.println("Tuesday");
                break;
            // Case 4
            case Wed:
                System.out.println("Wednesday");
                break;
            // Case 5
            case Thu:
                System.out.println("Thursday");
                break;
            // Case 6
            case Fri:
                System.out.println("Friday");
                break;
            // Case 7
            case Sat:
                System.out.println("Saturday");
                break;
            }
        }
    }
}

//String in switch-case

public class switch_case {
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String str = "two";
        // Switch statement over above string
        switch (str) {
        // Case 1
        case "one":
            // Print statement corresponding case
            System.out.println("one");

            // break keyword terminates the
            // code execution here itself
            break;
        // Case 2
        case "two":
            // Print statement corresponding case
            System.out.println("two");
            break;
        // Case 3
        case "three":

            // Print statement corresponding case
            System.out.println("three");
            break;
        // Case 4
        // Default case
        default:
            // Print statement corresponding case
            System.out.println("no match");
        }
    }
}

public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        // Null string is passed
        String str = "";
        // Switch statement over above string
        switch (str) {
        // Case 1
        case "one":
            // Print statement corresponding case
            System.out.println("one");
            // break keyword terminates the
            // code execution here itself
            break;
        // Case 2
        case "two":
            // Print statement corresponding case
            System.out.println("two");
            break;
        // Case 3
        case "three":
            // Print statement corresponding case
            System.out.println("three");
            break;
        // Case 4
        // Default case
        default:
            // Print statement corresponding case
            System.out.println("no match");
        }
    }
}