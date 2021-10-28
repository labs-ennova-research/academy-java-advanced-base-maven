package com.ennova_research.academy.basemaven.exercise;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Alberto Ielpo 
 */
public class ExerciseThree {
	/**
	 * Example
	 * Input 5,2
	 * Output 36
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		try {
		    System.out.println("Enter day and month:");
		    String dayMonth = myObj.nextLine();  // Read user input
		    if(dayMonth == null || dayMonth.length() == 0) {
		    	System.out.println("Check your input");
		    } else {
		    	String[] dm = dayMonth.split(",");
		    	var localDate  = LocalDate.of(2021, Integer.valueOf(dm[1]), Integer.valueOf(dm[0]));
		    	System.out.println(String.format("È il giorno %s dell'anno", localDate.getDayOfYear()));
		    }
	    } catch (Exception e) {
	    	System.out.println("Something goes wrong...");
	    	System.out.println(e);
	    } finally {
	    	myObj.close();
	    }
	}
}
