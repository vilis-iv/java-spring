package com.estore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EstoreApplication {
    public static void main(String[] args) {
		SpringApplication.run(EstoreApplication.class, args);
    }
}
