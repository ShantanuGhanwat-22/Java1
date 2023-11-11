package com.demo.Service;

import java.util.List;
import java.util.Set;

import com.demo.Beans.Emp;

public interface ServIf {

	void addEmp(int ch);

	List<Emp> displayAll();

	boolean modifySal(int id, double sal);

	boolean deleteID(int id);

	Emp seaarchID(int id);

	List<Emp> sortBySal();

	List<Emp> sortByName();

	Emp[] getTopEmp(int n);

}
