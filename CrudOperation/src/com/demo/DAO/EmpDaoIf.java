package com.demo.DAO;

import java.util.List;

import com.demo.Beans.Emp;

public interface EmpDaoIf {

	

	void save(Emp e);

	boolean removeID(int id);

	boolean updateSal(int id, double sal);

	List<Emp> getAll();

	Emp getID(int id);

	List<Emp> sortbySal();

	List<Emp> sortByName();

}
