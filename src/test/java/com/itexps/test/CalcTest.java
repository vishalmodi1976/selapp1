/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import com.itexps.selwdproject.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itexps
 */
public class CalcTest {
    private Calculator c;
    public CalcTest() {
    }
    
    @Before
    public void setUp() {
        c=new Calculator();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAdd(){
        int result=c.add(10,100);
        assertEquals(110,result);
    }
    @Test
    public void testSubtract(){
        int result=c.subtract(100, 10);
        assertEquals(90,result);
    }
}
