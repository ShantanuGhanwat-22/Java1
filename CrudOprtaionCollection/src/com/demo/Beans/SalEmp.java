package com.demo.Beans;

import java.time.LocalDate;

public class SalEmp extends Emp{
	private static LocalDate dOJ;
    private double Sal;
    private double Bonus;

     public SalEmp() {
    }
    public SalEmp(int pid, String name, String mobile, String email, String dept, String designtn, double sal,
            double bonus,LocalDate doj) {
        super(pid, name, mobile, email, dept, designtn);
        Sal = sal;
        Bonus = bonus;
        }


    public SalEmp(int id) {
		// TODO Auto-generated constructor stub
    	super(id);
	}
	public double getSal() {
        return Sal;
    }


    public void setSal(double sal) {
        Sal = sal;
    }


    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }


    @Override
    public String toString() {
        return super.toString() +"SalEmp [Sal=" + Sal + ", Bonus=" + Bonus + "]";
    }
    
    @Override
    public double CalSal() {
        // TODO Auto-generated method stub
        return Sal+0.10*Sal+0.15-0.08*Sal+Bonus;
    }

}
