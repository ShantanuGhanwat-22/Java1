package com.demo.Service;

import java.util.Set;

import com.demo.Beans.Emp;

public interface ServIf {

	void addEmp(int ch);

	Set<Emp> displayAll();

	boolean modifySal(int id, double sal);

	boolean deleteID(int id);

	Emp seaarchID(int id);

	Set<Emp> sortBySal();

	Set<Emp> sortByName();

	Emp[] getTopEmp(int n);

}
