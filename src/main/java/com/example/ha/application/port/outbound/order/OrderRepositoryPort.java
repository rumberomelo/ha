package com.example.ha.application.port.outbound.order;

import com.example.ha.domain.order.OrderModel;

public interface OrderRepositoryPort {

	void save(OrderModel useCaseData);

}
