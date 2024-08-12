package com.wan.repository;

import com.wan.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
