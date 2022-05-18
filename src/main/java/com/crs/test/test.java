/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crs.test;

import com.crs.model.course;


/**
 *
 * @author 070017959
 */
public class test {
    
    public static void main(String[] args) {
    
        course c1 = new course();
        c1.setId(1);
        
        course c2 = new course();
        c2.setId(2);
        
        System.out.println(c1.getId());
        System.out.println(c1);
        
        
    }
    
}
