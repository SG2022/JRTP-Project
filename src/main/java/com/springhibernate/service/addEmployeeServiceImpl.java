package com.springhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.springhibernate.dao.addEmployeeDao;
import com.springhibernate.model.addEmployeeModel;

@Service("EmployeeService")
@Transactional//(propagation=Propagation.SUPPORTS)
public class addEmployeeServiceImpl implements addEmployeeService {
	
	@Autowired
	private addEmployeeDao EmployeeDao;

	@Override
	@Transactional
	public List<addEmployeeModel> listEmp() {
		// TODO Auto-generated method stub
		return EmployeeDao.listEmp();
	}

	@Override
	@Transactional
	public addEmployeeModel editgetid(int id) {
		// TODO Auto-generated method stub
		
		return EmployeeDao.editgetid(id);
	}

	@Override
	@Transactional
	public void saveEmployee(addEmployeeModel empmodel) {
		// TODO Auto-generated method stub
		EmployeeDao.saveEmployee(empmodel);
	}

	@Override
	public void deleteEmp(addEmployeeModel empmodel) {
		// TODO Auto-generated method stub
	 EmployeeDao.deleteEmp(empmodel);	
	}

}
