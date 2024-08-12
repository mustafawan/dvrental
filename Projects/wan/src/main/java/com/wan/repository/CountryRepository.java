package com.wan.repository;

import com.wan.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
