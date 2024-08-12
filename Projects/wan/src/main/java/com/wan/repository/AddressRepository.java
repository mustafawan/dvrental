package com.wan.repository;

import com.wan.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
