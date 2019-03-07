public class Fibonacci {
	static int fib(int n) {
		if (n <=0 ) {
			return 0;
		} else if (n == 1 ) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] s) {
		int firstn = 10;
		for (int idx = 0; idx<firstn; idx++)
			System.out.println(fib(idx));
	}
}
