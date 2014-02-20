package chapter1;

import java.util.HashMap;

public class UniqueChars {
	
	// Implementation using a boolean array.
	public static boolean CheckUniqueBA(String input) {
		if (input == null) { throw new IllegalArgumentException(); }
		
		boolean unique = true;
		boolean[] seen = new boolean[65536];
		
		for (int i = 0; (i < input.length()) & unique; i++) {
			char curChar = input.charAt(i);
			int index = Character.getNumericValue(curChar);
			
			if (seen[index]) {
				unique = false;
			}
			else {
				seen[index] = true;
			}
		}
				
		return unique;
	}
	
	// Implementation using a HashMap.
	public static boolean CheckUniqueHM(String input) {
		if (input == null) { throw new IllegalArgumentException(); }
		
		boolean unique = true;
		HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
		
		for (int i = 0; (i < input.length()) & unique; i++) {
			char curChar = input.charAt(i);
			int index = Character.getNumericValue(curChar);
			
			if (seen.containsKey(index)) {
				unique = false;
			}
			else {
				seen.put(index, true);
			}
		}
				
		return unique;

	}
}
