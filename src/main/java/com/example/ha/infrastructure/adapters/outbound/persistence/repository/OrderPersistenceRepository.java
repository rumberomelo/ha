package com.example.ha.infrastructure.adapters.outbound.persistence.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ha.infrastructure.adapters.outbound.persistence.model.OrderPersistenceEntity;

public interface OrderPersistenceRepository extends JpaRepository<OrderPersistenceEntity, UUID>{

}
