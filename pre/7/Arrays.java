import java.util.Random;

public class Arrays
{
  /** Helper methods from Think Java */
  public static void printArray(int[] a) {
      System.out.print("{" + a[0]);
      for (int i = 1; i < a.length; i++) {
          System.out.print(", " + a[i]);
      }
      System.out.println("}");
  }

    public static void printArray(double[] a) {
      System.out.print("{" + a[0]);
      for (int i = 1; i < a.length; i++) {
          System.out.print(", " + a[i]);
      }
      System.out.println("}");
  }

  public static int[] randomArray(int size) {
      Random random = new Random();
      int[] a = new int[size];
      for (int i = 0; i < a.length; i++) {
          a[i] = random.nextInt(100);
      }
      return a;
  }  

  /* #1 write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.*/
  public static double[] powArray(double []a, int exp)
  {
    double []result = new double[a.length];
    for(int i = 0; i < a.length; i++)
    {
      result[i] = Math.pow(a[i], exp);
    }
    return result;
  }
  /*
  write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.
*/
  public static int[] histogram(int[] scores, int numCounters)
  {
    int[] hist = new int[numCounters];
    for(int score:scores)
    {
      hist[score]++;
    }
    return hist;
  }

  /* 4 Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?
  No, you cannot write this using a foreach loop because foreach loops do not allow you to keep track of the index as you iterate through the array.
  */
  public static int indexOfMax(int[] array)
  {
    int max = array[0];
    int maxIndex = 0;
    for(int i = 1; i < array.length; i++)
    {
      if(array[i] > max)
      {
        max = array[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  /* 5 Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
  */
  public static boolean isPrime(int n)
  {
    for(int i = 1; i < n/2; i++)
    {
      if(n%i == 0)
        return false;
    }
    return true;
  }
  public static boolean[] sieve(int n)
  {
    boolean []sieve = new boolean[n];
    for(int i = 0; i < n; i++)
    {
      if(isPrime(i))
        sieve[i] = true;
      else
        sieve[i] = false;  
    }
    return sieve;
  }

    public static void main(String[] args) {
    int[] randomNums = Arrays.randomArray(100);  
    Arrays.printArray(randomNums);
    double []doubleArray = new double[randomNums.length];
    for (int i=0; i<randomNums.length; ++i)
      doubleArray[i] = (double) randomNums[i]; 
    Arrays.printArray(Arrays.powArray(doubleArray, 2));
    Arrays.printArray(Arrays.histogram(randomNums, 100));
    System.out.println("Max index " + Arrays.indexOfMax(randomNums));
  }
}