class IsOneEditAway {
	public static void main(String[] s) {
		String s1 = "pale";
		String s2 = "ale";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
	
		if (s1.equalsIgnoreCase(s2)){
			System.out.println("Strings are same");
			System.exit(0);
		}

		if (c1.length > c2.length + 2 || c2.length > c1.length + 2) {
			System.out.println("Strings are more than 1 edit away");
			System.exit(1);
		}
		int lowlen=0;
		if (c1.length < c2.length) 
			lowlen=c1.length;
		else
			lowlen=c2.length;
		int edit=0;
		for (int i=0;i<lowlen;i++) {
			if (c1[i] != c2[i])
				edit+=1;

			if (edit > 1){
				System.out.println("More than one edit away ...");
				System.exit(1);
			}
		}
		System.out.println("1 edit away");
	}
}
