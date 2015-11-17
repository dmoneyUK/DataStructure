package exercise.data.structure;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import exercise.models.IntegerPair;

public class IntegerPairsCalculatorTest {

	private PairsOfSumFinder calculator;

	/**
	 * Run before every test
	 */
	@Before
	public void setUp() {
		this.calculator = new PairsOfSumFinder();
	}

	@Test
	public void testFindPairs() {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Set<IntegerPair> pairs = this.calculator.findPairs(10, inputArray);
		pairs.contains(new IntegerPair(1, 9));
		pairs.contains(new IntegerPair(2, 8));
		pairs.contains(new IntegerPair(3, 7));
		pairs.contains(new IntegerPair(4, 6));
	}

	@Test
	public void testFindPairs_Duplicated() {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
		Set<IntegerPair> pairs = this.calculator.findPairs(10, inputArray);
		pairs.contains(new IntegerPair(1, 9));
		pairs.contains(new IntegerPair(2, 8));
		pairs.contains(new IntegerPair(3, 7));
		pairs.contains(new IntegerPair(4, 6));
	}

	@Test
	public void testFindPairs_NonPositiveInteger() {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, -1 };
		Set<IntegerPair> pairs = this.calculator.findPairs(10, inputArray);
		pairs.contains(new IntegerPair(1, 9));
		pairs.contains(new IntegerPair(2, 8));
		pairs.contains(new IntegerPair(3, 7));
		pairs.contains(new IntegerPair(4, 6));
	}

	@Test
	public void testFindPairs_MoreNumbers() {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 1, 7, 44, 123, -1, 12, -4, 16, 42, -12, 23, -11 };
		Set<IntegerPair> pairs = this.calculator.findPairs(10, inputArray);
		for (IntegerPair pair : pairs) {
			System.out.println(pair.getA() + " , " + pair.getB());
		}
	}

}
