package com.springhibernate.service;

import java.util.List;

import com.springhibernate.model.addEmployeeModel;

public interface addEmployeeService {

	public List<addEmployeeModel> listEmp();
 
	public addEmployeeModel editgetid(int id);

	public void saveEmployee(addEmployeeModel empmodel);

	public void deleteEmp(addEmployeeModel empmodel); 
	   

}
