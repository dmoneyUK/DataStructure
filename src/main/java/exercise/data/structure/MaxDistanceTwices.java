package exercise.data.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the two elements of the same value, which has the largest distance.
 *
 */
public class MaxDistanceTwices {

	/**
	 * Find the two elements of the same value, which has the largest distance.
	 *
	 * @return
	 */
	public static Map<Integer, Integer[]> getFarthestElements(final int[] array) {
		Map<Integer, Integer[]> result = new HashMap<Integer, Integer[]>();
		Integer[] value;

		if (array == null || array.length < 2) {
			return result;
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (!result.containsKey(array[i])) {
				value = new Integer[2];
				value[0] = i;
			} else {
				value = result.get(array[i]);
			}
			value[1] = i;
			result.put(array[i], value);
		}
		return result;
	}
}
