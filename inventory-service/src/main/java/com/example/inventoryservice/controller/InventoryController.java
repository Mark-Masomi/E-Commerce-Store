package com.example.inventoryservice.controller;


import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/{productId}")
    public Inventory getInventoryByProductId(@PathVariable Long productId){
        return inventoryRepository.findByProductId(productId);
    }

    public Inventory createInventory(@RequestBody Inventory inventory){
        return inventoryRepository.save(inventory);
    }

}
