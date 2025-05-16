package com.ms_api_1.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api2/v1")
public class MsApi1Controller {
    
    @GetMapping("path")
    public String getMethodName() {
        return new String("Hola Mundo");
    }  
}
