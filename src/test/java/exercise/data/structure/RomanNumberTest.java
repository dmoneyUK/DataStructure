package exercise.data.structure;

import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testGetRomanNumber() {
		// Random rd = new Random();
		// int input = rd.nextInt(1000);
		// System.out.println(input);
		ArabicToRomanNumber roman = new ArabicToRomanNumber();
		System.out.println(roman.getRomanNumber(3456));
		// RomanNumber roman = new RomanNumber();
		// for (int i = 0; i <= 100; i++) {
		// System.out.println(i);
		// String result = roman.getRomanNumber(i);
		// System.out.println(result);
		// }
	}

}
