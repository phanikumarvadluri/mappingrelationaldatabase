package com.org.boa.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    private final String API_URL = "https://api.restful-api.dev/objects";

    @Autowired
    private RestTemplate restTemplate;

    public String fetchDataFromApi() {
        return restTemplate.getForObject(API_URL, String.class);
    }
}

