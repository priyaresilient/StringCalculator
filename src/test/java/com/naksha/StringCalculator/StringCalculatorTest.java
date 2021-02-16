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
	
}
