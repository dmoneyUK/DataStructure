package exercise.data.structure;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TwoDimensionArrayTest {

	private int[][] array;
	private Random rd;

	@Before
	public void setUp() {
		rd = new Random();
	}

	/**
	 * Tests a 5 X 5 array.
	 */
	@Test
	public void testfindSameNeighber() {
		array = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = rd.nextInt(10);
			}
		}
		showArray(array);

		Map<String, String> result = TwoDimensionTwicesFinder.findSameNeighber(array);
		showMap(result);
	}

	/**
	 * Tests null input.
	 */
	@Test
	public void testfindSameNeighber_Null() {

		Map<String, String> result = TwoDimensionTwicesFinder.findSameNeighber(array);
		showMap(result);
	}

	/**
	 * Tests a single line array.
	 */
	@Test
	public void testfindSameNeighber_SingleLine() {
		array = new int[1][5];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = rd.nextInt(10);
			}
		}
		showArray(array);
		Map<String, String> result = TwoDimensionTwicesFinder.findSameNeighber(array);
		showMap(result);
	}

	/**
	 * Tests a single column array.
	 */
	@Test
	public void testfindSameNeighber_SingleColumn() {
		array = new int[5][1];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				array[i][j] = rd.nextInt(10);
			}
		}
		showArray(array);
		Map<String, String> result = TwoDimensionTwicesFinder.findSameNeighber(array);
		showMap(result);
	}

	/**
	 * Tests a single element array.
	 */
	@Test
	public void testfindSameNeighber_SingleElement() {
		array = new int[1][1];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				array[i][j] = rd.nextInt(10);
			}
		}
		showArray(array);
		Map<String, String> result = TwoDimensionTwicesFinder.findSameNeighber(array);
		showMap(result);
	}

	/**
	 * Print the array.
	 */
	private void showArray(int[][] array) {
		System.out.println("***************************");
		for (int[] line : array) {
			System.out.print("[");
			for (int element : line) {
				System.out.print(element + ", ");
			}
			System.out.println("]");
		}
		System.out.println("***************************");
		System.out.println();
	}

	/**
	 * Print the map.
	 *
	 * @param map
	 */
	private void showMap(Map<String, String> map) {
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
	}

}
