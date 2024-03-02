package org.base2;

public class SampleClass4 extends SampleClass3 {

	@Override
	public void empNum(int Num) {
		System.out.println("Employee Number is :" + Num);
	}

	@Override
	public void empAddress() {
		System.out.println("Employee address is : karur");
	}

	public static void main(String[] args) {
		SampleClass4 a = new SampleClass4();
		a.empName("Arun");
		a.empAge(21);
		a.empNum(123456789);
		a.empAddress();
	}
}
