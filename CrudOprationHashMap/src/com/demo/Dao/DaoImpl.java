package com.demo.Dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;
import com.demo.Beans.*;


public class DaoImpl implements Daoif {
	static Map<Integer,Emp> hm;
	static {
		hm = new HashMap<>();
		hm.put(1,new SalEmp(12,"Rajat","4444","a@gmail.com","hr","associate",5000,6000,LocalDate.of(2002, 12,30)));
		hm.put(2,new ConEmp(13,"xyz","4444","a@gmail.com","hr","associate",4000,400,LocalDate.of(2002, 12,30)));
		hm.put(3,new VenEmp(14,"Raja","4444","a@gmail.com","hr","associate",3450,4550,LocalDate.of(2002, 12,30)));
	}

	@Override
	public void save(Emp e) {
		// TODO Auto-generated method stub
		if(!hm.containsKey(e.getPid())) {
			hm.put(e.getPid(),e);
		}
	}
	
	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		List<Emp> em = new ArrayList<Emp>(hm.values());
		System.out.println(em);
		return null;
	}

	@Override
	public boolean updateSal(int id, double sal) {
		// TODO Auto-generated method stub
		Emp ob = hm.get(id);
		if(ob!=null) {
			if(ob instanceof SalEmp) {
				((SalEmp) ob).setSal(sal);
			}else if(ob instanceof ConEmp) {
				((ConEmp) ob).setCharges(sal);
			}else {
				((VenEmp)ob).setAmt(sal);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByID(int id) {
		// TODO Auto-generated method stub
		Emp e = hm.remove(id);
		if(e!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Emp findbyID(int id) {
		// TODO Auto-generated method stub
		return hm.get(id);
	}

	@Override
	public List<Emp> sortBysal() {
		// TODO Auto-generated method stub
		Comparator<Emp> c = (o1,o2)->{
			double s1=0,s2=0;
			if(o1 instanceof SalEmp) {
				s1=((SalEmp) o1).getSal();
			}
			else if (o1 instanceof ConEmp) {
				s1 = ((ConEmp) o1).getCharges();
			}
			else {
				s1 = ((VenEmp)o1).getAmt();
			}
			if(o2 instanceof SalEmp) {
				s2=((SalEmp) o2).getSal();
			}
			else if (o2 instanceof ConEmp) {
				s2 = ((ConEmp) o2).getCharges();
			}
			else {
				s2 = ((VenEmp)o2).getAmt();
			}
			return (int) (s1-s2);	
		};
		List<Emp> elst = new ArrayList<Emp>(hm.values());
		//elst.sort(c);
		return elst;
	}

	@Override
	public List<Emp> sortbyname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp[] gettopEmp(int n) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
