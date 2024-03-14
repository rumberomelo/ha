package com.example.ha.domain.order;

import java.time.Instant;
import java.util.UUID;

import lombok.Data;


@Data
public class ProductModel {

	private UUID productId;
	
	private Integer amount;
	
	private Instant deliveryDate;

	public void init() {
		productId = UUID.randomUUID();
	}
}
