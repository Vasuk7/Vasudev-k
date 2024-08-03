/**
 * 
 */
package com.springbootapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.springbootapplication.Service.EmployeeService;

/**
 * 
 */
@RestController
public class EmployeeController {

	@Autowired  // injected dependency of service
	EmployeeService employeeService;

	@GetMapping( "/getEmployee/{id}")
	public ResponseEntity<String > getEmployee(@PathVariable Integer id){
		String emp= employeeService.getEmployee(id);
		return ResponseEntity.ok(emp);
		
	}
	

}
