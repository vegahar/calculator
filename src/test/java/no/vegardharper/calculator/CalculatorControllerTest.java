package no.vegardharper.calculator;

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;


public class CalculatorControllerTest implements En {
	private Integer int1;
	private Integer int2;
	private int sum;

	public CalculatorControllerTest() {
		Given("integers {int} and {int}", (Integer int1, Integer int2) -> {
			this.int1 = int1;
			this.int2 = int2;
		});

		When("I add the numbers", () -> {
			sum = new Calculator().sum(this.int1, this.int2);
		});

		Then("I should get {int}", (Integer int1) -> {
			assertEquals(new Integer(sum), int1);
		});

	}

}