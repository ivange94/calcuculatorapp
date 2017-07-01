package com.app.controller;

import com.app.Operation;
import com.app.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping
    public Result calculate(@RequestBody Operation operation) {
        return operation.compute();
    }
}
