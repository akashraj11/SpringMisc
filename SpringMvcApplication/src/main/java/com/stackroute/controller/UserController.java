package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
public class UserController {


    @RequestMapping(value="/")
    public String user(ModelMap map){

        map.addAttribute("user", new User().getName());
        return "index";
    }

}
