package org.global;


import java.util.ArrayList;
import java.util.List;

public class Employee1 {
	
	public static void main(String[] args) {
		
	List li = new ArrayList();
	
		li.add(10);
		li.add(20);
		li.add(10);
		li.add("java");
		li.add('M');
		li.add(234567890);                                                                 
		li.add(987654321);
		li.add(null);
		li.add(34);
		li.add(24);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		boolean contains = li.contains(30);
		System.out.println(contains);
		
		int indexOf = li.indexOf(20);
		System.out.println(indexOf);
		
	    li.remove(3);
		System.out.println(li);
		
		int lastIndexOf = li.lastIndexOf(null);
		System.out.println(lastIndexOf);
		
		Object object = li.get(0);
		System.out.println(object);
		
		Object object2 = li.get(2);
		System.out.println(object2);
		
		for (int i = 0; i < li.size(); i++) {
			Object object3 = li.get(i);
			System.out.println(object3);
			
		}
	}
}
