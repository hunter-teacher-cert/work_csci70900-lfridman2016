public class Methods
{
  public boolean isDivisible(int n, int m)
  {
    return (n % m == 0);
  }

  public boolean isTriangle(int a, int b, int c)
  {
    if( a + b < c)
    {
      return false;
    }
    else if( a + c < b)
    {
      return false;
    }
    else if( b + c < a)
    {
      return false;
    }
    else
      return true;

  }

  public int ack(int m, int n)
  {
    if(m ==0)
    {
      return n+1;
    }
    if( m > 0 && n == 0)
    {
      return ack(m - 1, 1);
    }
    else //m > 0 && n > 0), m and n not negative
    {
      return ack(m -1, ack(m, n - 1));
    }
  }

  public static void main(String[] args) {
    
    Methods methods = new Methods();
    System.out.println(methods.isDivisible(8, 2));
    System.out.println(methods.isTriangle(6, 2, 3));

    //used for testing: https://en.wikipedia.org/wiki/Ackermann_function
    System.out.println(methods.ack(1, 2)); //should return 4
    System.out.println(methods.ack(2, 4)); //should return 11
  }
}