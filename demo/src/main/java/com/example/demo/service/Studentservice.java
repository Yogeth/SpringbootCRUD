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
   Integer index=0;
   Boolean found=false;
   for(int i=0;i<students.size();i++){
     if(students.get(i).getRollno().equals(nums)){
       index=i;
       found=true;
       break;
     }
   }
   if(found){
    return students.get(index);
   }else{
     return null;
   }
  }
  
  public void addData(Student info){
      students.add(info);
  }
  
  public String putData(Student newstudent){
    Integer index=0;
    Boolean found=false;
   for(int i=0;i<students.size();i++){
     if(students.get(i).getRollno().equals(newstudent.getRollno())){
       index=i;
       found=true;
       break;
       }
     }
     if(found){
    students.set(index,newstudent);
    return "UPDATED SUCESSFULLY!";
     }
     else{
       return "NO DATA FOUND TO UPDATE!";
     }
      
  }
  
  public String removeData(Integer rno){
    Integer index=0;
    Boolean found=false;
    for(int i=0;i<students.size();i++){
      if(students.get(i).getRollno().equals(rno)){
        index=i;
        found=true;
        break;
      }
    }
    if(found){
    students.remove(index);
    return "DELETED SUCESSFULLY";
    }else{
      return "NO DATA EXISTS TO DELETE";
    }
  }
}