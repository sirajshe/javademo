import java.util.HashMap;

class StringCompress{
	public static void main(String[] s){
		String s1 = "aggbbbbaaaaa";
		//String s1 = "aggbbhdgtebsnjkotetevdn";
		//String s1 = "aggbbhdgtebsnjkotetevdnnnnnnnnnnnnnnnnnyyyyyyyyyyyyyy";
		StringBuilder sb = new StringBuilder();
		char[] c = s1.toCharArray();
		char a;
		int cnt=1;
		int idx = 0;
		for (int i=0; i<c.length; i++) {
			idx=i;
			if (i>0) {
				if (c[i] == c[i-1]){
					cnt++;
				} else {
					sb.append(c[i-1]+""+cnt);
					cnt=1;
				}
			}
				
		}

		sb.append(c[idx-1]+""+cnt);
		System.out.println(sb.toString());
			
	}
}
