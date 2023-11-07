package com.demo.Beans;

import java.time.LocalDate;

public class VenEmp extends Emp {
	private int NoEmp;
    private double Amt;
    private static LocalDate dOJ;
    public VenEmp() {

    }
    
    public VenEmp(int noEmp, double amt) {
        NoEmp = noEmp;
        Amt = amt;
    }
    public VenEmp(int pid, String name, String mobile, String email, String dept, String designtn, int noEmp, double amt,LocalDate dOJ) {
        super(pid, name, mobile, email, dept, designtn);
        NoEmp = noEmp;
        Amt = amt;
    }
    public int getNoEmp() {
        return NoEmp;
    }
    public void setNoEmp(int noEmp) {
        NoEmp = noEmp;
    }
    public double getAmt() {
        return Amt;
    }
    public void setAmt(double amt) {
        Amt = amt;
    }
    @Override
    public String toString() {
        return super.toString()+"VenEmp [NoEmp=" + NoEmp + ", Amt=" + Amt + "]";
    }

    @Override
    public double CalSal() {
        // TODO Auto-generated method stub
        return NoEmp*Amt;
    }
    
}
