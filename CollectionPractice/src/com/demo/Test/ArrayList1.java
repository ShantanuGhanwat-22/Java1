package com.demo.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
 public static void main(String[] args) {
	List<Integer> lst = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("Enter Data");
		int n = sc.nextInt();
		lst.add(n);
	}
	System.out.println(lst);
	
	// display data 1.5
	int s = 0;
	for(int i=0;i<lst.size();i++) {
		s=s+lst.get(i);
	}
	System.out.println("Addition using for loop "+s);
	
	// display data 1.7
	int s1=0;
	for(Integer num:lst) {
		s1=s1+num;
	}
	System.out.println("Addition using for Each "+s1);
	
	//to remove the value
	System.out.println("Enter number for deletion");
	int n = sc.nextInt();
	Iterator<Integer> i = lst.iterator();
	//java 1.5
//	while(i.hasNext()) {
//		int n2 = i.next();
//		if(n==n2) {
//			i.remove();
//		}
//	  }
	
	//java 1.7
	lst.remove(new Integer(n)); //Delete first occurance
	
	lst.removeIf((x)->(int)x==(n));
	System.out.println(lst);
   }
}
