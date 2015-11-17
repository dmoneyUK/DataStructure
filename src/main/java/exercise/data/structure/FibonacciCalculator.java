package exercise.data.structure;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * An Implementation of Fibonacci Sequence.
 * 
 * @author DMONEY
 *
 */
public class FibonacciCalculator {

	/** A list containing the Fibonacci numbers. */
	private List<BigInteger> sequence;

	/**
	 * Constructor.
	 */
	public FibonacciCalculator() {
		sequence = new ArrayList<BigInteger>();
		sequence.add(BigInteger.ZERO);
		sequence.add(BigInteger.ONE);
		sequence.add(BigInteger.ONE);
	}

	/**
	 * Get the Nth Fibonacci number. If it has already in the sequence, return
	 * it. Otherwise, calculate it from the current sequence.
	 * 
	 * @param n the index of Fibonacci number to calculate
	 * @return the Nth Fibonacci number
	 */
	public BigInteger getNthNumber(int n) {
		if (n < 0) {
			return null;
		}else if (n >= this.sequence.size()) {
			calculate(n);
		}
		return this.sequence.get(n);
	}

	/**
	 * Calculate the Nth Fibonacci number.
	 * 
	 * @param n the index of Fibonacci number to calculate
	 */
	private void calculate(int n) {

		BigInteger next;
		for (int i = this.sequence.size() - 1; i < n; i++) {
			next = this.sequence.get(i - 1).add(this.sequence.get(i));
			this.sequence.add(next);
		}
	}

}
