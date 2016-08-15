package com.WeekThreeLabWork;

import java.util.Scanner;

public class Countries {
	
	
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	String menu = null;
	boolean userInput = true;
	public static void main(String[] args) {
				
		Countries newCountriesRun = new Countries();
		newCountriesRun.runCountries();
	}
		
public void runCountries(){
		
	System.out.println("\n" + menu);
	choice = sc.nextInt();
	
		switch (choice) {
		case 1:ReadAndWrite read = new ReadAndWrite();
			read.reader();
			runCountries();
		case 2:ReadAndWrite write = new ReadAndWrite();
			write.writer();
			runCountries();
		case 3:System.exit(0);
		
		}}
	
	public Countries() {
		menu = "Countries List"
		+ "\nPlease choose one of the following options:"
		+ "\n1. Show Countries"
		+ "\n2. Add Country"
		+ "\n3. Exit";
	}
	

	

}
