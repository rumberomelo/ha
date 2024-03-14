package com.example.ha.infrastructure.adapters.outbound.persistence.mapper;

import org.mapstruct.Mapper;

import com.example.ha.domain.order.OrderModel;
import com.example.ha.infrastructure.adapters.outbound.persistence.model.OrderPersistenceEntity;

@Mapper(componentModel = "spring")
public interface OrderOutBoundPersistenceMapper {
	
	OrderPersistenceEntity toEntity (OrderModel order);

}
