package com.demo.beans;
import com.demo.*;
public class Xyzimp1 implements Interface1,Interface2 {

	@Override
	public int f12() {
		System.out.println("In f12");
		return 0;
	}

	@Override
	public int f22() {
		System.out.println("In f22");
		return 0;
	}

	@Override
	public void f1() {
		System.out.println("in f11");
		
	}
	public void f21() {
		Interface1.super.f2();
		Interface2.super.f11();
	}

}
