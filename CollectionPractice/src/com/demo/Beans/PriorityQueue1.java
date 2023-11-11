package com.demo.Beans;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
	
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.add(10);
	pq.add(20);
	System.out.println(pq);
	Comparator<Person> c =(o1,o2)->{
		int n = o1.getName().compareTo(o2.getName());
		System.out.println("in comparator "+o1.getName()+"--"+o2.getName()+"--"+n);
		return n;
	};
	PriorityQueue<Person> pq1 = new PriorityQueue<>(c);
	pq1.add(new Person(10,"wrv","xyz","789"));
	pq1.add(new Person(20,"wrv","pqr","789"));
	System.out.println(pq1);
  }
}
