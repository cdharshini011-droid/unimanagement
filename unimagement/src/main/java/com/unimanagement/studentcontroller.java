package com.unimanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {

    @GetMapping("/students")
    public String students() {
        return "Student Management is Running Successfully!";
    }
}