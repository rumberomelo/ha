package com.example.ha.infrastructure.adapters.outbound.persistence.model;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "products")
@Entity
public class ProductPersistenceEntity {

	@Id
	@Column(name = "productId", unique = true)
	private UUID productId;

	@Column(name = "amount")
	private Integer amount;

	
	@Column(name = "deliveryDate")
	private Instant deliveryDate;

	@ManyToOne()
	@JoinColumn(name = "order_id")
	private OrderPersistenceEntity order;

}
