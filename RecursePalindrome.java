public class RecursePalindrome {
	static int isPalindrome(String input, int begin, int end) {
		int x=99;
		if (begin > end)
			return 1;
		if (input.charAt(begin) == input.charAt(end)) {
			x=isPalindrome(input,begin+1, end-1);
			return x;
		}

		return 0;
	}

	public static void main(String[] s) {
		String input = "civic";
		if (isPalindrome(input,0,input.length() - 1) == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
