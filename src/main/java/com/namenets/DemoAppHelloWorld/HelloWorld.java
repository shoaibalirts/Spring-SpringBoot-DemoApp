package com.namenets.DemoAppHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    String greet = "Hi";
    String firstName="Shoaib";
    String lastName="Ali";

    @RequestMapping("/")
    public String getGreeting(){
        return this.greet+" "+this.firstName+" "+this.lastName;
    }
}
