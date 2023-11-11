package com.demo.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.demo.Beans.Emp;
import com.demo.Beans.Project;

public class TestMapSort {
	public static void main(String[] args) {
		Map<Emp,Project> hm = new HashMap<>();
		hm.put(new Emp(12,"abc","hr",645),new Project("wow",10));
		System.out.println(hm);
		System.out.println("*******************************************");
		TreeMap<Emp,Project> tm = new TreeMap<>();
		tm.put(new Emp(10,"abs","associate",645), new Project("wow",10));
		System.out.println(tm);
		System.out.println("*******************************************");
		SortedMap<Emp,Project> tm1 = tm.headMap(new Emp(10,"abx","hr",120));
		System.out.println(tm1);
		System.out.println("*******************************************");
		tm.put(new Emp(12,"xxx","hr",3456), new Project("aaa",10));
		System.out.println(tm1);
	}
}
