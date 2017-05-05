package com.figenonun.company.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.figenonun.company.dto.DepartmentDto;
import com.figenonun.company.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@RequestMapping(value="/department", method= RequestMethod.GET)
	public List<DepartmentDto> getDepartments(){
			
		return service.getDepartmentsAll();
	}
	@RequestMapping(value="/department/post", method= RequestMethod.POST, produces = "application/json")
	public String postDepartments( @RequestBody DepartmentDto departman){
			System.out.println(departman.getName());
			service.addDepartment(departman);
		return "200";
	}
	@RequestMapping(value="/department/put", method= RequestMethod.PUT, produces = "application/json")
	public String putDepartments( @RequestBody DepartmentDto departman,DepartmentDto departmentDto){
		departmentDto=service.findDepartmentWithID(departman.getId());
			System.out.println(departmentDto.getName());
			service.updateDepartment(departman);
		return "200";
	}
	@RequestMapping(value="/department/delete", method= RequestMethod.DELETE, produces = "application/json")
	public void deleteDepartments( @RequestBody DepartmentDto departman,DepartmentDto departmentDto){
		departmentDto=service.findDepartmentWithID(departman.getId());
		System.out.println(departmentDto.getName());
			service.deleteDepartment(departmentDto.getId());
	}
}
