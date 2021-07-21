import java.io.*;
import java.util.*;
/*Linear Search, Binary Search contributors Brian, Mamudu, Lyuba*/
/** Merge sort contributors Chris, Marina, Lyuba */
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
		
		// find the smallet index from i to end
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

		return smallIndex;

    } //end findSmallestIndex




    // swap the item at that index and i
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
	for(int i = 0; i < data.size(); i++)
	// and if the value you're searchign for is in the ArrayList, return it.
	{
		if(data.get(i) == value)
		{
			return value;
		}
	}
	return -1; // return -1 if it isn't there.

    }

    /* If you finish the lab early you can get started on this */
  public int binarySearch(int value){

    int lowerIndex = 0;
    int upperIndex = data.size();
    int middleIndex = data.size()/2;
    boolean lowerLessThanUpper = lowerIndex < upperIndex;

    // PSEUDOCODE
    // repeat while lowerIndex less than upperIndex
      // if middleElement == input, return middleElement
      // else
        // if input > middleElement, lowerIndex = middleIndex
        // if input < middle, upperIndex = middleIndex
    // return -1


    /* if upper crosses lower it's not there and the lop should exit the loop
    and if the item is at middle you should exit the loop
    you have to replace the "replacethiswithrealexpression" boolean
    with a correct expression based on lowerIndex and upperIndex
    */
    while (lowerLessThanUpper)
    {
      // update lower and upper.
      // remember if value is less than data.get(middleIndex) you want to search next time
      // from lower to the middle and otherwise from the middle to the upper.
      //
      // then update middleIndex based on new lowerIndex and upperIndex.

      // if middleElement == input, return middleElement
      if(data.get(middleIndex).equals(value)){
        return data.get(middleIndex);
      } else {
        if(value > data.get(middleIndex)){ // if input > middleElement, lowerIndex = middleIndex
          lowerIndex = middleIndex+1;
        } else { // if input < middle, upperIndex = middleIndex
          upperIndex = middleIndex-1;
        }
        middleIndex = (upperIndex - lowerIndex)/2; // update middleIndex
      }
      lowerLessThanUpper = lowerIndex < upperIndex;

    }

    /* replace this return to either return the value if it was found and -1
    if upperIndex and lowerIndex crossed
    */

    return -1; // else/default
  }

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order
    private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
            int i=0; //index of elements in array a
            int j=0; // index of elements in array b
            ArrayList<Integer> result = new ArrayList<Integer>();
			/*
			while(result.size() < a.size() + b.size())
			{
				while(i < a.size() && j < b.size() && a.get(i) <= b.get(j))
				{
					result.add(a.get(i));
					i++;
				}
				while(i < a.size() && j < b.size() && b.get(j) < a.get(i))
				{
					result.add(b.get(j));
					j++;
				}
			}*/
			
            while (result.size() < a.size() + b.size())  {
              System.out.println("i = " + i);
              System.out.println("j = " + j);
			  if(i > a.size() - 1)
			  {
				  result.add(b.get(j));
				  j++;
				  //result.addAll(b);
				  //j = a.size() + b.size();
			  }
			  else if(j > b.size() - 1)
			  {
				  result.add(a.get(i));
				  i++;
				  //result.addAll(a);//
				  //i = a.size() + b.size();
			  }
			  else if (a.get(i) <= b.get(j)){
                System.out.println("a.get(i) = " + a.get(i));
                result.add(a.get(i));    //add element from a list to the resulting list
                  i++;  //increase index in a list
                //end if
              }
			  else {
                System.out.println("b.get(j) = " + b.get(j));
                result.add(b.get(j));   //add element from b list to the resulting list            
                j++;      //increase index in b list
            } //end else


            }//end while loop
			


	         return result;
  }//end merge

    public ArrayList<Integer> msort(ArrayList<Integer> list){
    // base case - if the input ArrayList is smaller than 2 elements
    if ( list.size() < 2){
      System.out.println("base case: " + list);
      return list;
    }
  	// split l into left and right halves
    ArrayList<Integer> left = new ArrayList<Integer>();
  	ArrayList<Integer> right = new ArrayList<Integer>();
    int item = 0;
    int middle = list.size() / 2;
    for (int i = 0; i < middle; i++){
      item = list.get(i);
      left.add(item);
    }
    for (int i = middle; i < list.size(); i++){
      item = list.get(i);
      right.add(item);
    }
  System.out.println("unsorted left list: " + left);
  System.out.println("unsorted right list: " + right);
	// sort the left half
  left = msort(left);
	// sort the right half
  right  = msort(right);
	// merge the two halves that have been sorted
  list = merge(left, right);
  System.out.println("sorted left list: " + left);
  System.out.println("sorted right list: " + right);
	// return the result
  System.out.println("merged list: " + list);
  return list;

    }

    public void msortTest(){
	data = msort(data);
    }
	
	    //make an unsorted list of random integers 0-99;
    public ArrayList<Integer> makeRand(int size){
      ArrayList<Integer> list = new ArrayList<Integer>();
      int newVal = 0;
      for (int i = 0; i < size; i++){
        newVal = r.nextInt(100);
        list.add(newVal);
      }
      return list;
    }
	
//Create a sorted array list of 'size' increasing values,
    private ArrayList<Integer> fillForMerge(int size){
	ArrayList<Integer> a = new ArrayList<Integer>();
	int lastVal = r.nextInt(10);
	for (int i = 0 ; i < size ; i=i+1){
	    a.add(lastVal);
	    lastVal = lastVal + r.nextInt(10);
	}
	return a;

    }
    public void testMerge(){
		/*
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	ArrayList<Integer> b = new ArrayList<Integer>();
    	a = fillForMerge(5);
    	b = fillForMerge(7);
    	System.out.println(a);
    	System.out.println(b);
      ArrayList<Integer> sortedList = merge(a,b);
      System.out.println(sortedList);
	*/
	data = makeRand(10);
	msortTest();

    }

    public String toString(){
	return ""+data;
    };

}
