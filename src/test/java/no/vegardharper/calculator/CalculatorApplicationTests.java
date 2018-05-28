package no.vegardharper.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	public void sum_shouldAddTwoIntegers() {
		assertEquals(4, calculator.sum(1, 3));
	}

}
