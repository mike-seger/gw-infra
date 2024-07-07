package com.net128.architecture.gw.infra;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
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
    private final ServletContext servletContext;
    private final Environment environment;

    GenericController(ServletContext servletContext, Environment environment) {
        this.servletContext = servletContext;
        this.environment = environment;
    }

    @GetMapping("/info")
    public Info info() throws UnknownHostException {
        return new Info(servletContext.getContextPath(), environment.getProperty("local.server.port"));
    }
}
