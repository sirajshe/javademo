import java.util.HashMap;

class PalindromePermutation {
	public static void main(String[] s) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		//String s1 = "civic";
		//String s1 = "malayalam";
		String s1 = "baba";
		String oddeven = s1.length() % 2 == 0?"even":"odd";
		
		System.out.println(oddeven);
		char[] c = s1.toCharArray();
		for(int i=0; i<c.length; i++) {
			if (m.get(c[i]) == null)
				m.put(c[i], 1);
			else
				m.put(c[i], m.get(c[i])+1);
		}
		for(Character key: m.keySet()) 
				System.out.println(key +" ## "+ m.get(key));

		for(Character key: m.keySet()) {
			System.out.println(key +"--"+ m.get(key) + "  mid: "+ c[(c.length/2)] + " odd even:"+oddeven+" len:"+c.length/2);
			if (m.get(key) % 2 != 0) {
				if (oddeven == "odd") {
					if (key != c[c.length/2]) {
						System.out.println("cannot have palindrome permutations.");
						break;
					}
				}
			}
			//System.out.println(key +":"+ m.get(key));
		}

		System.out.println("Has palindrome permutation.");
	}
}
