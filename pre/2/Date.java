import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
        String day = "Saturday"; 
		System.out.println(day);
		int date = 12;
		System.out.println(date);
		String month = "June";
		System.out.println(month);
		int year = 2021;
		System.out.println(year);
		
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
    }
}