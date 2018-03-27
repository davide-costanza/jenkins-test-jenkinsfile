package it.extrasys.jenkinsdemo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		System.out.println("\nTest: testSum\n");
		
		assertEquals(5, calculator.sum(2, 3));
	}
}
