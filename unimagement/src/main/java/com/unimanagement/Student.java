package com.unimanagement;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dept;
    private double gpa;
    
    public Long getId(){return id;} 
    public void setId(Long id){this.id=id;}
    public String getName(){return name;} 
    public void setName(String n){this.name=n;}
    public String getDept(){return dept;} 
    public void setDept(String d){this.dept=d;}
    public double getGpa(){return gpa;} 
    public void setGpa(double g){this.gpa=g;}
} 