package com.practice.order.mapper;

import com.practice.order.dto.OrderDTO;
import com.practice.order.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO toDTO(Order order);
    Order toEntity(OrderDTO orderDTO);
}
