 package com.example.demo.entity;

public class Student {

    private int rollno;
    private String name;
    private String tech;
  
    public Student(){
        
    }

    public Student(int rno, String n, String tech){
        this.rollno = rno;
        this.name = n;
        this.tech = tech;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }
}
