package cicd.practica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/hello")
public class helloWorldController {
    
    @GetMapping("/world")
    public String saludar() {
        return new String("Hello World");
    }
    
}
