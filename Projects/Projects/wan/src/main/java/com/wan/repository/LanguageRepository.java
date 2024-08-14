package com.wan.repository;

import com.wan.entity.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Integer> {
    // Buraya özel sorgular ekleyebilirsiniz
}
