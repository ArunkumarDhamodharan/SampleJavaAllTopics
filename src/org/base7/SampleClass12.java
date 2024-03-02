package org.base7;

public class SampleClass12 {
	
	private void bloodDonation(int age ,int weight) {

		if (age>=18 && weight>50) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}
	}
	public static void main(String[] args) {
		SampleClass12 a= new SampleClass12();
		a.bloodDonation(18, 53);
	}
}
