package exercise.data.structure;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumber {

	private int[] units = { 1, 5, 10, 50, 100, 500, 1000 };

	private Map<Integer, String> map;

	private int[] minus = { 1, 10, 100 };

	public ArabicToRomanNumber() {
		map = new HashMap<Integer, String>();
		map.put(units[0], "I");
		map.put(units[1], "V");
		map.put(units[2], "X");
		map.put(units[3], "L");
		map.put(units[4], "C");
		map.put(units[5], "D");
		map.put(units[6], "N");
	}

	public String getRomanNumber(int input) {
		String result = "";
		if (input <= 0) {
			return result;
		}
		int i = 0;
		for (; i < units.length; i++) {
			if (units[i] < input && input < units[i + 1]) {
				break;
			} else if (units[i] == input) {
				return map.get(units[i]);
			}
		}
		int small = units[i];
		int large = units[i + 1];

		for (int l = minus.length - 1; l >= 0; l--) {
			if (input < minus[l] && input > minus[l - 1]) {
				if (input + minus[l - 1] >= large) {
					return map.get(minus[l - 1]) + map.get(large) + getRomanNumber(input - large + minus[l - 1]);
				}
			}
		}

		int j = input / small;
		if (j > 3) {
			result = map.get(small) + map.get(large) + getRomanNumber(input % small);
		} else {
			for (int k = 0; k < j; k++) {
				result = result + map.get(small);
			}
			result = result + getRomanNumber(input % small);
		}

		return result;
	}

}
