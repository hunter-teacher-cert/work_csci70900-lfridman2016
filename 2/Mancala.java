/** Jovani, Stephannia, Lyuba **/
import java.util.*;

public class Mancala {
int [] playerside = new int [7];
int pman = 0;
int [] compside = new int [7];
int cman = 6;
Scanner scan = new Scanner(System.in);
public void initializeBoard () {
  playerside[pman] = 0;
  compside[cman] = 0;
    for (int i = 1; i < playerside.length; i++){
      playerside[i] = 4;
    }
    for (int i = 0; i < compside.length - 1; i++){
      compside[i] = 4;
    }
}
public void boardDisplay() {
  System.out.println("Welcome to the game of Mancala.");
  System.out.println("The Mancala board looks like: ");
    for (int i = 0; i< playerside.length; i++) {
      System.out.print(playerside[i] + " " );
      }
    System.out.println();
    System.out.println("----------------");
    for (int i = 0; i<compside.length;i++) {
      System.out.print(compside[i] + " ");
    }
    System.out.println();
}

public void playerTurn() {
//give user instructions
//read input
//call method stoneMovement
  System.out.println("Choose which pit you want to move stones.");
  System.out.println("Stones will be moved counter-clockwise from the pit selected.");
    int pitChosen = scan.nextInt();
    stoneMovement(pitChosen, 1);
}
// access arrays
// select player choice pits
// make player choice pit ==0
// add ++1 to each pit counterclockwise
public void stoneMovement(int pitChosen, int turn) {
  int stonesAvail = playerside[pitChosen];
  playerside[pitChosen] = 0;
  int lastIndex = -1;
  boolean endedOnPlayerSide = false;
  for(int i = pitChosen; i >=0 && stonesAvail > 0; i--)
  {
	playerside[i]++;
	if(stonesAvail == 0)
	{
		lastIndex = i;
		endedOnPlayerSide = true;
	}
  }
  for(int i = 0; i < compside.length && stonesAvail > 0; i++)
  {
	  compside[i]++;
	  if(stonesAvail == 0)
	  {
		lastIndex = i;
	  }
  }
  
	//if last stone dropped is into mancala user goes again
	//if last stone is dropped into empty bucket on user side	
    // all opposite stones go into mancala

}
  public static void main (String[] args) {
    Mancala game = new Mancala();
    game.initializeBoard();
    game.boardDisplay();
  }
}