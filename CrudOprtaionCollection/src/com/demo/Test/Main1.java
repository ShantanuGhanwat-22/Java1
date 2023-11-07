package com.demo.Test;

import java.util.Scanner;
import java.util.Set;

import com.demo.Beans.Emp;
import com.demo.Service.ServIf;
import com.demo.Service.ServImpl;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServIf sf = new ServImpl();
		int choice =0;
		do {
			System.out.println("1. Add New Emp \n 2. Dis[paly All \3. Exit \n your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. SalEmp \n 2.ConEmp \n 3. VenEmp");
				int ch = sc.nextInt();
				sf.addEmp(ch);
				break;
			case 2:
				Set<Emp> es = sf.displayAll();
				if(es!=null) {
					es.stream().forEach(System.out::println);
				}
			}
			
		}while(choice!=3);
	}
}
