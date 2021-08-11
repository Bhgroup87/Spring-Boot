package com.bhgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.bhgroup.beans.Department;
import com.bhgroup.beans.Employee;

@SpringBootApplication
public class EmpDeptConfig {

	@Autowired
	private Environment env;

	@Bean
	public Department department(Employee employee) {
		Department department = new Department();
		department.setDeptNo(Integer.parseInt(env.getProperty("deptNo")));
		department.setDeptName(env.getProperty("deptName"));

		department.setEmployee(employee);
		return department;
	}

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EmpDeptConfig.class, args);

		Department department = context.getBean("department", Department.class);
		System.out.println(department);
	}

}
