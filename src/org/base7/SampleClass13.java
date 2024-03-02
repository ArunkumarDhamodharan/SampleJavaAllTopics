package org.base7;

public class SampleClass13 {
	private void gymEligiblity(int age ,int weight) {
		
		if (age>18 || weight>50) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}
	}
	public static void main(String[] args) {
		SampleClass13 a=new SampleClass13();
		a.gymEligiblity(15, 44);
	}
}
