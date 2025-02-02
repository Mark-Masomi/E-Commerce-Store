package com.example.order_service.service;


import com.example.order_service.client.ProductClient;
import com.example.order_service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    public Product getProductById(Long productId) {
        return productClient.getProduct(productId);  // Anropa product-service
    }
}