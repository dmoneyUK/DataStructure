package exercise.data.structure;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercise.data.structure.FibonacciCalculator;

/**
 * Tests for {@link FibonacciCalculator}.
 * 
 * @author DMONEY
 *
 */
public class FibonacciCalculatorTest {

	/**
	 * The object under test.
	 */
	private FibonacciCalculator calculator;

	/**
	 * A array of expected results.
	 */
	private int[] sequence = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };

	/**
	 * Run before every test.
	 */
	@Before
	public void setUp() {
		this.calculator = new FibonacciCalculator();
	}

	/**
	 * Tests {@link FibonacciCalculator#getNthNumber(int)}.
	 */
	@Test
	public void testgetNthNumber() {
		for (int i = 0; i < sequence.length; i++) {
			String expected = String.valueOf(sequence[i]);
			Assert.assertEquals(new BigInteger(expected), this.calculator.getNthNumber(i));
		}

	}
}
