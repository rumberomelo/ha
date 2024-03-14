package com.example.ha.domain.order;

import java.util.List;
import java.util.UUID;

import lombok.Data;



@Data
public class OrderModel {
	
	private UUID id;

	private UUID userId;
	
	private List<ProductModel> products;
	
	public boolean isOrderValid (Long maxValue, Integer minProductsCount) {
		

		if (products == null || products.size() < minProductsCount)
			return false;
		
		if (products.stream().mapToInt(o -> o.getAmount()).sum() > maxValue )
			return false;
		
		
		return true;
		
	}

	public void init() {
		id = UUID.randomUUID();
		
		if (products == null )
			products.stream().forEach(product -> product.init());
		
	}

}
