package com.Capgemini.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Capgemini.Entity.Employee;
import com.Capgemini.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeContorller {

	@Autowired
	private EmployeeService es;
	
	
	@GetMapping("/getmsg/{msg}")
	public String getmsg(@PathVariable String msg) {
		return "hello "+msg;
	}
	
	@GetMapping("/getint")
	public String getint(@RequestParam int a,@RequestParam int b) {
		int c=a+b;
		return "the value of c is "+c;
	}
	
	@PostMapping("/addempdata")
	public String addemployee(@RequestBody Employee emp){
		String add=es.addemployee(emp);
	     System.out.println(add);
		return add;
	}
	
	@GetMapping("/getemp")
	public List<Employee> getempdata() {
	 List<Employee> lt=	es.getempdata();
	  System.out.println(lt);
	  return lt;
	}
	
}
