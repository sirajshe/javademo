// Shifting left most elements to right and then moving other elements to left. O(n) and aux space complexity O(d).
public class ArrayRotate {

	public static void main(String [] s) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int d = 2;
		int[] temp = new int[d];
		for (int i=0; i<d ; i++)
			temp[i] = arr[i];
		for (int i=0;i<temp.length;i++)
			System.out.println(temp[i]);					
		int j=0;
		for (j=0; j<n-d; j++) 
			arr[j] = arr[j+d];

		for (int i=0;i<j;i++)
			System.out.println(arr[i]);					

		System.out.println("j="+j);	
		for (int k=0; k<temp.length ; k++)
			arr[j+k]=temp[k];

		for (int i=0;i<n;i++)
			System.out.println(arr[i]);					
			
	}
}
