package com.wan.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class WelcomeService {

    public String getWelcomeMessage() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedNow = now.format(formatter);
        return "Welcome to Spring Boot world!" +
                "\nCurrent time is: " + formattedNow;
    }

}
