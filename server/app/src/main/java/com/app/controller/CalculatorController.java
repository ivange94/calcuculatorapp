package com.app.controller;

import com.app.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Double> calculate(@RequestBody Operation operation) {
        return new ResponseEntity<>(operation.compute(), HttpStatus.OK);
    }
}
