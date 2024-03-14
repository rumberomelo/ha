package com.example.ha.infrastructure.adapters.inboud.rest.controller.impl;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ha.application.port.inbound.order.CreateOrderUseCasePort;
import com.example.ha.domain.order.OrderModel;
import com.example.ha.infrastructure.adapters.inboud.rest.controller.OrderAdapterRestController;
import com.example.ha.infrastructure.adapters.inboud.rest.controller.mapper.OrderInBoundRestMapper;
import com.example.ha.infrastructure.adapters.inboud.rest.controller.request.OrderAdapterRequest;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class OrderAdapterRestControllerImpl implements OrderAdapterRestController{

	
	private OrderInBoundRestMapper mapper;
	
	private CreateOrderUseCasePort createOrderUseCasePort;
	
	@Override
	public ResponseEntity<UUID> createOrder(OrderAdapterRequest body) {
		OrderModel useCaseData = mapper.toModel(body);
		
		UUID orderId = createOrderUseCasePort.launch (useCaseData);
		
		return ResponseEntity.created(null).body(orderId);
	}

}
