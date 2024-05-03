package com.eloquently;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.eloquently"})
public class Eloquently {

    public static void main(String[] args) {
        SpringApplication.run(Eloquently.class, args);
    }

}
