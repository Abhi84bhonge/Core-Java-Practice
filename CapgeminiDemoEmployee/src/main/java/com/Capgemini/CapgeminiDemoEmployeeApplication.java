package com.Capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com", "salary" })
public class CapgeminiDemoEmployeeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CapgeminiDemoEmployeeApplication.class, args);

		ApplicationContext ac = SpringApplication.run(CapgeminiDemoEmployeeApplication.class, args);
		System.out.println();
		System.err.println("Beans counts :-> " + ac.getBeanDefinitionCount());
		System.out.println();
		System.err.println("All Under Package and Outside Package Components ");
		for (String bean : ac.getBeanDefinitionNames()) {
			if (bean.contains("employee")) {
				System.err.println("---> " + bean);
			}
		}
		System.err.println("App Started!!!");
	}

}
