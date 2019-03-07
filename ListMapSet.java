import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class ListMapSet {

	public static void main(String[] s) {
		List<String> myList = new ArrayList<String>();
		//ArrayList<String> myList = new ArrayList<String>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		myList.add("Five");
		myList.add("Six");
		myList.add("Seven");
		myList.add("Eight");
		myList.add("Nine");
		myList.add("Ten");
		System.out.println("*** ArrayList ***");
		Iterator<String> myIter = myList.iterator();
		for (String temp : myList)
			System.out.println(temp);

		HashSet<String> myhSet = new HashSet<String>();
		myhSet.add("One");
		myhSet.add("Two");
		myhSet.add("Three");
		myhSet.add("Four");
		myhSet.add("Five");
		myhSet.add("Six");
		myhSet.add("Seven");
		myhSet.add("Eight");
		myhSet.add("Nine");
		myhSet.add("Ten");
		
		System.out.println("*** HashSet ***");
		myIter = myhSet.iterator();
		for (String temp : myhSet)
			System.out.println(temp);
		
		LinkedHashSet<String> myLhset = new LinkedHashSet<String>();
		myLhset.add("One");
		myLhset.add("Two");
		myLhset.add("Three");
		myLhset.add("Four");
		myLhset.add("Five");
		myLhset.add("Six");
		myLhset.add("Seven");
		myLhset.add("Eight");
		myLhset.add("Nine");
		myLhset.add("Ten");
		
		System.out.println("*** LinkedHashSet ***");
		myIter = myLhset.iterator();
		for (String temp : myLhset)
			System.out.println(temp);
	}
} 
