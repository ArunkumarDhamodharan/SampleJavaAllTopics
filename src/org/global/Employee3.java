package org.global;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee3 {
	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(10);
		s.add("java");
		s.add(true);
		s.add(10);
		s.add(23.345f);
		s.add(null);

		System.out.println(s);

		Set s1 = new LinkedHashSet();

		s1.add(10);
		s1.add("java");
		s1.add(true);
		s1.add(10);
		s1.add(23.345f);
		s1.add(null);

		System.out.println(s1);
		
		int size = s1.size();
		System.out.println(size);
		
		boolean contains = s1.contains(10);
		System.out.println(contains);
		
		s1.remove(10);
		System.out.println(s1);
		
		for (Object c : s1) {
			System.out.println(c);
		}

		Set<Integer> s2 = new TreeSet<Integer>();

		s2.add(10);
		s2.add(05);
//		s2.add(null);

		System.out.println(s2);

	}
}
