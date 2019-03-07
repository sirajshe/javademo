public class ArrayLeftRotate {
	public String[] leftRotate(String[] arr) {
		
		String k = arr[0];
		for (int i=0; i<arr.length-1; i++)
			arr[i] = arr[i+1];

		arr[arr.length - 1]=k;

		return arr;
		
	}

	public static void main(String [] s) {
		ArrayLeftRotate alr = new ArrayLeftRotate();
		String[] a = {"abc", "def", "mno", "pqr"};
		String[] res = alr.leftRotate(a);
		res = alr.leftRotate(res);

		for(int i=0; i< res.length; i++)
			System.out.println(res[i]);
	}
}
