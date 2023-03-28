package com.cezarmocanu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezarmocanu.shop.model.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
