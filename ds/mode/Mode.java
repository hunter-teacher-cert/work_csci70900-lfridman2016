import java.io.*;
import java.util.*;



public class Mode{
    private ArrayList<Integer> inputData;
    private Random r;
    public Mode(){
	r = new Random();
	inputData = new ArrayList<Integer>();
	
	for (int i=0; i < 20; i++){
	    inputData.add(r.nextInt(20));
	}
    }
    public Mode(int size){
	r = new Random();
	inputData = new ArrayList<Integer>();
	
	for (int i=0; i < size; i++){
	    inputData.add(r.nextInt(50));
	}
    }

    /**
     * Warmup 1
     Find and return the smallest value in  InputData.
    */

    public int findSmallestValue(){
      int smallest= inputData.get(0);
      for(int i=1; i<inputData.size(); i++)
      {
       if (smallest > inputData.get(i)){
         smallest = inputData.get(i);
       }
      }

	return smallest;
	
    }
	
    /**
     * Warmup 2
     Returns the frequency of value in inputData, that is, how often value appears
    */
    public int frequency(int value){
      int count=0;
      for(int i=0; i<inputData.size(); i++){
        if (inputData.get(i)==value){
          count++;
        }
      }
	  return count;
    }

    /**
     * 
     This function should calculate and return the mode of inputData. 
     The mode is the value that appears most frequently so if inputData contained
     5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times. 
     If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
     either of them (the 5 or the 9).
     Note: you will probably use the frequency function you wrote in
     this solution but not findSmallestValue. the findSmallestValue
     function will help you find a strategy for approaching finding the mode.
    */
    public int calcMode(){
    //declare and initialize largestFreq and largestFreqVal to be the freq and value of the first element
      int largestFreq=frequency(inputData.get(0));
      int largestFreqVal=inputData.get(0);

    //loop through the ArrayList
      for(int i=1; i<inputData.size(); i++){
        //store frequency of the current element in a variable
        int currentFreq=frequency(inputData.get(i));
        if(largestFreq<currentFreq){
          largestFreq=currentFreq;
          largestFreqVal=inputData.get(i);
        }
      }
    //check if the frequency of the current element is greater than the largestFrequency, update largestFrequency and largestFreqVal

	    return largestFreqVal;
    }
    public String toString(){
	return ""+inputData;
    }
}