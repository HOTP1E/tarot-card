package com.tarot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TarotCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TarotCardApplication.class, args);
    }

}
