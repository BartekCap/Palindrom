package com.capgemini.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.capgemini.palindrom.Palindrom;

public class PalindromTest {

	@Test
	public void shouldReturnTrueWhenInsertPalindrom() {
		//given
		String input = "kayak";
		//when
		Boolean isPalindrom = Palindrom.isPalindrom(input);
		//then
		assertTrue(isPalindrom);
	}
	
	@Test
	public void shouldReturnTrueWhenInsertPalindromWithNumbers() {
		//given
		String input = "11 22 33 22 11";
		//when
		Boolean isPalindrom = Palindrom.isPalindrom(input);
		//then
		assertTrue(isPalindrom);
	}
	
	@Test
	public void shouldReturnFalseWhenInsertPalindromWithWhiteSigns() {
		//given
		String input = "111 11";
		//when
		Boolean isPalindrom = Palindrom.isPalindrom(input);
		//then
		assertEquals(false, isPalindrom);
	}

	@Test
	public void shouldReturnTrueWhenInsertPalindromWithFiveChars() {
		//given
		String input ="11111";
		//when
		Boolean isPalindrom = Palindrom.isPalindrom(input);
		//then
		assertEquals(true, isPalindrom);
	}
}
