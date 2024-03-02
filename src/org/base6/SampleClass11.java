package org.base6;

import java.util.Scanner;

public class SampleClass11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your words :");
		String words = s.nextLine();
		System.out.println("few words :"+words);
		
		System.out.println("Enter your Name :");
		String name = s.next();
		System.out.println("Name :"+name);
		
		System.out.println("Enter your age");
		byte age = s.nextByte();
		System.out.println("Age :"+age);
		System.out.println("Enter your doorNo :");
		short doorNo = s.nextShort();
		System.out.println("doorNo :"+doorNo);
		
		System.out.println("Enter your Phone No1 :");
		int phoneNo1 = s.nextInt();
		System.out.println("Phone no :"+phoneNo1);
		
		System.out.println("Enter your Phone No2 :");
		long phoneNo2 = s.nextLong();
		System.out.println("Phone no2 :"+phoneNo2);
		
		System.out.println("Enter your mark1 :");
		float mark1 = s.nextFloat();
		System.out.println("Phone no2 :"+mark1);
		
		System.out.println("Enter your mark2 :");
		double mark2 = s.nextDouble();
		System.out.println(mark2);
		
		System.out.println("Enter your maritail :");
		boolean maritail = s.nextBoolean();
		System.out.println(maritail);
	}
}
