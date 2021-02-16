package com.naksha.StringCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void addEmptyString() {
		assertThat(StringCalculator.Add(""),is(0));
	}
	
	@Test
	public void addSingleNumber() {
		assertThat(StringCalculator.Add("1"),is(1));
	}
	
	@Test
	public void addTwoNumbers() {
		assertThat(StringCalculator.Add("1,2"),is(3));
	}
	
	@Test
	public void addFourNumbers() {
		assertThat(StringCalculator.Add("1,2,3,4"),is(10));
	}
}
