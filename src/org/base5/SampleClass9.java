package org.base5;

public class SampleClass9 {
	public static void main(String[] args) {

		// Literal String

		String s = "java";
		String s1 = "maven";
		String s2 = "java";

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("****************************");

		// Non Literal String

		String s3 = new String("java");
		String s4 = new String("maven");
		String s5 = new String("java");

		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println("****************************");

		// mutable

		StringBuilder s6 = new StringBuilder("java");
		StringBuilder s7 = new StringBuilder("maven");
		StringBuilder append = s7.append(s6);

		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(append));
		System.out.println("****************************");

		// immutable

		String s8 = "java";
		String s9 = "maven";
		String concat = s9.concat(s8);

		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		System.out.println(System.identityHashCode(concat));
		System.out.println("****************************");
	}
}
