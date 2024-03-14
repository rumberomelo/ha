package com.example.ha.infrastructure.adapters.outbound.persistence.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "orders")
@Entity
public class OrderPersistenceEntity {
	
	@Id
	@Column(name = "id", unique = true)
	private UUID id;

	@Column(name = "userId")
	private UUID userId;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProductPersistenceEntity> products;

}
