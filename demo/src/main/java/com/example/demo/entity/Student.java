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
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
}
