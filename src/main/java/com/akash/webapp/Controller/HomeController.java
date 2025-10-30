package com.akash.webapp.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HomeController{

    @RequestMapping("/")
    public String greet(){
        return "Welcome onboard!! Akash's Server!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This web server is owned and maintained by akash!! CS major!!";
    }
}
