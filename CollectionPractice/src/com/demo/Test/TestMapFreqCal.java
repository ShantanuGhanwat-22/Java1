package com.demo.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMapFreqCal {
	public static void main(String[] args) {
		Integer[] ar = {10,20,30,40,50,10};
		Map<Integer,Integer> hm = new HashMap<>();
		for(Integer num :ar) {
			if(hm.containsKey(num)) {
				int val = hm.get(num);
				hm.put(num,val+1);
			}
			else {
				hm.put(num, 1);
			}
		}
		System.out.println(ar);
		System.out.println(hm);
	}
}
