package com.example.wikimedia.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.wikimedia"})
@EntityScan(basePackages = {"com.example.wikimedia.entity"})
@EnableJpaRepositories(basePackages = "com.example.wikimedia.repository")
public class WikimediaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikimediaConsumerApplication.class);
    }

}
