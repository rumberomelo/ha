package com.example.ha.infrastructure.adapters.outbound.persistence.impl;

import org.springframework.stereotype.Component;

import com.example.ha.application.port.outbound.order.OrderRepositoryPort;
import com.example.ha.domain.order.OrderModel;
import com.example.ha.infrastructure.adapters.outbound.persistence.mapper.OrderOutBoundPersistenceMapper;
import com.example.ha.infrastructure.adapters.outbound.persistence.model.OrderPersistenceEntity;
import com.example.ha.infrastructure.adapters.outbound.persistence.repository.OrderPersistenceRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepositoryPort{
	
	private OrderPersistenceRepository orderRepository;
	
	private OrderOutBoundPersistenceMapper mapper;

	@Override
	public void save(OrderModel useCaseData) {

		OrderPersistenceEntity entity = mapper.toEntity(useCaseData);
		
		orderRepository.save(entity);	
		
	}

}
