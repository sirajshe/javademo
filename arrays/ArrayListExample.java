import java.util.ArrayList;

class ArrayReverse {
	public static void main(String[] s) {
		String[] arr = {"a","b","c","d"};
		ArrayList<String> a = new ArrayList<String>(arr.length);
		for (int i=0; i< arr.length/2; i++) {
			String k=arr[i];	
			a.add(i,arr[arr.length - i - 1]);
			a.add(arr.length - i - 1, k);
		}

		for (int i=0 ; i<a.size(); i++)
			System.out.println(a.get(i));
	}
}
