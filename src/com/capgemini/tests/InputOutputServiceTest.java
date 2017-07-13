package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.palindrom.InputOutputService;

public class InputOutputServiceTest {

	@Test
	public void shouldChangeBooleanIsCorrctToTrue() {
		// given
		InputOutputService inputOutputService = new InputOutputService();
		String input = "asd sadsa";
		// when
		inputOutputService.validateInput(input);
		// then
		assertTrue(inputOutputService.isCorrect());
	}
	
	@Test
	public void shouldChangeBooleanIsCorrctToFalse() {
		// given
		InputOutputService inputOutputService = new InputOutputService();
		String input = "asd sadsa.";
		// when
		inputOutputService.validateInput(input);
		// then
		assertFalse(inputOutputService.isCorrect());
	}

	@Test
	public void shouldReturnLowerCaseInString() {
		// given
		String input = "UGA bUga";
		InputOutputService inputOutputService = new InputOutputService();
		// when
		input = inputOutputService.removeUpperCase(input);
		// then
		assertEquals("uga buga", input);
	}

	@Test
	public void shouldReturnLowerCaseInStringWithLowerCaseToo() {
		// given
		String testing = "uga buga";
		InputOutputService inputOutputService = new InputOutputService();
		// when
		testing = inputOutputService.removeUpperCase(testing);
		// then
		assertEquals("uga buga", testing);
	}
	
	@Test
	public void shouldReturnStringWithoutWhiteSigns() {
		// given
		String testing = "uga     buga      ";
		InputOutputService inputOutputService = new InputOutputService();
		// when
		testing = inputOutputService.removeWhiteSigns(testing);
		// then
		assertEquals("ugabuga", testing);
	}
}
