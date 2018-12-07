package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.EmployeeDetails;
import com.example.service.TestDao;

@RestController
public class TestController {
	@Autowired
	TestDao testDao;
	@GetMapping("/abc/save")
	public void save(){
		testDao.getdkdk();
	}
//	@PostMapping(value="/saveEmployee")
//	public EmployeeDetails saveEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
//		return testDao.saveEmployeeDetails(employeeDetails);
//	}
}
