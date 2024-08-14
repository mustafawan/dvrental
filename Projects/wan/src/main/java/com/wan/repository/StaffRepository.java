package com.wan.repository;

import com.wan.entity.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
