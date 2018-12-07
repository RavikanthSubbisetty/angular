package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.models.Nice;

@RepositoryRestResource
public interface TestRepo extends PagingAndSortingRepository<Nice, Long> {

}
