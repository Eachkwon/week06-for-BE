package com.example.week06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Week06Application {

    public static void main(String[] args) {
        SpringApplication.run(Week06Application.class, args);
    }

}
