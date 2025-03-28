package com.bsp.projbim.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime dateTime;
	
	@Column(precision = 10, scale = 2)
	private BigDecimal totalValue;
	
	@Column(length = 50, nullable = false)
	private String customerName;
	
	private String observation;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items = new ArrayList<>();
	
	@PrePersist
	protected void onCreate() {
	   this.dateTime = LocalDateTime.now();
    }
	
	public Orders() {
		
	}

	public Orders(Long id, LocalDateTime dateTime, BigDecimal totalValue, String customerName, String observation) {
		this.id = id;
		this.dateTime = dateTime;
		this.totalValue = totalValue;
		this.customerName = customerName;
		this.observation = observation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public List<OrderItem> getItens() {
		return items;
	}

}
