package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.Beans.ConEmp;
import com.demo.Beans.Emp;
import com.demo.Beans.SalEmp;
import com.demo.DAO.EmpDaoIf;
import com.demo.DAO.EmpDaoImpl;

public class ServImp implements ServIf {
	private EmpDaoIf dao= new EmpDaoImpl();
	//public  EmpDaoImpl() {
		
	//}
	
	@Override
	public void addEmp(int ch) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ID");
		int pid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Mobile");
		String mob = sc.nextLine();
		System.out.println("Enter E-mail");
		String email = sc.nextLine();
		System.out.println("Enter Dept");
		String Dept = sc.nextLine();
		System.out.println("Enter Desg");
		String Desg = sc.nextLine();
		System.out.println("Enter DateOfJoining(dd/mm/yyyy)");
		String doj = sc.next();
		LocalDate ldt = LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Emp e = null;
		if(ch==1) {
			System.out.println("Enter Salary");
			double sal = sc.nextDouble();
			System.out.println("Enter Bonus");
			double bonus = sc.nextDouble();
			e = new SalEmp(pid,name,mob,email,Dept,Desg,sal,bonus,ldt);
			
		}
		else if(ch==2) {
			System.out.println("Enter charges");
			int charges = sc.nextInt();
			System.out.println("Enter hours");
			double hours = sc.nextDouble();
			e = new ConEmp(pid,name,mob,email,Dept,Desg,charges,hours,ldt);
			
		}
		else {
			System.out.println("Enter No. Of Emp");
			int NoEmp = sc.nextInt();
			System.out.println("Enter Amount");
			double amt = sc.nextDouble();
			e = new ConEmp(pid,name,mob,email,Dept,Desg,NoEmp,amt,ldt);
			
		}
		dao.save(e);
	}

	@Override
	public boolean deleteID(int id) {
		// TODO Auto-generated method stub
		return dao.removeID(id);
	}

	@Override
	public boolean SalModify(int id, double sal) {
		// TODO Auto-generated method stub
		return dao.updateSal(id,sal);
	}

	@Override
	public List<Emp> displayAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Emp searchbyID(int id) {
		// TODO Auto-generated method stub
		return dao.getID(id);
	}

	@Override
	public List<Emp> sortBySalary() {
		// TODO Auto-generated method stub
		return dao.sortbySal();
	}

	@Override
	public List<Emp> sortByName() {
		// TODO Auto-generated method stub
		return dao.sortByName();
	}

}