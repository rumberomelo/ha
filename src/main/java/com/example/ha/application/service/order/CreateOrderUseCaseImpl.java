package com.example.ha.application.service.order;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.ha.application.exception.NotValidOrderExecption;
import com.example.ha.application.port.inbound.order.CreateOrderUseCasePort;
import com.example.ha.application.port.outbound.order.OrderRepositoryPort;
import com.example.ha.domain.order.OrderModel;

@Service
public class CreateOrderUseCaseImpl implements CreateOrderUseCasePort {

	@Value("${app.maxValue}")
	private Long maxValue;
	@Value("${app.minProductsCount}")
	private Integer minProductsCount;

	private OrderRepositoryPort orderRepository;

	private CreateOrderUseCaseImpl(OrderRepositoryPort orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public UUID launch(OrderModel useCaseData) {

		if (!useCaseData.isOrderValid(maxValue, minProductsCount))
			throw new NotValidOrderExecption();

		useCaseData.init();

		orderRepository.save(useCaseData);

		return useCaseData.getId();
	}

}
