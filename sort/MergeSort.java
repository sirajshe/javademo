public class MergeSort {
	
	static int[] arr = {3,6,12,4,66,8,98,21,34,9};
	
	// mergesort (left half)
	// mergesort (right half)
	// merge two halves.

	public static void mergesort(int[] arr) {
		mergesort(arr, 0, arr.length-1);
	}

	public static void mergesort(int[] arr, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd)
			return;
		int middle = (leftStart + rightEnd)/2;
		mergesort(arr,leftStart,middle);
		mergesort(arr,middle+1,rightEnd);
		mergeHalves(arr,leftStart,rightEnd);
	}
 
	public static void mergeHalves(int[] arr, int leftStart, int rightEnd) {
		int[] temp = new int[arr.length];
		// Establish starting points from two half arrays.
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		int size = rightEnd - leftStart + 1;
		while (left <= leftEnd && right <= rightEnd) {
			if (arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left++;
			} else {
				temp[index] = arr[right];
				right++;
			}
			index++;
		}

		// Only one of the arrays will have remaining elements, so both of the calls copy to temp starting at index.
		System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
		System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}

	public static void main(String[] s) {
		for (int i=0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		mergesort (arr);
		for (int i=0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
}
