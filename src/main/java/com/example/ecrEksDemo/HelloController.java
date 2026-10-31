package com.example.ecrEksDemo;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "application", "Spring Boot ECR-EKS Demo",
            "message", "Hello from Spring Boot running on Kubernetes!",
            "time", Instant.now().toString()
        );
    }

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello Karthik! Your Spring Boot app is running."
        );
    }

    @GetMapping("/api/random")
    public Map<String, Object> random() {
        int number = ThreadLocalRandom.current().nextInt(1, 101);
        return Map.of(
            "randomNumber", number,
            "message", "This response is coming from the container."
        );
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
            "status", "UP",
            "environment", "Docker / ECR / EKS"
        );
    }
}
