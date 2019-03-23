import java.util.HashMap;

class IsUnique {
	// If we could sort and get a list of unique chars, then we can compare the length of sorted array and input array. If the length and are same, then its all
	// unique chars.

	// Option 2 - go through array and store count to map. If we find any existing map entry, then we break out.

	boolean check(String str) {
		char[] c = str.toCharArray();
		HashMap<Character, Integer> al = new HashMap<Character, Integer>();
		//java.utils.Arrays.sort(c);
		for (int i=0 ; i< c.length; i++) {
			if (al.get(c[i]) != null) {
				System.out.println("Chars in string not unique");
				return false;
			}else {
				al.put(c[i],1);
			}
		}
		return true;
	}

	public static void main(String[] s){	
		IsUnique iu = new IsUnique();
		//System.out.println(iu.check("Hello"));
		System.out.println(iu.check("abcdefghijklmnopqrstuvwaxyz"));
	}
}
