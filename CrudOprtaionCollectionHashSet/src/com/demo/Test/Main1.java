package com.demo.Test;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.Beans.Emp;
import com.demo.Service.ServIf;
import com.demo.Service.ServImpl;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServIf sf = new ServImpl();
		int choice =0;
		do {
			System.out.println("1. Add New Emp \n 2. Dispaly All \3. Modify Sal \n 4. Delete Emp \n 5. Display By ID \n 6. Sort By Sal \n 7. Sort By Name \n "
					+ "        8. Display N Topmost based on Sal \n 9. Exit \n your Choice");
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
				break;
				}
				break;
			case 3 : 
				System.out.println("Enter ID for sal Modification");
				int id = sc.nextInt();
				System.out.println("Enter Modified Sal");
				double sal = sc.nextDouble();
				boolean status = sf.modifySal(id,sal);
				if(status) {
					System.out.println("Sal Modified");
					break;
				}
				else {
					System.out.println("ID not Found");
				}
				break;
			case 4 : 
				System.out.println("Enter ID for Deletion");
				id = sc.nextInt();
				boolean st = sf.deleteID(id);
				if(st) {
					System.out.println("ID Deleted");
					break;
				}
				else {
					System.out.println("ID Not Found");
				}
				break;
			case 5 :
				System.out.println("Enter ID");
				id = sc.nextInt();
				Emp e = sf.seaarchID(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("ID Not Found");
				}
				break;
			case 6:
				Set<Emp> elst = sf.sortBySal();
				elst.stream().forEach(System.out::println);
				break;
			case 7:
				elst = sf.sortByName();
				elst.stream().forEach(System.out::println);
				break;
			case 8:
				System.out.println("Show top emp");
				int n = sc.nextInt();
				Emp[] earr = sf.getTopEmp(n);
				Stream.of(earr).forEach(System.out::println);
				break;
			case 9:
				break;
			}
			
		}while(choice!=9);
	}
}
