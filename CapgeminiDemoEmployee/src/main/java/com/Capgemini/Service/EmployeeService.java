package com.Capgemini.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Capgemini.DAO.EmployeeRepository;
import com.Capgemini.Entity.Employee;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository edao;
	
	
	public String addemployee(Employee emp) {
		if(edao.addemployee(emp)) {
			return "employee added successfully!!";
			
		}else {
			return "employee not add";
		}
		
	}


	public List<Employee> getempdata() {
       return edao.getempdata();	}

}
