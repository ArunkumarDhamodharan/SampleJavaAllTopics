package org.base8;

public class sampleClass17 {
	public static void main(String[] args) {
		
		//datatype variableName[][] = new Datatype[size of the row][size of the column];

		
		int a[][]=new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=1; j++) {
				System.out.println(a[i][j]);
			}	
		}
		for (int[] b : a) {
			for (int c : b) {
				System.out.println(c);
			}
		}
	}
}
