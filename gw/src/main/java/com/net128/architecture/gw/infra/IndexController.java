package com.net128.architecture.gw.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String index(Model model) {
        List<String> services = discoveryClient.getServices();
        services.remove("gw");
        model.addAttribute("services", services);
        model.addAttribute("eurekaUrl", "/eureka/");
        return "index";
    }
}