package com.javainuse.service;

import com.javainuse.annotation.OperationEnum;
import com.javainuse.annotation.Permission;
import com.javainuse.core.AbstractCrudService;
import com.javainuse.model.Employee;
import org.springframework.stereotype.Service;

@Service
@Permission(value = "user.view", operation = OperationEnum.READ)
public class EmployeeService extends AbstractCrudService {

	@Permission("user.edit")
	public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}