package exercise.data.structure;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class OneDimensionArrayTest {

	private int[] array;
	private Random rd;

	@Before
	public void setUp() {
		rd = new Random();
	}

	/**
	 * Tests a array with length 10.
	 */
	@Test
	public void testGetFarthestElements() {
		array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = rd.nextInt(10);
		}
		showArray(array);

		Map<Integer, Integer[]> result = MaxDistanceTwices.getFarthestElements(array);
		showMap(result);

	}

	/**
	 * Print the array.
	 */
	private void showArray(int[] array) {
		System.out.println("***************************");
		System.out.print("[");
		for (int element : array) {
			System.out.print(element + ", ");
		}
		System.out.println();
		System.out.println("***************************");
		System.out.println();
	}

	/**
	 * Print the map.
	 *
	 * @param map
	 */
	private void showMap(Map<Integer, Integer[]> map) {
		for (Entry<Integer, Integer[]> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": (" + entry.getValue()[0] + "," + entry.getValue()[1] + ")");
		}
	}
}
