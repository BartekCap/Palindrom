package com.capgemini.palindrom.extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrom{
	//TODO czy moge wprowadzic 1500? 
	
	//TODO zmienic algorytm na sprawdzanie skrajnych charow!
	static Pattern inputPattern = Pattern.compile(".{0,2}");
	
	static Boolean isProgramRunning=true;
	
	public static void main(String[] args){
		System.out.println("Wprowadz tekst aby sprawdzic czy jest palindromem:");
		do{
			String string = InteractionWithUser.getInputString();
			validation(string);
		} while(isProgramRunning);
	}

	private static void validation(String string) {
		if(string.equals("x")||string.equals("X")){
			isProgramRunning=false;
			System.out.println("Do zobaczenia.");
		}
		else if(checkIfItIsALetterOrAWhiteSign(string)){
			InteractionWithUser.getOutputString(false);
		}
		else{
			InteractionWithUser.getOutputString(isPalindrom(string));
		}
	}

	public static Boolean isPalindrom(String palindromString){
		palindromString = deleteWhiteSings(palindromString);
		palindromString = deleteUpperCase(palindromString);
		char[] chars = palindromString.toCharArray();		
		chars = rekPalindrom(chars,0, chars.length-1);
		String reversedPalindromString = String.valueOf(chars);
		Boolean boolAnswer = checkEqualityOfStrings(palindromString, reversedPalindromString);
		return boolAnswer;
	} 
	
	public static Boolean checkIfItIsALetterOrAWhiteSign(String string){
		Matcher matcher = inputPattern.matcher(string);
		return matcher.matches();
	}
	public static Boolean checkEqualityOfStrings(String string1, String string2){
		Boolean boolAnswer;
		if(string1.equals(string2)){
			boolAnswer=true;
		}
		else{
			boolAnswer = false;
		}
		return boolAnswer;
	}
	
	
	public static String deleteWhiteSings(String string){
		string =string.replace(" ","");
		return string;
	}
	
	public static String deleteUpperCase(String string){
		string = string.toLowerCase();
		return string;
	}

	public static char[] rekPalindrom(char[] chars,int start, int end){
		if(start<end){
			char i = chars[end];
			chars[end] = chars[start];
			chars[start] = i;
			rekPalindrom(chars, start+1, end-1);
			}
		return chars;
	}		
}
