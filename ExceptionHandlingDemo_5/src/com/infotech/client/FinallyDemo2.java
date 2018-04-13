package com.infotech.client;

public class FinallyDemo2 {

	public static void main(String[] args) {
		int i = getValue();
		System.out.println("Value of i " + i);
	}

	static int getValue() {
		try {
			System.out.println("In try block");
			throw new RuntimeException();
		} catch (RuntimeException nExp) {
			System.out.println("Exception caught in catch block of getValue");
			return 20;
		} finally {
			System.out.println("In finally block");
			//return 30;
		}
	}

}