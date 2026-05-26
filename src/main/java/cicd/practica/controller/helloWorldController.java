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

    @GetMapping("/hello")
    public String saludar2() {
        return new String("Hello");
    }

    @GetMapping("/ing-soft")
    public String saludar3() {
        return new String("Vaya mierda de clase");
    }

    @GetMapping("/ing-soft2")
    public String saludar4() {
        return new String("Vaya mierda de clase2");
    }
    
}
