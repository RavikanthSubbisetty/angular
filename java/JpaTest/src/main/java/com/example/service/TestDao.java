package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepo;
import com.example.dao.TestRepo;
import com.example.models.EmployeeDetails;
import com.example.models.Nice;

@Service
public class TestDao implements TestService {

	@Autowired
	TestRepo testRepo;
	@Autowired
	EmployeeRepo employeeRepo;
	
	public void getdkdk(){
		Nice n=new Nice();
		n.setId(9l);
		n.setName("sdfs");
		testRepo.save(n);
		System.out.println("-----");
		
	}
	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {
		return employeeRepo.save(employeeDetails);
	}

	
	
	
}
