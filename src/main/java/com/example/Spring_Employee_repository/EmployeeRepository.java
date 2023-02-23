package com.example.Spring_Employee_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_Employee_Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
