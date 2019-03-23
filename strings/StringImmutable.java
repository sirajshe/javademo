public class StringImmutable {
	public static void main(String[] s) {
		String s1 = "Hello";
		String s2 = new String("World");
		System.out.println("1. s1="+s1);
		s1.concat(" World");
		System.out.println("2. s1="+s1);
	}
}
