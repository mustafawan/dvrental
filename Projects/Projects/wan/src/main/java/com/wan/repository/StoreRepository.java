package com.wan.repository;

import com.wan.entity.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
