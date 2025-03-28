package com.bsp.projbim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	@Column(nullable = false)
	private Integer quantity = 1;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Product product, Orders order) {
		id.setProduct(product);
		id.setOrder(order);
	}
	
	
	
    
}
