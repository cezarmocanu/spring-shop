package com.cezarmocanu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezarmocanu.shop.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
