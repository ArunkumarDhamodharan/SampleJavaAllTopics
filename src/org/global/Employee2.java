package org.global;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee2 {
	public static void main(String[] args) {
		
	List<Integer>  a = new LinkedList<Integer>();
	
	a.add(10);
	a.add(30);
	a.add(20);
	
	List<Integer> b= new ArrayList<Integer>();
	
	b.add(10);
	b.add(100);
	b.add(150);
	
//	a.removeAll(b);
//	System.out.println(a);
	
//	a.retainAll(b);
//	System.out.println(a);
	
	List<Integer> c= new ArrayList<Integer>();
	
	c.add(10);
	c.add(101);
	c.add(151);
	
	
	c.addAll(a);
	System.out.println(c);
	
//	c.clear();
//	System.out.println(c);
	}
}
