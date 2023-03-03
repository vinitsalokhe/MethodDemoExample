package com.array.exercise;

public class MethodDemo {

	static {
		System.out.println("inside static block 2222222222 ");
	}

	{
		System.out.println("inside instance block 1");
	}

	static {
		System.out.println("inside static block 111111111 ");
	}

	public MethodDemo() {
		System.out.println("inside no-args constructor 11111111");
	}

	public static void main(String[] args) {

		System.out.println("inside main method ");
		MethodDemo d = new MethodDemo();

		int result = additionNumber(50, 40);
		System.out.println(result);

		int result2 = additionNumber(30, 50);
		System.out.println(result2);
	}

	public static int additionNumber(int a, int b) {
		int result = a + b;
		return result;
	}

}
