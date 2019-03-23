
import java.util.*;

public class SplitStringToWords {
	public static void main(String[] s) {
		String input = "This string has multiple words";
		ArrayList<String> words = new ArrayList<String>();
		int wordIndex = 0;
		int pos = 0;
		for (int i=0; i<input.length(); i++) {
			if ((" ").equals(input.substring(i,i+1))) {
			System.out.println("here ..pos="+pos+" i="+i+ "input.substring(pos,i)="+input.substring(pos,i));
				words.add(wordIndex, input.substring(pos,i));
				pos=i+1;
				wordIndex++;
			}

			if (i+1 == input.length()) {
				words.add(wordIndex, input.substring(pos,i+1));
				break;
			}
		}
		for(int i=0 ; i<words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}
