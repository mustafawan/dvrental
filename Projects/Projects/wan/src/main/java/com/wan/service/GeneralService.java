package com.wan.service;

import com.wan.entity.Film;
import com.wan.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {

    private final FilmRepository filmRepository;

    @Autowired
    public GeneralService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    // ID'ye göre sıralı şekilde tüm filmleri döndüren metod
    public List<Film> getAllFilmsSortedById() {
        return filmRepository.findAll(Sort.by(Sort.Direction.ASC, "filmId"));
    }

    // ID'ye göre sıralı şekilde belirli sayıda film döndüren metod
    public List<Film> getFilmsSortedById(int limit) {
        List<Film> films = getAllFilmsSortedById();

        if (limit > films.size()) {
            limit = films.size();  // Eğer limit, toplam film sayısından büyükse, tüm listeyi döndür.
        }

        return films.subList(0, limit);  // İlk 'limit' kadar filmi döndür.
    }
}
