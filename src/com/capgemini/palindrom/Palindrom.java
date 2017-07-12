package com.capgemini.palindrom;

public class Palindrom {
	private static String input;
	private static String checkingInput;
	private static Boolean isPalindrom = false;

	public static Boolean isPalindrom(StringBuilder inputSB) {
		if (inputSB.charAt(0) == inputSB.charAt(inputSB.length() - 1)) {
			inputSB.deleteCharAt(inputSB.length() - 1);
			inputSB.deleteCharAt(0);
			if (inputSB.length() == 0 || inputSB.length() == 1) {
				isPalindrom = true;
			} else {
				isPalindrom(inputSB);
			}
		}
		return isPalindrom;
	}

	public static void play() {
		getInput();
		StringBuilder inputSB = new StringBuilder(checkingInput);
		if (isPalindrom(inputSB)) {
			System.out.println(input + " jest Palindromem. Bardzo dobrze!");
		} else {
			System.out.println(input + " nie jest Palindromem!");
		}
	}

	private static void getInput() {
		InputOutputService inputOutputService = new InputOutputService();
		input = inputOutputService.getValidatedInput();
		checkingInput=inputOutputService.removeUpperCase(input);
		checkingInput=inputOutputService.removeWhiteSigns(checkingInput);
	}
}
