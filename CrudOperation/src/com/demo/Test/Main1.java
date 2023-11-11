package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.Beans.Emp;
import com.demo.Service.ServIf;
import com.demo.Service.ServImp;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice = 0 ;
		ServIf sf = new ServImp();
		do {
			System.out.println("1. Add Emp \n 2. Delete ID \n 3. Modify Sal using ID \n 4. Dispaly All \n 5. Display By ID \n 6. Sort By Sal \n 7. Sort By Name \n 8. Exit \n"
					+ "Your Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("1. SalEmp \n 2. ConEmp \n 3. VenEmp ");
				int ch = sc.nextInt();
				sf.addEmp(ch);
				break;
			case 2 :
				System.out.println("Enter ID for deletion");
				int id = sc.nextInt();
				boolean status = sf.deleteID(id);
				if(status) {
					System.out.println("ID deleted");
					break;
				}
				else {
					System.out.println("ID not Found");
				}
				break;
			case 3 :
				System.out.println("Enter ID for SalModification");
				id = sc.nextInt();
				System.out.println("Enter New Sal");
				double sal = sc.nextDouble();
				status = sf.SalModify(id,sal);
				if(status) {
					System.out.println("Sal Modified");
					break;
				}
				else {
					System.out.println("ID Not Found");
				}
			case 4:
				List<Emp> elist = sf.displayAll();
				if(elist!=null) {
					elist.stream().forEach(System.out::println);
				}
				break;
			case 5:
				System.out.println("Enter ID for search");
				id=sc.nextInt();
				Emp e = sf.searchbyID(id);
				if(e!=null) {
					System.out.println(e);
					break;
				}
				else {
					System.out.println("ID not Found");
				}
				break;
			case 6:
				List<Emp> elst = sf.sortBySalary();
				elst.stream().forEach(System.out::println);
				break;
			case 7:
				elst = sf.sortByName();
				elst.stream().forEach(System.out::println);
				break;
			}
		}while(choice!=8);
	}
}
