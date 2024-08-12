package com.wan.repository;

import com.wan.entity.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
