/**
 * 
 */
package com.demo.DAO;

import com.demo.Beans.Emp;
import java.time.LocalDate;
import java.util.*;

import com.demo.Beans.Emp;
import com.demo.Beans.*;
/**
 * 
 */
public class EmpDaoImpl implements EmpDaoIf {
			static List<Emp> elist;
		static {
			elist =new ArrayList<>();
			elist.add(new SalEmp(1,"Shantanu","9403263513","ghanwatshantanu22@gamail.com","Cloud","Cloud Arch",1400000,60000,LocalDate.of(2024, 04,04)));
			elist.add(new ConEmp(2,"Rancho","9403263513","ghanwatshantanu22@gamail.com","Cloud","Cloud Arch",1500,60,LocalDate.of(2024, 04,04)));
			elist.add(new VenEmp(3,"Farhan","9403263513","ghanwatshantanu22@gamail.com","Cloud","Cloud Arch",12,600,LocalDate.of(2024, 04,04)));
		}

		@Override
		public void save(Emp e) {
			elist.add(e);
		}

		@Override
		public boolean removeID(int id) {
			// TODO Auto-generated method stub
			return elist.remove(new SalEmp(id));
		}
		
		@Override
		public List<Emp> getAll() {
			// TODO Auto-generated method stub
			return elist;
		}

		@Override
		public boolean updateSal(int id, double sal) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Emp getID(int id) {
			// TODO Auto-generated method stub
			int ps = elist.indexOf(new SalEmp(id));
			if(ps!=-1) {
				return elist.get(ps);
			}
			return null;
		}

		@Override
		public List<Emp> sortbySal() {
			List<Emp> elst = new ArrayList<>();
			for(Emp e : elist ) {
				elst.add(e);
			}
			Comparator<Emp> mysal = (O1,O2)->{
				double Sal1=0,Sal2=0;
				if(O1 instanceof SalEmp) {
					Sal1=((SalEmp)O1).getSal();
				}
				else if (O1 instanceof ConEmp) {
					Sal1=((ConEmp)O1).getCharges();
				}
				else {
					Sal1=((VenEmp)O1).getAmt();
				}
				if(O2 instanceof SalEmp) {
					Sal2=((SalEmp)O2).getSal();
				}
				else if (O2 instanceof ConEmp) {
					Sal2=((ConEmp)O2).getCharges();
				}
				else {
					Sal2=((VenEmp)O2).getAmt();
				}
			return (int)(Sal1-Sal2);
		};
		
		elst.sort(mysal);
		return elst;
	}

		@Override
		public List<Emp> sortByName() {
			List<Emp> elst = new ArrayList<>();
			for(Emp e : elist) {
				elst.add(e);
			}
			elst.sort(null);;
			return elst;
		}
}		
	