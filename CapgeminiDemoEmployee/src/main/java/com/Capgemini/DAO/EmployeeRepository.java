package com.Capgemini.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Capgemini.Entity.Employee;

@Repository
public class EmployeeRepository {

	
	@Autowired
	private SessionFactory sf;
	
	public boolean addemployee(Employee emp) {
		Session sn=sf.openSession();
		sn.save(emp);
		sn.beginTransaction().commit();
		return true;
	}

	public List<Employee> getempdata() {
	Session sn=sf.openSession();
	List<Employee> lt=sn.createQuery("from Employee ",Employee.class).list();
	 sn.beginTransaction().commit();
	 sn.close();
	return lt;
	}

}
