package org.base;

public class SampleClass2 extends SampleClass1 {
	private void tc01() {
		System.out.println("******Employee Datas********");
		super.empData("Arun");
		super.empData(21);
		super.empData(true);
		super.empData(987654321, "Kaur");
		this.empData("Arun2");
		this.empData(21);
		this.empData(false);
		this.empData(123456789, "Karur2");
	}

	@Override
	public void empData(String Name) {
		System.out.println("Sceond Employee Name is :" + Name);
	}

	@Override
	public void empData(int age) {
		System.out.println("Sceond Employee age is :" + age);
	}

	@Override
	public void empData(boolean maritail) {
		System.out.println("Sceond Employee maritail status is :" + maritail);
	}

	@Override
	public void empData(int mobileNo, String address) {
		System.out.println("Sceond Employee mobieNo and address is :" + mobileNo + "," + address);
	}

	public static void main(String[] args) {
		SampleClass2 a = new SampleClass2();
		a.tc01();

	}
}
