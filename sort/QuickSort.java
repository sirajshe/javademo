public class QuickSort {
	
	static int[] arr = {3,9,2,77,12,78,41,7};

	public static void quicksort(int[] arr) {
		quicksort(arr, 0, arr.length - 1);
	}

	public static void quicksort(int[] arr, int left, int right) {
		
		if (left >= right) {
			return;
		}
		int pivot = arr[(left + right) / 2];
		int index = partition(arr, left, right, pivot);
		quicksort(arr, left, index - 1);
		quicksort(arr, index, right);
	}

	public static int partition(int[] arr, int left, int right, int pivot) {
		
		while(left <= right) {
			while (arr[left] < pivot)
				left++;

			while (arr[right] > pivot)
				right--;

			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[right];
		arr[right]=arr[left];
		arr[left]=temp;
	}

	public static void main(String[] s) {
		for (int i=0; i< arr.length; i++)
                        System.out.print(arr[i]+" ");
                System.out.println("");
		quicksort(arr);
                System.out.println("came back");
		for (int i=0; i< arr.length; i++)
                        System.out.print(arr[i]+" ");
                System.out.println("");
	}	
}
