package com.jenkins.test_project_new.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String home()
    {
        return "Spring boot application Working";
    }

}
