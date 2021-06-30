/*
Michelle P, Benson, Dwayne, Chaouiki, Lyuba
*/

/*
Work: Game of Nim
GOAL:

Be the player to remove the last stone.

RULES:

bag contains 12 stones initially
a move consists of removing 1-3 stones from the bag
YOUR CODING MISSION:

Write a program that will allow a human at console to play against your "AI" a game of NIM.

prompt user for number of stones they wish to remove each turn
tell user how many stones the AI removed and how many stones remain
facilitate play until human or AI wins, and announce winner
*/
import java.io.*;
import java.util.*;
import java.util.Scanner; //not necessary
public class Nim{
  public static void main(String[] args){
    //create variable to store the number of stones
    int stonesRemoved = 0;
    //create variable for current number of stones
    int stonesRemain = 12;
    while (stonesRemain > 0){
      boolean valid = false;
      while (!valid){
      //ask user for number of stones 1-3 out of 12 stones total
      System.out.println("There are " + stonesRemain + " stones, please choose between 1-3");
      //create a scanner class
      Scanner in = new Scanner(System.in);
      //read in stones (nextIn-stones rem)
      stonesRemoved = in.nextInt();
      //check if input until it is valid - use loop
      valid = checkValid(stonesRemain, stonesRemoved);
      if(!valid)
      {
        System.out.println("Invalid entry.");
      }
    }
    //if valid then calculate number of stones left
    stonesRemain -= stonesRemoved;
    //check if user wins 
    if(stonesRemain <= 0 )
    {
      System.out.println("User wins!");
    }
    else     //AI generates random number between 1-3
    {
     // random is in the range 1-3 (including 3). The parentheses are necessary! Source: https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit2-Using-Objects/topic-2-9-Math.html
      int random = (int)(Math.random()*3) + 1;

      //tell user how many stones AI removed and how many remain - print
      System.out.println("AI plays: " + random);
      stonesRemain -= random;
      System.out.println("Remaining: " + stonesRemain );
      if(stonesRemain <= 0)
      {
        System.out.println("AI wins!");
      }
    }
  
    //check winner after each turn; after user and after AI
    //make loop
    }
  }
  public static boolean checkValid(int stonesRemain, int stonesRemoved){
    if (stonesRemoved <= stonesRemain && (stonesRemoved == 3 || stonesRemoved == 2
    || stonesRemoved == 1)){
      return true;
    }
    else return false;
    }
  }