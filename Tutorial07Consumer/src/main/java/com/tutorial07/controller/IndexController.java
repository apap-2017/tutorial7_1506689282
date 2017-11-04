package com.tutorial07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial07.service.StudentService;

@Controller
public class IndexController
{
    @Autowired
    StudentService studentDAO;


    @RequestMapping("/")
    public String index ()
    {
        return "index";
    }    
    
}
