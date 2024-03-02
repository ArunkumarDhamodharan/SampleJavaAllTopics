package org.base5;

public class SampleClass10 {
	public static void main(String[] args) {
		String s="java program";
		
		//Char At
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		char charAt2 = s.charAt(4);
		System.out.println(charAt2);
		
		//length
		int length = s.length();
		System.out.println(length);
		
		//index of
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		//last index of
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		//to upper case
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		//to lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//starts with
		boolean startsWith = s.startsWith("j");
		System.out.println(startsWith);
		
		//ends with
		boolean endsWith = s.endsWith("m");
		System.out.println(endsWith);
		
		//is Empty
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//contains
		boolean contains = s.contains("o");
		System.out.println(contains);
		
		
		
		
		String s1="java";
		String s2="java";
		
		//equals
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		//equal ignore case
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		//compare to
		int compareTo = s1.compareTo(s2);
		System.out.println(compareTo);
		
		
		
		
		String s3="java selenium";
		
		
		//replace
		String replace = s3.replace("s", "c");
		System.out.println(replace);
		
		//replaceAll
		String replaceAll = s3.replaceAll("java", "python");
		System.out.println(replaceAll);
		
		
		
		
		String s4 = "java class";
		
		//trim
		String trim = s4.trim();
		System.out.println(trim);
		
		
		
		String s5="java is a programming language";
		
		
		//sub String
		String substring = s5.substring(10);
		System.out.println(substring);
		
		//sub string
		String substring2 = s5.substring(10, 28);
		System.out.println(substring2);	
		
	}
}
