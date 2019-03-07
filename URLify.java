class URLify {
	public static void main(String[] s){
		String input = "Hello World of Java";
		String output = "";
		StringBuilder sb = new StringBuilder();
		char[] carray = input.toCharArray();
		for (int i=0; i<carray.length; i++) {
			if (carray[i] == ' ')
				sb.append("%20");
			else
				sb.append(carray[i]);
		}
		System.out.println(sb.toString());
	}
}
