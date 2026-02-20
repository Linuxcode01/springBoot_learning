package org.chandan.first_project.controller;

import org.chandan.first_project.entity.Student;
import org.chandan.first_project.repository.Bottle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class routeController {
    @Autowired
    Bottle bottle;

    @GetMapping("")
    public String  welcome(){
        return "index";
    }

    @PostMapping("/createStudent")
    public String createStudent(@RequestParam String name, @RequestParam String surename, @RequestParam int age){
        Student s1 = new Student();
        s1.name = name;
        s1.age = age;
        s1.surename = surename;
//        s1.rollno = rollno;
        return "output";
    }
}
