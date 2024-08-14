package com.wan.repository;

import com.wan.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
