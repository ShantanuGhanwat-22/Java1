package com.demo.DAO;

import java.util.Set;

import com.demo.Beans.Emp;

public interface Daoif {

	void save(Emp e);

	Set<Emp> getAll();

	boolean updateSal(int id, double sal);

	boolean deleteByID(int id);

	Emp findbyID(int id);

	Set<Emp> sortBysal();

	Set<Emp> sortbyname();

	Emp[] gettopEmp(int n);

}
