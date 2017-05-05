package com.figenonun.company.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.figenonun.company.dto.EmployeeDto;
import com.figenonun.company.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/employee", method= RequestMethod.GET)
	public List<EmployeeDto> getEmployees(){
						
		return service.getEmployeesAll();
	}
	@RequestMapping(value="/employee/post", method= RequestMethod.POST, produces = "application/json")
	public String postEmployees( @RequestBody EmployeeDto employee){
			System.out.println(employee.getName());
			service.addEmployee(employee);
		return "200";
	}
	@RequestMapping(value="/employee/put", method= RequestMethod.PUT, produces = "application/json")
	public String putEmployees( @RequestBody EmployeeDto employee,EmployeeDto employeeDto){
		employeeDto=service.findEmployeeWithID(employee.getId());
			System.out.println(employeeDto.getName());
			service.updateEmploye(employee);
		return "200";
	}
	@RequestMapping(value="/employee/delete", method= RequestMethod.DELETE, produces = "application/json")
	public void deleteDepartments( @RequestBody EmployeeDto employee,EmployeeDto employeeDto){
		employeeDto=service.findEmployeeWithID(employee.getId());
		System.out.println(employeeDto.getName());
			service.deleteEmploye(employeeDto.getId());
	}
}
