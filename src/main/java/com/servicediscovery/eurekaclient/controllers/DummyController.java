package com.servicediscovery.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DummyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client1/test")
    public String testMethod(){
        System.out.println("World");
        return restTemplate.getForObject("http://eurekaclient2/client2/hello",String.class);
        
    }

    @GetMapping("/client1/m1")
    public String test(){
        return "This is client 1";
    }
}
