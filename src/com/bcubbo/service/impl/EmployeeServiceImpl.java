package com.bcubbo.service.impl;

import java.util.List;

import com.bcubbo.dao.EmployeeMapper;
import com.bcubbo.pojo.Department;
import com.bcubbo.pojo.Employee;
import com.bcubbo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getEmployeeListByDepId(Department dept) {
		return employeeMapper.getEmployeeListByDepId(dept);
	}

	@Override
	public Employee getEmployeeById(Employee employee) {
		return employeeMapper.getEmployeeById(employee);
	}
	
	
	
	
	
	
	
	
	
	
	
//setter&getter
	public EmployeeMapper getEmployeeMapper() {
		return employeeMapper;
	}

	public void setEmployeeMapper(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}

	
	
	
	
	
}
