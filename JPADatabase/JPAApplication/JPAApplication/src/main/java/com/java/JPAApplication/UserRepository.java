package com.java.JPAApplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employees, Integer>{
	
}
