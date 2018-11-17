/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.selwdproject;

/**
 *
 * @author itexps
 */
public class Calculator {
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int subtract(int n1, int n2){
        if(n1<1000){
            return n1-n2;
        }else
            return n1;
    }
    
}
