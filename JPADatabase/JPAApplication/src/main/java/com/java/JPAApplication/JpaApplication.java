package com.java.JPAApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class JpaApplication {

	@Autowired
	private TestRepository repo;
	@Autowired
	private UserRepository userrepo;

	@GetMapping("/hello")
	public String hello() {

		return "Hello World!.. This is from JPA Api";
	}

	@GetMapping("/")
	public List<Test> begin() {

		return repo.findAll();
	}

	@GetMapping("/test")
	public List<Test> getData() {

		return repo.findAll();
	}

	@GetMapping("/employee")
	public List<Employees> getemployee() {

		return userrepo.findAll();
	}
	
	@RequestMapping("/employee/{id}")
	public Employees getEmployeebyId(@PathVariable Integer id) {
		
		return userrepo.findById(id).get();
	}
	
	@RequestMapping("/test/{id}")
	public Test getUserbyId(@PathVariable Integer id) {
		
		return repo.findById(id).get();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public String addEmployee(@RequestBody Employees user) {

		Employees user1 = new Employees();
		user1.setEmp_no(user.getEmp_no());
		user1.setBirth_date(user.getBirth_date());
		user1.setFirst_name(user.getFirst_name());
		user1.setLast_name(user.getLast_name());
		user1.setGender(user.getGender());
		user1.setHire_date(user.getHire_date());
		
		String s = "Thank you, " + user.getFirst_name() + " Has been Registerd";

		userrepo.save(user1);
		return s;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/test")
	public List<Test> addUser(@RequestBody Test user) {

		repo.save(user);
		return repo.findAll();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/test/{id}")
	public List<Test> updateUser(@RequestBody Test user, @PathVariable Integer id ) {
		 
		repo.save(user);
		return repo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
	public List<Employees> updateEmployee(@RequestBody Employees user, @PathVariable Integer id) {
		 
		userrepo.save(user);
		return userrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public List<Employees> deleteEmployee(@PathVariable Integer id) {
		
		userrepo.deleteById(id);
		return userrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/test/{id}")
	public List<Test> deleteTopic(@PathVariable Integer id) {
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
