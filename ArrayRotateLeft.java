//Rotate array to left, d times. - in place without using a second array or other data structues.
public class ArrayRotateLeft {
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}

	public static void main(String[] s) {
		int[] input = {1,2,3,4,5,6,7};
		int d = 8;
		int temp =  Integer.MIN_VALUE;
		printArray(input);
		for(int j=1; j<=d; j++) {
			temp = input[0];
			for(int i=0; i<input.length - 1; i++) {
				input[i]=input[i+1];
			}
			input[input.length - 1] = temp;
			printArray(input);
		}
	}
}
