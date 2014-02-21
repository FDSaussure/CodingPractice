package chapter1;

import java.util.HashMap;

public class UniqueChars {
	
	// Implementation using a boolean array.
	public static boolean CheckUniqueBA(String input) {
		if (input == null) { throw new IllegalArgumentException(); }
		
		boolean[] seen = new boolean[65536];
		
		for (int i = 0; (i < input.length()); i++) {
			char curChar = input.charAt(i);
			int index = Character.getNumericValue(curChar);
			
			if (seen[index]) {
				return false;
			}
			else {
				seen[index] = true;
			}
		}
				
		return true;
	}
	
	// Implementation using a HashMap.
	public static boolean CheckUniqueHM(String input) {
		if (input == null) { throw new IllegalArgumentException(); }
		
		HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
		
		for (int i = 0; (i < input.length()); i++) {
			char curChar = input.charAt(i);
			int index = Character.getNumericValue(curChar);
			
			if (seen.containsKey(index)) {
				return false;
			}
			else {
				seen.put(index, true);
			}
		}
				
		return true;

	}
	
	// Implementation using no additional data structures.
	public static boolean CheckUniqueNoStruct(String input) {
		if (input == null) { throw new IllegalArgumentException(); }
		
		for (int i = 0; i < (input.length() - 1); i++) {
			for (int j = i+1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
}
