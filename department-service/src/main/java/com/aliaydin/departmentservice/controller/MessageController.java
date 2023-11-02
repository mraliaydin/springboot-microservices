package com.aliaydin.departmentservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    // pass property key.
    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("message")
    public String message(){
        return this.message;
    }
}
