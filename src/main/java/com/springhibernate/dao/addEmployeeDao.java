package com.springhibernate.dao;

import java.util.List;

import com.springhibernate.model.addEmployeeModel;

public interface addEmployeeDao {

	public List<addEmployeeModel> listEmp();

	public addEmployeeModel editgetid(int id);

	public void saveEmployee(addEmployeeModel empmodel);

	public void deleteEmp(addEmployeeModel empmodel);    

}
