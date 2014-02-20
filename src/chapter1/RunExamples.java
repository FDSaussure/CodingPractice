package chapter1;

public class RunExamples {

	public static void main(String[] args) {

		try {
		System.out.println(UniqueChars.CheckUniqueBA("abc"));
		System.out.println(UniqueChars.CheckUniqueBA("abcb!"));
		System.out.println(UniqueChars.CheckUniqueBA(""));
		System.out.println(UniqueChars.CheckUniqueHM("abc"));
		System.out.println(UniqueChars.CheckUniqueHM("abcb!"));
		System.out.println(UniqueChars.CheckUniqueHM("efhrthrhrthw"));
		}
		catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument Given");
		}
		System.out.println("That's all folks");
		
	}

}
