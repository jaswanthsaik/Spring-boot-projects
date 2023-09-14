package com.example.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Additional methods for custom queries, if needed
}
