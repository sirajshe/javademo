public class RecursePrintArray {
	public static void doPrint(int[] arr, int len) {
		if (len <= arr.length -1) {
			System.out.println (arr[len]);
			doPrint(arr, ++len);
		}
	}

	public static void main(String[] s) {
		int[] numArray = {2,5,3,8,9,4,7,5,6,4};
		doPrint(numArray, 0);
	}
}
