package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.models.EmployeeDetails;
@RepositoryRestResource
public interface EmployeeRepo extends CrudRepository<EmployeeDetails, Long>{
	
	

}
