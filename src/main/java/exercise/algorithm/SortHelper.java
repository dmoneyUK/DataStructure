package exercise.algorithm;

/**
 * A class of various sort methods.
 *
 * @author DMONEY
 *
 */
public class SortHelper {

	/**
	 * An implementation of quick sort.
	 *
	 * @param lowerIndex the start position of the sub-array
	 * @param higherIndex the end position of the sub-array
	 * @return the sorted array
	 */
	public void quickSort(int[] array, int lowerIndex, int higherIndex) {

		if (array == null || array.length < 2 || higherIndex - lowerIndex < 1) {
			return;
		} else if (higherIndex - lowerIndex < 2 && array[lowerIndex] >= array[higherIndex]) {
			exchange(array, lowerIndex, higherIndex);
			return;
		}

		int lt = lowerIndex;
		int gt = higherIndex;
		int i = lowerIndex + 1;
		int pivotIndex = lowerIndex;
		int pivot = array[pivotIndex];

		while (i <= gt) {
			if (array[i] < pivot) {
				exchange(array, i++, lt++);
			} else if (array[i] > pivot) {
				exchange(array, i, gt--);
			} else {
				i++;
			}
		}
		// showArray(array);
		quickSort(array, lowerIndex, lt - 1);

		quickSort(array, gt + 1, higherIndex);

	}

	/**
	 * Exchange the elements at the given positions in the array.
	 *
	 * @param i a position to be exchanged
	 * @param j another position to be exchanged
	 * @param the array to be adjusted
	 */
	private void exchange(int[] array, int i, int j) {
		if (i != j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}
	}

	/**
	 * Swaps the given number of elements from the start position to the end
	 * position of the array.
	 */
	private void swapEqElements(int[] array, int i, int j, int num) {
		while (num-- > 0) {
			exchange(array, i++, j--);
		}
	}

	private void showArray(int[] sortedArray) {
		System.out.print("[");
		for (int k = 0; k < sortedArray.length - 1; k++) {
			System.out.print(sortedArray[k] + ", ");
		}
		System.out.print(sortedArray[sortedArray.length - 1]);
		System.out.println("]");

	}

}
