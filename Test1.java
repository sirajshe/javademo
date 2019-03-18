public class Test1 {
	public static void main(String[] s) {
		String s1 = "acbacbacb";
		String pt = null;
		for (int i=1; i<=s1.length()/2; i++) {
			if (pt == null) {
				System.out.println("here");
				pt = s1.substring(0,i);
				System.out.println("pt1="+pt);
			}else {
				if (pt != s1.substring(i,i+pt.length())) {
					pt = pt + s1.substring(i,i+pt.length());
				}
			}
			System.out.println("pt="+pt);
		}
	}
}
