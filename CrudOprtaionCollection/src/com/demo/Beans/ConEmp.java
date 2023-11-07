package com.demo.Beans;

import java.time.LocalDate;

public class ConEmp extends Emp{
	private int hrs;
    private double Charges;
    private static LocalDate dOJ;

     public ConEmp() {
    }

    public ConEmp(int pid, String name, String mobile, String email, String dept, String designtn,int hrs,double Charges,LocalDate dOJ) {
        super(pid, name, mobile, email, dept, designtn);
    }
   
    public int getHrs() {
        return hrs;
    }
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
    public double getCharges() {
        return Charges;
    }
    public void setCharges(double charges) {
        Charges = charges;
    }
    @Override
    public String toString() {
        return super.toString()+"ConEmp [hrs=" + hrs + ", Charges=" + Charges + "]";
    }
    @Override
    public double CalSal() {
        // TODO Auto-generated method stub
        return hrs*Charges;
    }
    
}
