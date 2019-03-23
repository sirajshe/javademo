public class PermuteString {
	public static void permute(String base, String remaining) {
		if (remaining.length() == 0) {
			System.out.println(base);
		}

		for(int i=0; i<remaining.length();i++) {
			permute(base+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1));
		}
	}

	public static void main(String[] s) {
		String input = "ABC";
		permute("",input);
	}
}
