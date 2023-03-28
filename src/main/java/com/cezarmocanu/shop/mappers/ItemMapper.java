package com.cezarmocanu.shop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cezarmocanu.shop.model.item.CreateItemDTO;
import com.cezarmocanu.shop.model.item.Item;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    Item fromCreateDTO(CreateItemDTO dto);
}
