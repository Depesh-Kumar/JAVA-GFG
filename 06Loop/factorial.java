// Java program to find factorial of given number
class factorial
{
// Method to find factorial of given number
static int factorial(int n)
{
int res = 1, i;
for (i=2; i<=n; i++)
res *= i;
return res;
}
// Driver method
public static void main(String[] args)
{
int num = 5;
System.out.println("Factorial of "+ num + " is " + factorial(5));
}
}

// Java program to find factorial of given number
class factorial
{
// method to find factorial of given number
static int factorial(int n)
{
if (n == 0)
return 1;
return n*factorial(n-1);
}
// Driver method
public static void main(String[] args)
{
int num = 5;
System.out.println("Factorial of "+ num + " is " + factorial(5));
}
}