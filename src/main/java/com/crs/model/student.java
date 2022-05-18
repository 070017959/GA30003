/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crs.model;

/**
 *
 * @author 070017959
 */
public class student {
    
    private int Student_id;
    private String first_name;
    private String last_name;
    private int age;
    
  
    
    public student(String first_name, String last_name, int age){
        
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        
}

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" + "Student_id=" + Student_id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + '}';
    }
    
}
