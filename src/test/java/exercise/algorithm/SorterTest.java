package exercise.algorithm;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link SortHelper}.
 *
 * @author DMONEY
 *
 */
public class SorterTest {

	/**
	 * The {@link SortHelper} under test.
	 */
	private SortHelper sorter;

	private int[] inputArray = { 10, 5, 7 };

	/**
	 * Run before each test.
	 */
	@Before
	public void setUp() {

		Random rd = new Random();
		this.sorter = new SortHelper();
		inputArray = new int[10];
		for (int i = 0; i < 10; i++) {
			inputArray[i] = rd.nextInt(10);
		}
		showArray(inputArray);
	}

	/**
	 * Test {@link SortHelper#quickSort(int, int)}.
	 */
	@Test
	public void testQuickSort() {

		this.sorter.quickSort(inputArray, 0, inputArray.length - 1);
		verifySorted(inputArray);

	}

	/**
	 * Verify that the given list is sorted.
	 *
	 * @param sortedArray the list to be checked
	 */
	public void verifySorted(int[] sortedArray) {
		System.out.print("[");
		for (int i = 0; i < sortedArray.length - 1; i++) {
			Assert.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
			System.out.print(sortedArray[i] + ", ");
		}
		System.out.print(sortedArray[sortedArray.length - 1]);
		System.out.println("]");
	}

	public void showArray(int[] sortedArray) {
		System.out.print("[");
		for (int i = 0; i < sortedArray.length - 1; i++) {
			System.out.print(sortedArray[i] + ", ");
		}
		System.out.print(sortedArray[sortedArray.length - 1]);
		System.out.println("]");
	}
}
