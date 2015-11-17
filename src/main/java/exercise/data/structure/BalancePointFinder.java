package exercise.data.structure;

/**
 * Find the balance point in the input int array, where left sum equals right
 * sum.
 * 
 * @author DMONEY
 *
 */
public class BalancePointFinder {

	public static void main(final String[] args) {
		int i = findBalance(new int[] { 1, -2147483648, 2147483647, 1 });
		System.out.print(i);
	}

	public static int findBalance(final int[] A) {
		int result = -1;

		if (A == null || A.length == 0) {
			return result;
		} else if (A.length == 1) {
			result = 0;
		} else {
			long sum = getSum(A);
			long leftSum = 0;
			long rightSum = sum;
			for (int i = 0; i < A.length; i++) {
				rightSum -= A[i];
				if (leftSum == rightSum) {
					result = i;
					break;
				} else {
					leftSum += A[i];
				}
			}
		}
		return result;
	}

	private static long getSum(final int[] input) {
		long sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;
	}

}
