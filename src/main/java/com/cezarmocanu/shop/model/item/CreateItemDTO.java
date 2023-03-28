package com.cezarmocanu.shop.model.item;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateItemDTO {

    @NotBlank
    private String name;

    @PositiveOrZero
    private BigDecimal price;
}
