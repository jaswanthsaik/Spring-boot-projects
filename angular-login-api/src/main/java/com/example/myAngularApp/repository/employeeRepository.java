package com.example.myAngularApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myAngularApp.model.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {
 
}
