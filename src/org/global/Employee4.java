package org.global;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Employee4 {
	public static void main(String[] args) {
		
		List s = new ArrayList();
		
		s.add(10);
		s.add(20);
		s.add(30);

		Set s1 = new LinkedHashSet();

		s1.add(10);
		s1.add(100);
		s1.add(150);
		
//		s1.addAll(s);
//		System.out.println(s1);

		s1.removeAll(s);
		System.out.println(s1);
		
//		s1.retainAll(s);
//		System.out.println(s1);
	}
}