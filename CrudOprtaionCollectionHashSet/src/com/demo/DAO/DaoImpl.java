package com.demo.DAO;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.Beans.*;

public class DaoImpl implements Daoif {
	static Set<Emp> hs;
	static{
		hs = new HashSet<>();
		hs.add(new SalEmp(1,"Shantanu","9403263513","ghanwatshantanu2209@gmail.com","Cloud","SDE",1400000,70000,LocalDate.of(2024,04,24)));
		hs.add(new ConEmp(2,"Prashant","7896511612","prashantbandgar@gmail.com","Cloud","SDE",14,70000,LocalDate.of(2024,04,24)));
		hs.add(new VenEmp(3,"Farhan","940326456","farhanakhtar@gmail.com","Cloud","SDE",14,70000,LocalDate.of(2024,04,24)));
	}
	@Override
	public void save(Emp e) {
		// TODO Auto-generated method stub
		hs.add(e);
	}
	@Override
	public Set<Emp> getAll() {
		// TODO Auto-generated method stub
		return hs;
	}
	@Override
	public boolean updateSal(int id, double sal) {
		Emp e = getById(id);
		if(e!=null) {
			if ( e instanceof SalEmp) {
				((SalEmp) e).setSal(sal);
			}
			else if (e instanceof ConEmp) {
				((ConEmp) e).setCharges(sal);
			}
			else {
				((VenEmp)e).setAmt(sal);
			}
			return true;	
		}
		return false;
	}
	private Emp getById(int id) {
		for(Emp e:hs) {
			if(e.getPid()==id) {
				return e;
			}
		}
		return null;
	}
	@Override
	public boolean deleteByID(int id) {
		
		return hs.remove(new SalEmp(id));
	}
	@Override
	public Emp findbyID(int id) {
		for(Emp e:hs) {
			if(e.getPid()==id) {
				return e;
			}
		}
		return null;
	}
	@Override
	public Set<Emp> sortBysal() {
		Comparator<Emp> mysal =(O1,O2)->{
			double s1=0,s2=0;
			if(O1 instanceof SalEmp) {
				s1 = ((SalEmp) O1).getSal();
			}
			else if (O1 instanceof ConEmp) {
				s1=((ConEmp) O1).getCharges();
			}
			else {
				s1 = ((VenEmp)O1).getAmt();
			}
			if(O2 instanceof SalEmp) {
				s2 = ((SalEmp) O2).getSal();
			}
			else if (O2 instanceof ConEmp) {
				s2=((ConEmp) O2).getCharges();
			}
			else {
				s2 = ((VenEmp)O2).getAmt();
			}
			return (int) (s1-s2);
		};
			TreeSet<Emp> ts = new TreeSet<>(mysal);
			for(Emp e:hs) {
				ts.add(e);
			}
			return ts;
	}
	@Override
	public Set<Emp> sortbyname() {
		TreeSet<Emp> ts = new TreeSet<>();
		for(Emp e:hs) {
			ts.add(e);
		}
		return ts;
	}
	@Override
	public Emp[] gettopEmp(int n) {
		Set<Emp> ts = sortBysal();
		Emp[]earr=new Emp[n];
		int cnt =0 ;
		for(Emp e:ts) {
			earr[cnt]=e;
			cnt++;
			if(cnt==n) {
				break;
			}
			
		}
		return earr;
	}
}
