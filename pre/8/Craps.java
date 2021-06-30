import java.util.Random;

public class Craps
{
/*roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive.*/ 
public static int roll(int max)
{
  Random random = new Random();
  int rand = random.nextInt(max - 1);
  rand++; //to change range to 1 to max inclusive
  return rand;
}


/*There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.  */
public static int shoot(int dice, int max)
{
  int total = 0;
  for(int i = 0; i < dice; i++)
  {
    total += roll(max);
  }
  return total;
}

/*The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.*/
/** @return true if wins, false if loses */
public static boolean round()
{
  int turn = shoot(2, 6);
  int point = -1;
  System.out.println("Roll " + turn);
  while( true )
  {
    if(turn == 2 || turn == 3 || turn == 12)
    {
      return false;
    }
    else if(turn == 7 || turn == 11)
    {
      return true;
    }
    else
    {
      /* the value he rolled is now called the Point
  the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses. */
      point = turn;
      turn = shoot(2, 6);
    }
  }
}

  public static void main(String[] args) {
    int numRounds = 3;
    if(args.length > 0 && args[0] != null)
    {
      numRounds = Integer.parseInt(args[0]);
    }
    /*
    The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.*/
    for(int i = 0; i < numRounds; i++)
    {
      System.out.println("Round " + (i+1) + " " + Craps.round());
    }
  }


}