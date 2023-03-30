package com.cezarmocanu.shop.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cezarmocanu.shop.model.UserIdentity;
import com.cezarmocanu.shop.model.UserIdentityDetails;
import com.cezarmocanu.shop.repository.UserIdentityRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserIdentityDetailsService implements UserDetailsService {

    private UserIdentityRepository userIdentityRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserIdentity identity = userIdentityRepository.findByEmail(username);

        if (identity == null) {
            throw new UsernameNotFoundException(username);
        }

        return new UserIdentityDetails(identity);
    }
}
