package com.infotech.client;

public class FinallyDemo1 {

	public static void main(String[] args) {
		int i = getValue();
		System.out.println("Value of i " + i);

	}

	@SuppressWarnings("finally")
	static int getValue() {
		try {
			System.out.println("In try block");
			return 10;
		} finally {
			System.out.println("In finally block");
			return 20;
		}
	}
}