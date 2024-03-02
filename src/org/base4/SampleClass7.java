package org.base4;

public class SampleClass7 {

	private void empId() {
		System.out.println("The employee id is 100");
	}

	public SampleClass7() {
		this(21);
		System.out.println("it is a non parametarized constructor");
	}

	public SampleClass7(int age) {
		this(21, 'M');
		System.out.println("it is a  parametarized constructor");
		System.out.println("Employee age is 21");
	}

	public SampleClass7(int age, char gender) {
		super();
		System.out.println("it is a double parametarized constructor");
		System.out.println("Employee age and gender is 21,M");
	}

	public static void main(String[] args) {
		SampleClass7 a = new SampleClass7();
		a.empId();
	}
}
