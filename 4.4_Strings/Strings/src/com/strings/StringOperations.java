package com.strings;


public class StringOperations {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = ""; // empty String or null
		string3 = "How are you ".concat(string2);
		System.out.println("string3: " + string3);
		// get length
		System.out.println("Length: " + string1.length());
		// get substring beginning with character 0, up to, but
		// not including character 5
		System.out.println("Sub: " + string3.substring(0, 5));
		// uppercase
		System.out.println("Upper: " + string3.toUpperCase());
		
		System.out.println("Sentencias de escape");

		String s1 = "This is an example of an escape.\n And now we're on a new line.\n\t This	is a tab.";
		String s2 = "\"This is a quote \"";System.out.println(s1);System.out.println(s2);
		
		System.out.println("Comparaciones");
		s1 = "This is a String.";
		s2 = new String("This is a String.");
		String s3 = "String.";
		String s4 = "This is a " + s3;
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
	}// end method main	
}// end class StringOperations