package com.example.demo.controller;

 import org.springframework.web.bind.annotation.*;
 import org.springframework.beans.factory.annotation.Autowired;
 import java.util.*;
 import com.example.demo.service.Studentservice;

@RestController
class StudentController{
  @Autowired 
  Studentservice st;
  
  @GetMapping("students")
public  List<Student> getStudents(){
  return St.getStudents();
}
}