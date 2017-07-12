package com.capgemini.palindrom;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutputService {
	
	private static Pattern pattern = Pattern.compile("[a-zA-Z0-9\\s]{2,}");
	private Scanner scanner;
	private Boolean isCorrect;
	
	public Boolean isCorrect() {
		return isCorrect;
	}

	public String getValidatedInput(){
		System.out.println("Wprowadź palindrom (dozwolone tylko litery i cyfry)");
		String input;
		do{
		input = getInput();
		validateInput(input);
		showMessageIfWrongInput();
		}while(isCorrect()!=true);
		return input;
	}

	private void showMessageIfWrongInput() {
		if(isCorrect()!=true){
			System.out.println("Wprowadzono nie poprawne dane. Wprowadź jeszcze raz:");
		}
	}
	
	private String getInput(){
		scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
	
	private void validateInput(String input){
		isCorrect=false;
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches()){
			isCorrect=true;
		}
	}
	
	public String removeWhiteSigns(String input){
		return input.replace(" ", "");
	}
	public String removeUpperCase(String input){
		return input.toLowerCase();
	}
}
