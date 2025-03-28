package com.bsp.projbim.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    @ManyToOne //Muitos registros para um
    @JoinColumn(name = "order_id")
    private Orders order;
    
    
    public OrderItemPK() {
    	
    }


	public OrderItemPK(Product product, Orders order) {
		this.product = product;
		this.order = order;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
    
    
    


}
