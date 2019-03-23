import java.util.*;
import java.lang.Runtime;

public class SplunkStringDupRemove { 
 public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    //strings.add("This pad is running Java " + Runtime.version().feature());
    String input = "this is a sentence with duplicate words two two";
    
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    String [] splitString = input.split(" ");
    for (int index=0; index < splitString.length ; index ++) {
        if (map.get(splitString[index]) == null)
             map.put(splitString[index], 1);
        else
            map.put(splitString[index], map.get(splitString[index]) + 1);
    }
    
    System.out.println("Input:");
    System.out.println(input);
    System.out.println("Output:");
    System.out.println(map.keySet().toString()); // This prints all keys.
    for (String keys: map.keySet()) {
          if (map.get(keys) == 1)
            System.out.print(keys + " ");
    }
    System.out.println();
    for (String string : strings) {
      System.out.println(string);
    }
  }
}
