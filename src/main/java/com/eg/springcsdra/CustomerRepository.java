package com.eg.springcsdra;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	@Query(value = "SELECT * FROM customer c WHERE c.firstname = ?0")
	public List<Customer> findByFirstName(String firstName);
	
}
