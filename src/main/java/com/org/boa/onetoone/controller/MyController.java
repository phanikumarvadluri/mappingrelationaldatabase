package com.org.boa.onetoone.controller;

import com.org.boa.onetoone.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/consumingfromwhere")
    public String fetchData() {
        return apiService.fetchDataFromApi();
    }
}

