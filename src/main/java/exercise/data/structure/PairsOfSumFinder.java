package exercise.data.structure;

import java.util.HashSet;
import java.util.Set;

import exercise.algorithm.SortHelper;
import exercise.models.IntegerPair;

/**
 * Find the pairs in the input array whose sum is the given number. This method
 * will sort the input array first.
 *
 * @author DMONEY
 *
 */
public class PairsOfSumFinder {

	/**
	 * Find the pairs in the input array whose sum is the given number. This
	 * method will sort the input array first.
	 *
	 * @param the given sum
	 */
	public Set<IntegerPair> findPairs(final int sum, final int[] inputArray) {

		Set<IntegerPair> pairs = new HashSet<IntegerPair>();
		SortHelper sorter = new SortHelper();

		sorter.quickSort(inputArray, 0, inputArray.length - 1);

		if (inputArray != null && inputArray.length >= 2) {
			int startIndex = 0;
			int endIndex = inputArray.length - 1;
			for (; startIndex < endIndex; startIndex++) {
				if (inputArray[startIndex] >= sum) {
					break;
				}
				for (; startIndex < endIndex; endIndex--) {
					if (inputArray[startIndex] + inputArray[endIndex] == sum) {
						pairs.add(new IntegerPair(inputArray[startIndex], inputArray[endIndex]));
					} else if (inputArray[startIndex] + inputArray[endIndex] < sum) {
						break;
					}
					continue;
				}
			}
		}
		return pairs;
	}

}