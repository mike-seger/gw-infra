package com.net128.architecture.gw.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableDiscoveryClient
public class GenericApplication {
    public static void main(String[] args) {
        SpringApplication.run(GenericApplication.class, args);
    }
}

@RestController
class GenericController {
    @GetMapping("/info")
    public Info info() throws UnknownHostException {
        return new Info();
    }
}
