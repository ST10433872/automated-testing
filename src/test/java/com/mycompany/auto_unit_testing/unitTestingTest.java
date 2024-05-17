/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.auto_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class unitTestingTest {
    
    public unitTestingTest() {
    }

    @org.junit.jupiter.api.Test
    public void testAdditionMethod() {
        
        //create an nstance of the class
        unitTesting ut = new unitTesting();
        
        int expected = 4;
        int actual = ut.addition(2, 2);
        
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSubtractionMethod(){
        
         //create an nstance of the class
        unitTesting ut = new unitTesting();
        
        int expected = 6;
        int actual = ut.subtraction(10, 4);
        
        assertEquals(expected,actual);
    }
    @Test
    public void testMessage(){
         //create an nstance of the class
        unitTesting ut = new unitTesting();
        
        String expected = "Hello World";
        String actual = ut.message();
        
        assertEquals(expected,actual);
    }
        
        
        
    }
   
    
    
}
