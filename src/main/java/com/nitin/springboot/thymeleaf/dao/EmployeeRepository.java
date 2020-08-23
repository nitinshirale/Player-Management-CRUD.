package com.nitin.springboot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitin.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
