public class MergeSortedArrays {
	// Start with two pointers, one each for one array and copy least elements first.
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int p1=0, p2=0, i=0;
		int[] retArr = new int[arr1.length + arr2.length];

		while(p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] < arr2[p2]) {
				retArr[i] = arr1[p1];
				p1++;
			} else {
				retArr[i] = arr2[p2];
				p2++;
			}
			i++;
		}
		//Copy over remaining items from both the arrays.
		//Only one of the arrays will have anything left in there.
		System.arraycopy(arr1,p1,retArr,i,arr1.length - p1);
		System.arraycopy(arr2,p2,retArr,i,arr2.length - p2);
		return retArr;
	}

	public static void main(String[] s) {
		//int[] arr1 = {1,3,5,7};
		int[] arr1 = {100};
		int[] arr2 = {2,4,6,8};
		int[] arr3 = mergeArray(arr1, arr2);
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}
}
