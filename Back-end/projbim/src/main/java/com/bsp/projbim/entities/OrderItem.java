package com.bsp.projbim.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ESSE CAMPO É OBRIGATÓRIO E DEVE TER O NOME "product"
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
