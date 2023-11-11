/**
 * 
 */
package com.demo.Service;

import java.util.List;

import com.demo.Beans.Emp;

/**
 * 
 */
public interface ServIf {

	void addEmp(int ch);

	boolean deleteID(int id);

	boolean SalModify(int id, double sal);

	List<Emp> displayAll();

	Emp searchbyID(int id);

	List<Emp> sortBySalary();

	List<Emp> sortByName();

}
