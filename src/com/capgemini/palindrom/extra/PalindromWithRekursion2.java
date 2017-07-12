package com.capgemini.palindrom.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromWithRekursion2 {
	static Pattern inputPattern = Pattern.compile(".{0,2}");

	static Boolean isProgramRunning = true;

	public static void main(String[] args) {
		System.out.println("Wprowadz tekst aby sprawdzic czy jest palindromem:");
		do {
			String string = InteractionWithUser.getInputString();
			validation(string);
		} while (isProgramRunning);

	}

	private static void validation(String string) {
		if (string.equals("x") || string.equals("X")) {
			isProgramRunning = false;
			System.out.println("Do zobaczenia.");
		} else if (checkIfItIsALetterOrAWhiteSign(string)) {
			InteractionWithUser.getOutputString(false);
		} else {
			InteractionWithUser.getOutputString(isPalindrom(string));
		}
	}

	public static Boolean isPalindrom(String palindromString) {
		palindromString = deleteWhiteSings(palindromString);
		palindromString = deleteUpperCase(palindromString);
		char[] chars = palindromString.toCharArray();
		chars = reverseCharArray(chars);
		String reversedPalindromString = String.valueOf(chars);
		Boolean boolAnswer = checkEqualityOfStrings(palindromString, reversedPalindromString);
		return boolAnswer;
	}

	public static Boolean checkIfItIsALetterOrAWhiteSign(String string) {
		Matcher matcher = inputPattern.matcher(string);
		return matcher.matches();
	}

	public static Boolean checkEqualityOfStrings(String string1, String string2) {
		Boolean boolAnswer;
		if (string1.equals(string2)) {
			boolAnswer = true;
		} else {
			boolAnswer = false;
		}
		return boolAnswer;
	}

	public static String deleteWhiteSings(String string) {
		string = string.replace(" ", "");
		return string;
	}

	public static String deleteUpperCase(String string) {
		string = string.toLowerCase();
		return string;
	}

	public static char[] reverseCharArray(char[] chars) {

		List<Character> listOfChars = createListFromArray(chars);
		List<Character> listOfReversedChars = new ArrayList<>();
		reversListsElementInRekursion(listOfChars, listOfReversedChars);
		chars = createArrayFromList(listOfReversedChars);
		return chars;
	}

	public static void reversListsElementInRekursion(List<Character> listOfChars, List<Character> listOfReversedChars) {
		if (listOfChars.size() > 0) {
			listOfReversedChars.add(listOfChars.remove(listOfChars.size() - 1));
			reversListsElementInRekursion(listOfChars, listOfReversedChars);
		}
	}

	public static List<Character> createListFromArray(char[] chars) {
		List<Character> listOfChars = new ArrayList<Character>();
		for (char c : chars) {
			listOfChars.add(c);
		}
		return listOfChars;
	}

	public static char[] createArrayFromList(List<Character> listOfChars) {
		char[] chars = new char[listOfChars.size()];
		for (int i = 0; i < listOfChars.size(); i++) {
			chars[i] = listOfChars.get(i);
		}
		return chars;
	}
}