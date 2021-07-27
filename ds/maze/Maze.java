import java.io.*;
import java.util.*;

public class Maze{

    private char[][] board;
    private int rows = 25;
    private int cols = 85;

    private String clearScreen="[0;0H\n";

    private void delay(int n)
    {
	try 
	    {Thread.sleep(n);} 
	catch(InterruptedException e)
	    {}
    }

    public Maze(String filename){
	try{
	    board = new char[cols][rows];
	    int row = 0;
	    int col = 0;

	    for (row = 0; row < rows; row++){
		for (col = 0; col < cols ; col++){
		    board[col][row] = ' ';
		}
	    }
	    
	
	    File file = new File(filename);
	    FileReader reader = new FileReader(file);
	    BufferedReader breader = new BufferedReader(reader);
	    
	    String line;
	    row = 0;
	    while( (line=breader.readLine()) != null )  {
		for (col = 0; col < line.length()-1 ; col++){
		    board[col][row] = line.charAt(col);
		}
		row++;
	    }
	    
	} catch (IOException e){
	    e.printStackTrace();
	}
	
    
    }

    public String toString(){
	int row,col;
	String result = "";
	for (row = 0; row < rows; row++){
	    for (col = 0; col < cols; col++){
		result = result + board[col][row];
	    }
	    result = result +"\n";
	}
	return result;
    }

    public boolean solve(int col,int row){
		delay(500);
		System.out.println(clearScreen + this);
		boolean solved = false;
	//off the array - return false
	//base cases
		//at end - return true
		if(board[row][col] == '$')
			return true;
		//at wall - return false, at previously visited - return false
		if(board[row][col] == ' ' || board[row][col] == 'Z')
			return false;
	//recursive case
		//mark visited current path
		board[row][col] = 'Z';
		//return solve(neighbors)
		solved = solve(col+1, row);
		if(!solved)
			solved = solve(col-1, row);
		if(!solved)
			solved = solve(col, row-1);
		if(!solved)
			solved = solve(col, row+1);
		//mark visited backtracking
		board[row][col] = '.';
		return solved;
    }

}
