package com.bcubbo.service;

import java.util.List;

import com.bcubbo.pojo.Department;
import com.bcubbo.pojo.Employee;

public interface EmployeeService {
	
	
	//实现根据部门查处该部门下的员工信息
	public List<Employee> getEmployeeListByDepId(Department dept);
	
	//实现查询员工详细信息
	public Employee getEmployeeById(Employee employee);
	
	
	
}
