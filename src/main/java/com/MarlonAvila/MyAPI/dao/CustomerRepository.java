package com.MarlonAvila.MyAPI.dao;

import com.MarlonAvila.MyAPI.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
