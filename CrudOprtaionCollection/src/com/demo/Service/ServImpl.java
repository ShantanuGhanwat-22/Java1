package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.Beans.*;
import com.demo.DAO.DaoImpl;
import com.demo.DAO.Daoif;

public class ServImpl implements ServIf {
	private Daoif dao = new DaoImpl();
	
	@Override
	public void addEmp(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter E-mail");
		String email = sc.nextLine();
		System.out.println("Enter Mobile");
		String mobile = sc.nextLine();
		System.out.println("Enter Dept");
		String Dept = sc.nextLine();
		System.out.println("Enter Desgn");
		String Desgn = sc.nextLine();
		System.out.println("Enter Doj (dd/mm/yyyy)");
		String doj = sc.nextLine();
		LocalDate ldt = LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Emp e = null;
		if(ch==1) {
			System.out.println("Enter Sal");
			double sal = sc.nextDouble();
			System.out.println("Enter Bonus");
			double bonus = sc.nextDouble();
			e = new SalEmp(id,name,email,mobile,Dept,Desgn,sal,bonus,ldt);
		}
		else if(ch==2) {
			System.out.println("Enter Charges");
			double charges = sc.nextDouble();
			System.out.println("Enter Hours");
			int hrs = sc.nextInt();
			e = new ConEmp(id,name,email,mobile,Dept,Desgn,hrs,charges,ldt);
		}
		else {
			System.out.println("Enter No of Emp");
			int NoEmp = sc.nextInt();
			System.out.println("Enter Amount");
			double amt = sc.nextDouble();
			e = new ConEmp(id,name,email,mobile,Dept,Desgn,NoEmp,amt,ldt);
		}
		dao.save(e);
	}

	@Override
	public Set<Emp> displayAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
