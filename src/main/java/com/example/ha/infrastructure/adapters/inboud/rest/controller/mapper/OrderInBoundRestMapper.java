package com.example.ha.infrastructure.adapters.inboud.rest.controller.mapper;

import org.mapstruct.Mapper;

import com.example.ha.domain.order.OrderModel;
import com.example.ha.infrastructure.adapters.inboud.rest.controller.request.OrderAdapterRequest;

@Mapper(componentModel = "spring")
public interface OrderInBoundRestMapper {
	
	OrderModel toModel (OrderAdapterRequest order);

}
