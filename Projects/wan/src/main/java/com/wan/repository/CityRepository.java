package com.wan.repository;

import com.wan.entity.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
