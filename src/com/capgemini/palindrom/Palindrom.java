package com.capgemini.palindrom;

public class Palindrom {
	private static String input;
	private static String output;
	
	public static boolean isPalindrom(String input){
		if(input.length()<=1){
			return true;
		}
		else{
			if(input.charAt(0)==input.charAt(input.length()-1)){
				return isPalindrom(input.substring(1,input.length()-1));
			}
			else{
				return false;
			}
		}
}

	public static void play() {
		getInput();
		if (isPalindrom(input)) {
			System.out.println(output + " jest Palindromem. Bardzo dobrze!");
		} else {
			System.out.println(output + " nie jest Palindromem!");
		}
	}

	private static void getInput() {
		InputOutputService inputOutputService = new InputOutputService();
		output = inputOutputService.getValidatedInput();
		input = inputOutputService.removeUpperCase(output);
		input = inputOutputService.removeWhiteSigns(input);
	}
}
