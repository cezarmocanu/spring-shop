package com.cezarmocanu.shop.model.customerOrderItem;

import com.cezarmocanu.shop.model.customerOrder.CustomerOrder;
import com.cezarmocanu.shop.model.item.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;

@Builder
@Entity
public class CustomerOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerOrder order;

    @ManyToOne
    private Item item;
}
