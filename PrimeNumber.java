public class PrimeNumber{
	public static void main(String [] s) {
		for (int i=2; i < 20 ; i++) {
					//System.out.println(i);
			for (int j=2; j<=i; j++) {
					//System.out.println(j);
				if (i % j == 0 && i != j){
					break;
				} else if (i % j == 0 && i == j) {
					System.out.println("res="+i);
					break;
					}
				}
		}
	}
}
