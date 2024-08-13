package br.com.api_food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFoodApplication.class, args);
    }

}
