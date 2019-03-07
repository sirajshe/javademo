import java.util.Map;
import java.util.HashMap;

class Permutation {

	public static void main(String[] s) {
		//String s1 = "Hello";
		//String s2 = "leloH";
		String s1 = "Hello World of Java";
		String s2 = "Java World Hello of";
		char[] s1a = s1.toCharArray();
		char[] s2a = s2.toCharArray();
		// if length is equal and the unique chars and their number of occurrences are equal, then we conclude its a permutation.

		if ( s1.length() != s2.length()) {
			System.out.println("Not matching count");
			System.exit(1);
		}
		// At this point, we know length is same.
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();
		for (int i=0;i<s1a.length; i++) {
			char c = s1a[i];
			if (m1.get(c) == null)
				m1.put(c,1);
			else
				m1.put(c,m1.get(c)+1);

			c = s2a[i];
                        if (m2.get(c) == null)
                                m2.put(c,1);
                        else
                                m2.put(c,m2.get(c)+1);
		}

		for (Character keys : m1.keySet())
			System.out.println(keys + ":" + m1.get(keys));

		if (m1.equals(m2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
