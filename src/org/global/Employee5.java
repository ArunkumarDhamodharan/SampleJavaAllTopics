package org.global;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee5 {
	public static void main(String[] args) {
		
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		m.put("CSK", 10);
		m.put("MI", 9);
		m.put("RR", 8);
		m.put("RCB", 10);
		m.put("KKR", 7);
		m.put(null, null);
		m.put("DD", null);
		m.put(null, 5); 
		
		System.out.println(m);
		
		Map<String, Integer> m1=new LinkedHashMap();
		
		m1.put("CSK", 10);
		m1.put("MI", 9);
		m1.put("RR", 8);
		m1.put("RCB", 10);
		m1.put("KKR", 7);
		m1.put(null, null);
		m1.put("DD", null);
		m1.put(null, 5);
		
		System.out.println(m1);
		
		Map<String, Integer> m2=new TreeMap<String, Integer>();
		
		m2.put("CSK", 10);
		m2.put("MI", 9);
		m2.put("RR", 8);
		m2.put("RCB", 10);
		m2.put("KKR", 7);
		m2.put("DD", 6);
		
		System.out.println(m2);
		
		Map<String, Integer> m3=new Hashtable<String, Integer>();
		
		m3.put("CSK", 10);
		m3.put("MI", 9);
		m3.put("RR", 8);
		m3.put("RCB", 10);
		m3.put("KKR", 7);
		m3.put("DD", 6);
		
		System.out.println(m3);
		
		int size = m3.size();
		System.out.println(size);
		
//		m3.remove("CSK");
//		System.out.println(m3);
//		
		boolean containsKey = m3.containsKey("MI");
		System.out.println(containsKey);
		
		boolean containsValue = m3.containsValue(10);
		System.out.println(containsValue);
		
		Set<String> keySet = m3.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m3.values();
		System.out.println(values);
		
		Set<Entry<String,Integer>> c = m3.entrySet();
		for (Entry<String, Integer> b :c) {
			System.out.println(b);
		}
	}
}