package com.example.ha.infrastructure.adapters.inboud.rest.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ha.infrastructure.adapters.inboud.rest.controller.request.OrderAdapterRequest;

public interface OrderAdapterRestController {

	@PostMapping(path="/orders", consumes = "application/json", produces = "application/json")
	ResponseEntity<UUID> createOrder(@RequestBody final OrderAdapterRequest body);

}
