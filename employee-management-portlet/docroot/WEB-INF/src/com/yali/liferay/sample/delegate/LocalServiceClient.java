package com.yali.liferay.sample.delegate;

import java.util.List;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.sample.model.Employee;
import com.liferay.sample.service.EmployeeLocalServiceUtil;


public class LocalServiceClient {
	Logger log=Logger.getLogger(LocalServiceClient.class);
	public List<Employee> getEmployees(){
		List<Employee> employees=null;
		try {
			int empCount=EmployeeLocalServiceUtil.getEmployeesCount();
			employees=EmployeeLocalServiceUtil.getEmployees(0, empCount);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
	public Employee saveEmployee(Employee employee){		
		try {			
			employee=EmployeeLocalServiceUtil.addEmployee(employee);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
}
