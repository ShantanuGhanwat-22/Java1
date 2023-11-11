package com.demo.Dao;

import java.util.List;
import java.util.Set;

import com.demo.Beans.Emp;

public interface Daoif {

	void save(Emp e);

	List<Emp> getAll();

	boolean updateSal(int id, double sal);

	boolean deleteByID(int id);

	Emp findbyID(int id);

	List<Emp> sortBysal();

	List<Emp> sortbyname();

	Emp[] gettopEmp(int n);

}
