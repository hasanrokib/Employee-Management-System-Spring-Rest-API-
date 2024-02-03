package com.learn.employeemanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
@Value("${spring.message}")
   private String mynotes;
    @GetMapping("/info")
    public String getInfo(){
        return  mynotes;
    }

}
