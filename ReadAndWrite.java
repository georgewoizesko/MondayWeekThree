package com.WeekThreeLabWork;


import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWrite {
	
	ArrayList<String> countriesList = new ArrayList<>();
	String read;
	String write;
	String aCountry;
	
	Path newPath = Paths.get("\\Users\\admin\\WeekTwoWS\\JavaWeekThree\\src\\com\\WeekThreeLabWork\\countries");
	
	File aNewFile = newPath.toFile();
	
	
	
	Scanner sc = new Scanner(System.in);
	

	
	
	public ReadAndWrite(String read, String write) {
		this.read = read;
		this.write = write;
	}

	public ReadAndWrite() {
		
	}
	
	public void reader() {
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile))) {
			
		
			
			while ((aCountry = in.readLine()) != null) {
				
				countriesList.add(aCountry);
				System.out.println(aCountry);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	public void writer(){
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true)))){
			
			write = sc.nextLine();
			out.println(write);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}
	
}
	
	
		

			

		
		
		
				

	

		


