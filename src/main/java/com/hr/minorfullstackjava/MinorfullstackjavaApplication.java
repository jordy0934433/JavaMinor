package com.hr.minorfullstackjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@SpringBootApplication
@EnableMapRepositories
public class MinorfullstackjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinorfullstackjavaApplication.class, args);
    }

}
