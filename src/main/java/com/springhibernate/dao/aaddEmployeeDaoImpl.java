package com.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
//import org.hibernate.Criteria;
//import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
//import org.hibernate.cfg.Configuration;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhibernate.model.addEmployeeModel;

@Repository("EmployeeDao")
public class aaddEmployeeDaoImpl implements addEmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("deprecation")
	@Override
	public List<addEmployeeModel> listEmp() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createCriteria(addEmployeeModel.class).list();	
	}

	@Override
	public addEmployeeModel editgetid(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().get(addEmployeeModel.class, id); 
	}

	@Override
	public void saveEmployee(addEmployeeModel empmodel) {
		// TODO Auto-generated method stub

		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(empmodel);
		
	}

	@Override
	public void deleteEmp(addEmployeeModel empmodel) {
		// TODO Auto-generated method stub
//		sessionFactory.openSession().createQuery("delete from addEmployeeModel where Id="+empmodel.getId()).executeUpdate();
//		Session currentSession = entityManager.unwrap(Session.class);
		Session currentSession = entityManager.unwrap(Session.class);
		addEmployeeModel employeeObj = currentSession.get(addEmployeeModel.class, empmodel.getId());
		System.out.println("Employee Id------->"+employeeObj);

		currentSession.delete(employeeObj);
	}

}
