package com.cezarmocanu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezarmocanu.shop.model.CustomerOrderItem;

public interface CustomerOrderItemRepository extends JpaRepository<CustomerOrderItem, Long> {

}
