package com.bsp.projbim.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Product {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal price;
	
	@Column(length = 50)
	private String category;
	
	private String pathImage;
	
	@OneToMany(mappedBy = "product")
	private List<OrderItem> items = new ArrayList<>();
	
	public Product() {
		
	}

	public Product(Long id, String name, BigDecimal price, String category, String pathImage) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.pathImage = pathImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public List<OrderItem> getItens() {
		return items;
	}

	
	
	
	
	
	

}
