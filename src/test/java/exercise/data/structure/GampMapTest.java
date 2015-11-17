package exercise.data.structure;

import org.junit.Before;
import org.junit.Test;

public class GampMapTest {

	private GameMap gameMap;

	@Before
	public void setUp() {
		this.gameMap = new GameMap();
	}

	@Test
	public void testFindCountryNumber() {
		int[][] array = new int[][] { { 1, 2, 3, 2, 1 }, { 2, 2, 2, 3, 1 }, { 4, 3, 3, 1, 1 }, { 3, 3, 3, 2, 1 },
				{ 2, 2, 2, 2, 1 } };

		int result = this.gameMap.findCountryNumber(array, 5, 5);
		System.out.println(result);
	}

	@Test
	public void testFindCountryNumber_OneLine() {
		int[][] array = new int[][] { { 1, 1, 1, 1, 1 } };

		int result = this.gameMap.findCountryNumber(array, 5, 5);
		System.out.println(result);
	}
	

}
