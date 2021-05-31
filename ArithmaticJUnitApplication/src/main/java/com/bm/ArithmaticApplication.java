package com.bm;

public class ArithmaticApplication {
	public static void main(String[] args) {
		System.out.println("\n Addition Result:"+add(5, 9));
		System.out.println("\n Substraction Result:"+sub(15, 9));
		System.out.println("\n Multiplication Result:"+mult(5, 9));
		System.out.println("\n Division Result:"+div(54, 9));
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int mult(int n1, int n2) {
		return n1 * n2;
	}
	
	public static int div(int n1, int n2) {
		return n1 / n2;
	}
}
