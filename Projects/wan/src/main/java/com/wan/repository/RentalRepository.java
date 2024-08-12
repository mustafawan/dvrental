package com.wan.repository;

import com.wan.entity.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
