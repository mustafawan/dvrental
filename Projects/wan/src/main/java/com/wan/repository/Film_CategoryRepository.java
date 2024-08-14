package com.wan.repository;

import com.wan.entity.Film_Category;
import org.springframework.data.repository.CrudRepository;

public interface Film_CategoryRepository extends CrudRepository<Film_Category, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
