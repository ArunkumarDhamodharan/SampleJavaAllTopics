package org.base3;

public class SampleClass6 implements SampleClass5 {

	@Override
	public void empName(String Name) {
		System.out.println("Employee Name is :" + Name);
	}

	@Override
	public void empAge(int Age) {
		System.out.println("Employee Age is :" + Age);
	}

	@Override
	public void empNo(int No) {
		System.out.println("Employee No is :" + No);
	}

	@Override
	public void empAddress(String address) {
		System.out.println("Employee address is :" + address);
	}

	@Override
	public void empMaritail(boolean maritail) {
		System.out.println("Employee maritail is :" + maritail);
	}

	public static void main(String[] args) {
		SampleClass6 a = new SampleClass6();
		a.empName("Arun");
		a.empAge(21);
		a.empNo(123456789);
		a.empAddress("Karur");
		a.empMaritail(true);
	}
}
