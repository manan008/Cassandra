package com.eg.springcsdra;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class SpringcsdraApplication implements CommandLineRunner {

	@Autowired
	CrudRepository<Customer, Integer> crepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringcsdraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		crepo.save(new Customer(1, "fff", "llll", 25));
		crepo.save(new Customer(2, "aaa", "mmm", 26));
		crepo.save(new Customer(3, "bbb", "nnnn", 28));
		crepo.save(new Customer(4, "ccc", "ppp", 22));
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "fff", "llll", 25));
		list.add(new Customer(2, "aaa", "mmm", 26));
		crepo.saveAll(list);
		crepo.deleteById(1);
	}

}
