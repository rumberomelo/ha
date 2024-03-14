package com.example.ha.infrastructure.adapters.inboud.rest.controller.request;

import java.time.Instant;
import java.util.UUID;

import lombok.Data;

@Data
public class ProductAdapterRequest {

	private UUID productId;
	
	private Integer amount;
	
	private Instant deliveryDate;
}
