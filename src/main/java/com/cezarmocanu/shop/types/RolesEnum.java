package com.cezarmocanu.shop.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RolesEnum {
    DEFAULT("DEFAULT"),
    ADMIN("ADMIN");

    private final String role;
}
