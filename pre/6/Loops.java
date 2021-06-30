public class Loops
{
  //#3 power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.
  public double power(double x, int n)
  {
    if( n== 0 )
    {
      return 1;
    }
    double result = 1;
    for(int i = 0; i < n; i++)
    {
      result *= x;
    }
    return result;
  }

  //#Exercise 4 Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial
  public int factorial(int n)
  {
    int result = 1;
    for(int i = n; i > 0; i--)
    {
      result *= i;
    }
    return result;
  }

  /*
  Exercise 5  
One way to calculate e^x is to use the infinite series expansion:

ex = 1 + x + x2 / 2! + x3 / 3! + x4 / 4! + … 
The ith term in the series is xi / i!.

Write a method called myexp that takes x and n as parameters and estimates e^x by adding the first n terms of this series. You can use the factorial method from Section 6.7 or your iterative version from the previous exercise.
*/

public double myexp(double x, int n)
{
  double result = 0.0;
  for(int i = 0; i <= n; i++)
  {
    result += Math.pow(x, i) / factorial(i);
  }
  return result;
}
/*
You can make this method more efficient if you realize that the numerator of each term is the same as its predecessor multiplied by x, and the denominator is the same as its predecessor multiplied by i. Use this observation to eliminate the use of Math.pow and factorial, and check that you get the same result.
*/
public double myexp2(double x, int n)
{
  double resNum = 1;
  double resDen = 1;
  double result = resNum/resDen;
  for(int i = 1; i <= n; i++)
  {
    resNum *= x;
    resDen *= i;
    result += x/i;
  }
  return result;
}

/*
Write a method called check that takes a parameter, x, and displays x, myexp(x), and Math.exp(x). The output should look something like:
1.0     2.708333333333333     2.718281828459045
You can use the escape sequence "\\t" to put a tab character between columns of a table.
*/

public void check(double x)
{
  System.out.println(x + "\t" + myexp(x, 15) + "\t" + Math.exp(x));
}
  public static void main(String[] args) {
    Loops l = new Loops();
    System.out.println(l.power(2, 3));
    System.out.println(l.factorial(3));
    System.out.println(l.myexp(3, 2));
    System.out.println(l.myexp(3, 2));
    l.check(3);

    /*
    Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and 100.0. How does the accuracy of the result vary as x varies? Compare the number of digits of agreement rather than the difference between the actual and estimated values.
    */
    /*
    Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and -100.0. Comment on the accuracy.
    */
    System.out.println();
    for(double i = .1; i <= 100; i *= 10)
    {
      l.check(i);
    }
    //As x increases the accuracy greatly decreases
  }
}