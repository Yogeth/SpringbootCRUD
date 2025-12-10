package com.example.demo.service;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.entity.Student;
@Service
public class Studentservice{
  List<Student> students=new ArrayList<>(
    Arrays.asList(
      new Student(1,"Wayne","Blockchain"),
      new Student(2,"bruce","webdev")
    )
  );
  public List<Student> getStudents(){
       return students;
  }
  
  public Student getbyrno(int nums){
   //  return students.get(nums);
   int index=0;
   for(int i=0;i<students.size();i++){
     if(students.get(i).getRollno()==nums){
       index=i;
     }
   }
    return students.get(index);
  }
  
  public void addData(Student info){
  return  students.add(info);
  }
}