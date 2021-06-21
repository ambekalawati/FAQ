package javaLearningPoint;

class LargestSubArray {

	// This function Prints the starting and ending
	// indexes of the largest subarray with equal
	// number of 0s and 1s. Also returns the size
	// of such subarray.

	int findSubArray(int input2[], int input1) {
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;

		// Pick a starting point as i

		for (int i = 0; i < input1 - 1; i++) {
			sum = (input2[i] == 0) ? -1 : 1;

			// Consider all subarrays starting from i

			for (int j = i + 1; j < input1; j++) {
				if (input2[j] == 0)
					sum += -1;
				else
					sum += 1;

				// If this is a 0 sum subarray, then
				// compare it with maximum size subarray
				// calculated so far

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		if (maxsize == -1)
			System.out.println("No such subarray");
		else
			System.out.println(startindex);

		return maxsize;
	}

	/* Driver program to test the above functions */

	public static void main(String[] args) {
		LargestSubArray sub;
		sub = new LargestSubArray();
		int arr[] = { 1, 1, 1, 1,1 };
		int size = arr.length;

		sub.findSubArray(arr, size);
	}
}
