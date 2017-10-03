package com.bcubbo.dao;

import java.util.List;

import com.bcubbo.pojo.Department;
import com.bcubbo.pojo.Employee;

public interface EmployeeMapper {
	
	//获取员工列表
	public List<Employee> getEmployeeList();
	public int add(Employee employee);
	
	//实现根据部门查处该部门下的员工信息
	public List<Employee> getEmployeeListByDepId(Department dept);
	
	//实现查询员工详细信息
	public Employee getEmployeeById(Employee employee);
	
	

}
