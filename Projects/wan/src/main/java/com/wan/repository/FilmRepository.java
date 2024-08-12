package com.wan.repository;

import com.wan.entity.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
