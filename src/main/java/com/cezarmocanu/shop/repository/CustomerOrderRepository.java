package com.cezarmocanu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezarmocanu.shop.model.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

}
