package com.example.ha.infrastructure.adapters.inboud.rest.controller.request;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class OrderAdapterRequest {
	
	private UUID userId;
	
	private List<ProductAdapterRequest> products;

}
