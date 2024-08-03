package com.springbootapplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapplication.Dao.EmployeeDao;
@Service
public class EmployeeService {

	@Autowired
	EmployeeDao emplyoeedao;
	public String getEmployee (Integer id) {
		String emp = emplyoeedao.getEmployee(id);
		return emp;
	}
}
