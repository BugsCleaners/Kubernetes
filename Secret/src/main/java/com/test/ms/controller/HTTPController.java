package com.test.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@PropertySources(value = {@PropertySource("classpath:application.properties")})
@RestController
@RequestMapping(path = "/")
public class HTTPController {
    private RestTemplate restTemplate = new RestTemplate();
   // @Value("${APIurl}")
   private String APIurl="https://jsonplaceholder.typicode.com/posts";

    @Value("${appusername}")
    private String appusername;


    @GetMapping(path = "/secret")
    public String secret() {

        String data =appusername;
        return data;
    }
}

