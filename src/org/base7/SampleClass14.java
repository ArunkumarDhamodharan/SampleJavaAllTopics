package org.base7;

public class SampleClass14 {
	private void tallestInClass(int a ,int b, int c) {
		if (a>b && a>c) {
			System.out.println("A is Tallest");
		}else if (b>a && b>c) {
			System.out.println("B is Tallest");
		}
		else {
			System.out.println("C is Tallest");
		}
	}
	public static void main(String[] args) {
		SampleClass14 a=new SampleClass14();
		a.tallestInClass(170,180,150);
	}
}
