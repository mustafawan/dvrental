package com.wan.controller;

import com.wan.entity.Film;
import com.wan.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final GeneralService generalService;

    @Autowired
    public FilmController(GeneralService generalService) {
        this.generalService = generalService;
    }

    // POST isteği ile belirli sayıda filmi ID'ye göre sıralı şekilde döndüren endpoint
    @PostMapping("/list")
    public ResponseEntity<Map<String, Object>> getFilms(@RequestBody(required = false) Integer limit) {
        List<Film> films;
        Map<String, Object> response = new HashMap<>();
        String message;

        if (limit == null) {
            films = generalService.getAllFilmsSortedById();  // Limit belirtilmemişse tüm filmleri döndür
            message = "Limit belirtilmedi tüm filmler döndürüldü.";
        } else {
            films = generalService.getFilmsSortedById(limit);

            // Eğer limit, toplam film sayısından büyükse, kullanıcıya uyarı mesajı ekle
            if (limit > films.size()) {
                message = "Limit değeri mevcut film sayısından büyük. Kalan film sayısı: " + films.size() + ". Tüm filmler döndürülüyor.";
            } else {
                message = "Başarıyla " + limit + " film döndürüldü.";
            }
        }

        // Yanıt haritasına film listesi ve mesajı ekle
        response.put("films", films);
        response.put("message", message);

        // Yanıt olarak haritayı döndür
        return ResponseEntity.ok(response);
    }
}
