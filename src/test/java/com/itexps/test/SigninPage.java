/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author itexps
 */
public class SigninPage{
    @FindBy(name="userName")
    private WebElement username;
    @FindBy(name="password")
    private WebElement password;
    @FindBy(name="login")
    private WebElement login;
   
    
    public void login(String uname,String pwd){
       password.sendKeys(pwd);
        username.sendKeys(uname);
        login.click();
        
    }
    
}
