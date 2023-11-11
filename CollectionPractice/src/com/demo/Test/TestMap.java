package com.demo.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
public static void main(String[] args) {
	Map<String,Integer> hm = new HashMap<>();
	hm.put("ACTS", 100);
	hm.put("IET", 200);
	System.out.println(hm.get("ACTS"));
	
	Set<String> s = hm.keySet();
	for(String s1:s) {
		if(hm.get(s1)>100);
		System.out.println(s1+"--->"+hm.get(s1));
	}
	
	Set<Map.Entry<String,Integer>> hm3 = hm.entrySet();
	for(Map.Entry<String ,Integer> data:hm3) {
		System.out.println(data.getKey()+"--->"+data.getValue());
	}
	String k = "KIT";
	Integer i =90;
	if(hm.containsKey(k)) {
		System.out.println("KeyExists");
	}
	else {
		hm.put(k, i);
	}
}
}
