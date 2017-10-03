package com.bcubbo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcubbo.pojo.Department;
import com.bcubbo.pojo.Employee;
import com.bcubbo.service.EmployeeService;

public class EmployeeServiceTest {
	private Logger logger = (Logger)LogManager.getLogger();
	private EmployeeService employeeService;
	private ApplicationContext ctx;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		employeeService = (EmployeeService)ctx.getBean("employeeService");
		
	}

	@Test
	public void test() {
		
		List<Employee> employeeList = null;
		
		Department department = new Department();
		department.setId(2);
		
		employeeList = employeeService.getEmployeeListByDepId(department);
		
		if(employeeList!=null && employeeList.size()>0) {
			
			for(Employee emp:employeeList) {
				
				logger.debug("员工姓名:"+emp.getName());
				logger.debug("员工部门:"+emp.getDepName());
				logger.debug("员工ID:"+emp.getId());
				logger.debug("*****查询结束*****");
			}
			
		}else {
			logger.debug("******查询结果为空******");
		}
		
	}

}
