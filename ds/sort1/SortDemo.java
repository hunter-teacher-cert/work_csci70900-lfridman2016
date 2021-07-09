import java.io.*;
import java.util.*;

/*

Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:

Part 1:  X
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.

Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.

Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.

*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    private Random r;

    //Constructor 1 - Loads 15 random numbers into data.
    public SortDemo(){
	data = new ArrayList<Integer>(); //initialize the private ArrayList data
	r = new Random();  //initializing a Random object so that it can generate random numbers
	for (int i=0;i<15;i++){ //loop from 0 to 14 (inclusive), increments by 1
	    data.add(r.nextInt(20)); //generates a random number from 0 to 20 and adds it to the ArrayList data
	} //end for

    } //end SortDemo()

	//Constructor 2 - SortDemo with parameter size - Loads size random integers to data
    public SortDemo(int size){ //takes parameter size
	data = new ArrayList<Integer>(); //initializing data ArrayList
	r = new Random(); //initializing Random object
	for (int i=0;i<size;i++){ //loop from 0 to size - 1 (inclusive) increments by 1
	    data.add(r.nextInt(20));  //generates a random number from 0 to 20 and adds it to the ArrayList data
	} //end for

    } //end SortDemo(int size)
  public int get(int index){
    	return this.data.get(index);
        }
    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end

    */
    public int findSmallestIndex(int start){
	int smallIndex = start;

	// start a variable at the one after start
	// your code here
	for(int i = start; i < data.size(); i++)
	{
	// loop from that variable to end and update smallIndex as needed

	//is the current number smaller than the smallest number so far?
		if( data.get(i) < data.get(smallIndex))
		{
			//update the smallest index
			smallIndex =  i;
		} //end if
	} //end for
	// your code here

	return smallIndex;

    } //end findSmallestIndex


    // find the smallet index from i to end
    // your code here

    // swap the item at that index and i
    // your code here
    //go through the array ArrayList
    //
    public void swap(int Index1, int Index2){
      int TempValue1 = data.get(Index1);
      data.set(Index1,data.get(Index2));
      data.set(Index2,TempValue1);
    }
    public void sort(){
	int i;
	for (i=0;i < data.size()-1; i++){
    int tempSmallest = findSmallestIndex(i); //utilize previous method to find smallest index and assign it a local variable
    swap(tempSmallest, i);



	}
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
	// loop through the ArrayList data
	// and if the value you're searchign for is in the ArrayList, return it.
	// return -1 if it isn't there.


	return 0; // replace this return
    }

    /* If you finish the lab early you can get started on this */
    public int binarySearch(int value){
	boolean replacethiswithrealexpression=false;
	int lowerIndex = 0;
	int upperIndex = data.size();
	int middleIndex = data.size()/2;

	/* if upper crosses lower it's not there and the lop should exit the loop
	   and if the item is at middle you should exit the loop

           you have to replace the "replacethiswithrealexpression" boolean
           with a correct expression based on lowerIndex and upperIndex
	*/
	while (replacethiswithrealexpression)
	    {
		// update lower and upper.
		// remember if value is less than data.get(middleIndex) you want to search next time
		// from lower to the middle and otherwise from the middle to the upper.
		//
		// then update middleIndex based on new lowerIndex and upperIndex.

	    }

	/* replace this return to either return the value if it was found and -1
	   if upperIndex and lowerIndex crossed
	*/

	return 0; // replace this return
    }


    public String toString(){
	return ""+data;
    };

}
