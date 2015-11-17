package exercise.data.structure;

import java.util.HashMap;
import java.util.Map;

public class TwoDimensionTwicesFinder {

	public static Map<String, String> findSameNeighber(int[][] array) {

		Map<String, String> result = new HashMap<String, String>();
		String key = null;
		String value = null;
		String format = "(%d,%d)";

		if (array == null || array.length == 0) {
			return result;
		} else if (array.length == 1 && array[0].length != 1) {
			for (int i = 0; i < array[0].length - 1; i++) {
				if (array[0][i] == array[0][i + 1]) {
					key = String.format(format, 0, i);
					value = String.format(format, 0, i + 1);
					result.put(key, value);
				}
			}
		} else if (array.length != 1 && array[0].length == 1) {
			for (int i = 0; i < array[0].length - 1; i++) {
				if (array[i][0] == array[i + 1][0]) {
					key = String.format(format, i, 0);
					value = String.format(format, i + 1, 0);
					result.put(key, value);
				}
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				if (array[i][j] == array[i + 1][j]) {
					key = String.format(format, i, j);
					value = String.format(format, i + 1, j);
					result.put(key, value);
				}
				if (array[i][j] == array[i][j + 1]) {
					key = String.format(format, i, j);
					value = String.format(format, i, j + 1);
					result.put(key, value);
				}
			}
		}
		return result;
	}

}
