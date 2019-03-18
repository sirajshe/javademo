public class BubbleSort {
	public static int[] bubblesort(int[] arr) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i=0; i < arr.length-1; i++) {
				// If control enters this if block, it means the arr is not sorted.
				// optimization possible by making loop run only till the lastUnsorted cell of array.
				// because, each time we bubble the values in the following loop, we get the max number at the end of the array.
				if (arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
					isSorted=false; // Not sorted if we had something to swap.
				}
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

	public static void main(String[] s) {
		int[] arr = {4,8,2,9,7,5,1};
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		arr = bubblesort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
