import java.util.ArrayList;

class ArrayReverse {
	public static void main(String[] s) {
		String[] arr = {"a","b","c","d","e"};
		String[] arr1 = arr;
		//ArrayList<String> a = new ArrayList<String>(arr.length);
		for (int i=0; i< arr.length/2; i++) {
			String k=arr[i];	
			arr1[i]=arr[arr.length -i -1];
			arr1[arr.length - i - 1]=k;
		}

		for (int i=0 ; i<arr1.length; i++)
			System.out.println(arr1[i]);
	}
}
