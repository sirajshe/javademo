public class Test2 {

	public static void main(String[] s) {
	String string="abcabc";
	for (int i = 1; i <= string.length() / 2; i++) {
            if (string.length() % i == 0) {
                String period = string.substring(0, i);
                int j = i;
                while(j + i < string.length()) {
                    if (period.equals(string.substring(j, j + i))) {
                        j = j + i;
                        if(j == string.length()) { //period valid through entire string
                            System.out.println(period);
			    System.exit(0);
                        }
                    } else {
                        break;
                    }
                }
            }

        }
	System.out.println("no pattern");
  }

}
