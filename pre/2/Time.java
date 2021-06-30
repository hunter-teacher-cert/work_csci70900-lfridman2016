import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
        int shour = 8; 
		int sminute = 34;
		int ssecond = 50;

        int hour = 8; 
		int minute = 40;
		int second = 33;
		
		int secsSinceMidnight = second + 60 * minute + 60 * 60 * hour;
		System.out.println("Seconds since midnight " + secsSinceMidnight);
		
		double percentageDayPassed = 100 * secsSinceMidnight / (60 * 60 * 24.0);
		System.out.println("Percentage day passed " + percentageDayPassed);
		
		int elapsedTime = (hour * 60 * 60 + minute * 60 + second) - (shour * 60 * 60 + sminute * 60 + ssecond);
		System.out.println("Elapsed seconds since start " + elapsedTime); 
    }
}