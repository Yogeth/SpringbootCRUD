package com.example.demo.controller;

 import org.springframework.web.bind.annotation.*;
 import org.springframework.beans.factory.annotation.Autowired;
 import java.util.*;
 import com.example.demo.service.Studentservice;
 import com.example.demo.entity.Student;

@RestController
public class StudentController{
  @Autowired 
  Studentservice st;
  
  @GetMapping("students")
public  List<Student> getStudents(){
  return st.getStudents();
}

@GetMapping("students/{rno}")
public Student getrollno(@PathVariable("rno")int rollno){
   return st.getbyrno(rollno);
}

@PostMapping("students")
public String postData(@RequestBody Student student){
   st.addData(student);
   return "SUCESS!!";
}

@PutMapping("students")
public String updateData(@RequestBody Student student){
  st.putData(student);
  return "Updated!";
}
} 