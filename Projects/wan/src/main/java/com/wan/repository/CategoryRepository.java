package com.wan.repository;

import com.wan.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
