package com.demo.Test;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthStyleFactory;

import com.demo.Beans.Person;

public class HashSet1 {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		boolean ans = hs.add(23);
		System.out.println("Ans "+ans);
		hs.add(1);
		hs.add(23);
		hs.add(45);
		System.out.println("Ans "+ans);
		System.out.println(hs);
		Set<Person> hs1=new HashSet<>();
		hs1.add(new Person(10,"xyz","123","xyz@gmail.com"));
		hs1.add(new Person(20,"xyz","123","xyz@gmail.com"));
		System.out.println(hs1);
	}
}
