package com.eureka.image.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @GetMapping("/name1")
    public String getControllerName1()
    {
        return "GalleryController - www.SpringBootDev.com from image";
    }
    
   
}