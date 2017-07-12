package com.capgemini.palindrom.extra;

import java.util.Scanner;

public class InteractionWithUser {

	public static String getInputString() {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		return string;
	}
	
	public static void getOutputString(Boolean isPalindom){
		if(isPalindom){
			System.out.println("Wprowadziłeś palindrom! Gratulacje! Wprowadz palindrom jeszcze raz lub wpisz \"x\" aby zakończyć program: ");
		}
		else{
			System.out.println("Wprowadzony tekst nie jest palindromem. Wprowadz palindrom jeszcze raz lub wpisz \"x\" aby zakończyć program: ");
		}
		
	}
}
