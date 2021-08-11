package com.bhgroup.beans;

import org.springframework.beans.factory.annotation.Value;

public class Department {
	
	@Value("${deptNo}")
	private int deptNo;
	
	@Value("${deptName}")
	private String deptName;
	
	private Employee employee;

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", employee=" + employee + "]";
	}

	

}
