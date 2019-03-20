public class TwoDArrayBasic {
	static int[][] array2d = { {1,2,3}, {4,5,6}, {7,8,9} };
	public static void main(String[] s) {
		print(array2d);
		setValueOnEntireRow(array2d, 2, 99);
		print(array2d);
		
	}
	public static void print(int[][] array2d) {
		for (int i=0; i<array2d.length; i++) {
			for (int j=0; j<array2d[i].length; j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	// Set value on entire row.
	public static void setValueOnEntireRow(int[][] array2d, int rowid, int value) {
		for (int i=0; i<array2d.length; i++) {
                        for (int j=0; j<array2d[i].length; j++) {
				if (i==rowid-1) {
					array2d[i][j]=value;
				}
                        }
                }
	}
}
