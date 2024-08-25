package com.guezrou.jsf.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guezrou.jsf.dto.Employee;

@Service("employeService")
public class EmployeService {

	public List<Employee> getEmployee() {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1L, "John", "Doe"));
		employeeList.add(new Employee(2L, "John", "Doe"));
		employeeList.add(new Employee(3L, "John", "Doe"));
		employeeList.add(new Employee(4L, "John", "Doe"));
		return employeeList;

	}

	public String getMessage() {
		return "return JSF 1.2 + Spring Integration Coucou";
	}

}
