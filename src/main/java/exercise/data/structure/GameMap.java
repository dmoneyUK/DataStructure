package exercise.data.structure;

public class GameMap {

	private int INIT = 0;

	public int findCountryNumber(int[][] array, int n, int m) {
		int result = 0;
		showArray(array);

		if (array == null || n == 0 || m == 0) {
			return result;
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int colour = array[i][j];
					if (colour == INIT) {
						continue;
					}
					array[i][j] = INIT;
					result++;
					System.out.println("********* " + result);
					showArray(array);
					findSameNeighber(array, i, j, colour);
				}
			}
		}
		return result;
	}

	private void findSameNeighber(int[][] array, int i, int j, int colour) {

		if (i > 0 && j < array[i].length && array[i - 1][j] == colour) {
			array[i - 1][j] = INIT;
			showArray(array);
			findSameNeighber(array, i, j + 1, colour);
			showArray(array);
		}
		if (j > 0 && i < array.length && array[i][j - 1] == colour) {
			array[i][j - 1] = INIT;
			showArray(array);
			findSameNeighber(array, i, j - 1, colour);

		}
		if (j < array[i].length - 1 && i < array.length && array[i][j + 1] == colour) {
			array[i][j + 1] = INIT;
			showArray(array);
			findSameNeighber(array, i, j + 1, colour);

		}
		if (i < array.length - 1 && j < array[i].length && array[i + 1][j] == colour) {
			array[i + 1][j] = INIT;
			showArray(array);
			findSameNeighber(array, i + 1, j, colour);

		}
	}

	private void showArray(int[][] array) {
		System.out.println("######################");
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("######################");
	}

}
