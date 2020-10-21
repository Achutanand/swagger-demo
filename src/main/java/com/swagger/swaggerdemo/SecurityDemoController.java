package com.swagger.swaggerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {


    @RequestMapping("/")
    public String getDefault(){
        return "Return from the Default Configurations";
    }

    @RequestMapping("/user")
    public String getUser(){
        return "Return from the User Modules";

    }

    @RequestMapping("/admin")
    public String getAdmin(){
        return "Return from the Admin Modules";
    }
}
