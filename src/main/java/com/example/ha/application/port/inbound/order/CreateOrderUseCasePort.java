package com.example.ha.application.port.inbound.order;

import java.util.UUID;

import com.example.ha.domain.order.OrderModel;

public interface CreateOrderUseCasePort {

	UUID launch(OrderModel useCaseData);

}
