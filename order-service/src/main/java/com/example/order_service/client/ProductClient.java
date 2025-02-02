package com.example.order_service.client;


import com.example.order_service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "product-service")  // Namnet på tjänsten du anropar
public interface ProductClient {
   // Product getProduct(Long productId);

//    @GetMapping("/api/products/{id}")  // Endpoint i product-service
//    Product getProduct(@PathVariable Long id);  // Metod för att hämta en produkt
}