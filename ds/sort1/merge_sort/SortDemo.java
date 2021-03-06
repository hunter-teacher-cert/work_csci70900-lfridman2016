import java.io.*;
import java.util.*;

/*

Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:

Part 1:
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


    public SortDemo(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}

    }

    public SortDemo(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}

    }

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

	// loop from that variable to end and update smallIndex as needed
	// your code here
	int i;
	for (i = smallIndex + 1; i < this.data.size(); i++){

	    if (this.data.get(i) < this.data.get(smallIndex)){
		smallIndex = i;
	    }

	}
	return smallIndex;
    }


    public void sort(){
	int i;
	int smallIndex;
	int tmp;
	for (i=0;i < data.size()-1; i++){
	    smallIndex = findSmallestIndex(i);
	    tmp = data.get(smallIndex);
	    data.set(smallIndex,data.get(i));
	    data.set(i,tmp);
	}
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){


	return 0; // replace this return
	}

	/* If you finish the lab early you can get started on this */
	public int binarySearch(int value){
	    return 0;

	}


    public String toString(){
	return ""+data;
    };

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



}