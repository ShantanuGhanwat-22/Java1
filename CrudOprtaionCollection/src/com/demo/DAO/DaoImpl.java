package com.demo.DAO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
}
