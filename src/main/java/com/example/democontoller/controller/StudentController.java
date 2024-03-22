package com.example.democontoller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/add")
    public String getNewStudent() {
        return "student/addNewPerson";
    }

    @GetMapping("/edit")
    public String getEditPerson() {
        return "student/editPerson";
    }

    @GetMapping
    public String getStudentList() {
        return "student/personList";
    }
}
