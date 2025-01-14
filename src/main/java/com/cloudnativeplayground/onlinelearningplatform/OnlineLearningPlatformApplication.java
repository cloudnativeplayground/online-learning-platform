package com.cloudnativeplayground.onlinelearningplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OnlineLearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLearningPlatformApplication.class, args);
    }

    @RestController
    public static class WelcomeController {

        @GetMapping("/")
        public String welcome() {
            return "Welcome to the Online Learning Platform!";
        }
    }
}
