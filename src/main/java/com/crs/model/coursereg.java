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
public class coursereg {
    
    private String coursecode;
    private String coursename;
    private int capacity;
    
    public coursereg(String coursecode, String coursename, int capacity){
        
        
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "coursereg{" + "coursecode=" + coursecode + ", coursename=" + coursename + ", capacity=" + capacity + '}';
    }
    
}
