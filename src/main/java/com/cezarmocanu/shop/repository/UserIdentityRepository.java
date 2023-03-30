package com.cezarmocanu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezarmocanu.shop.model.UserIdentity;

public interface UserIdentityRepository extends JpaRepository<UserIdentity, Long> {

    UserIdentity findByEmail(String email);
}
