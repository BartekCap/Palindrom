package com.capgemini.palindrom.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithoutRekursion {
	

	public static void main(String[] args) {
		checkIfItIsPalindrom();
	}
	
	public static void checkIfItIsPalindrom(){
		String inputString = getInputString();
		inputString = deleteWhiteSings(inputString);
		inputString = deleteUpperCase(inputString);
		
		String palindrom = inputString;
		palindrom = reverseString(palindrom);
		
		if(inputString.equals(palindrom)){
			System.out.println("To jest palindrom");
		}
		else{
			System.out.println("To nie jest palindrom");
			//checkIfItIsPalindrom();
			
		}
	}
	
	public static String getInputString(){
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		input.close();
		return string;
	}
	
	public static String deleteWhiteSings(String string){
		string =string.replace(" ","");
		return string;
	}
	
	public static String deleteUpperCase(String string){
		string = string.toLowerCase();
		return string;
	}
	
	public static String reverseString(String string){
		char[] chars = string.toCharArray();
		List<Character> arrayListOfChars = new ArrayList<Character>();
		List<Character> arrayListofChars2 = new ArrayList<Character>();
		
		for(char i : chars){
			arrayListOfChars.add(i);
		}
		
		int sizeOfArrayListOfChars = arrayListOfChars.size();
		for(int i = 0; i < sizeOfArrayListOfChars;i++){
			arrayListofChars2.add(arrayListOfChars.get(arrayListOfChars.size()-1));
			arrayListOfChars.remove(arrayListOfChars.size()-1);
		}
	
		String reversedString="";
		for(char i : arrayListofChars2){
			reversedString = reversedString +i;
		}
		
		return reversedString;
	}

}
