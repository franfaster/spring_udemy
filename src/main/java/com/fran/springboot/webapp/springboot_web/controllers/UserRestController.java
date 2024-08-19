package com.fran.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola mundo Spring Boot");
        body.put("name", "Renato Piero");
        body.put("lastname", "Riella Serafini"); 
        body.put("commit", "primer rest");
        body.put("git", "repositorio API_SPRING_BOOT_clase 15");
        return body;
    }
    
}
