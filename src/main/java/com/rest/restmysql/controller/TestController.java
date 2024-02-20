package com.rest.restmysql.controller;


import com.rest.restmysql.model.Test;
import com.rest.restmysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/api/v1/")
    public ResponseEntity<List<Test>> getAll(){



        return new ResponseEntity<>(testService.getAll(), HttpStatus.ACCEPTED);

    }

    @PostMapping("/api/v1/")
    public ResponseEntity<Test> addTest(@RequestBody Test test){

        return new ResponseEntity<>(testService.save(test), HttpStatus.ACCEPTED);


    }
}

