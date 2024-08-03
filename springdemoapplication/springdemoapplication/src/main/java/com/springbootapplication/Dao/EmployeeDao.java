package com.springbootapplication.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	public String getEmployee (Integer id) {
		return "emp";
	}
}
