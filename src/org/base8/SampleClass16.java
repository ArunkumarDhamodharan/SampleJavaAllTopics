package org.base8;

public class SampleClass16 {
	public static void main(String[] args) {
		
		//datatype variableName[] = new Datatype[size];
		//   index(0 -n-1) = value (1 -n)
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for (int i = 0; i <=4; i++) {
			System.out.println(a[i]);
		}
		for (int b : a) {
			System.out.println(b);
		}
	}		
}
