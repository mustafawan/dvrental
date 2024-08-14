package com.wan.repository;

import com.wan.entity.Film_Actor;
import org.springframework.data.repository.CrudRepository;

public interface Film_ActorRepository extends CrudRepository<Film_Actor, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
