package com.example.CustomerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

