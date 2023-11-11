package com.demo.beans;

public interface Interface1 {
	
		int i =23;
		void f1();
		default void f2() {
			System.out.println("In function f2");
		}
		public static void f3() {
			System.out.println("In Static void");
		}
	
}
