package com.fran.springboot.webapp.springboot_web.controllers;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    //mostrar datos con model_put con Map <String, Object>
    
    /*@GetMapping("/details")
    public String details (Map<String, Object> model){
        model.put("title", "Hola Mundo Spring Boot");
        model.put("name", "Francisco");
        model.put("lastname", "Riella");
        return "details";
    }*/

    //mostrar datos con model_addAttribute

    @GetMapping("/details")
    public String details(Model model) {


        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Renato Piero");
        model.addAttribute("lastname", "Riella Serafini"); 
        return "details";
    }/* */
    
}
