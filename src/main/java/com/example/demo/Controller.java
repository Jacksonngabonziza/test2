package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping("/index")
    public String index() {
       
        return "Hello world";

    }

    @GetMapping("/greet")
    public String ihe() {
       
        return "How are you!!";

    }



}