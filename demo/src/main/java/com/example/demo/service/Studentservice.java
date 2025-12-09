package com.example.demo.service;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.entity.Student;
@Service
class Studentservice{
  List<Student> students=new ArrayList<>(
    Arrays.asList(
      new Student(1,"Yoge","Blockchain");
      new Student(2,"Yogeth","webdev");
    )
  );
  public List<Student> getStudents(){
       return students;
  }
}