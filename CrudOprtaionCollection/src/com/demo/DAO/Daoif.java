package com.demo.DAO;

import java.util.Set;

import com.demo.Beans.Emp;

public interface Daoif {

	void save(Emp e);

	Set<Emp> getAll();

}
