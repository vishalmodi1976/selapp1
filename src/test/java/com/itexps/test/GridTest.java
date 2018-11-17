/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author itexps
 */
public class GridTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
    public GridTest() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeRemoteDriver();
        baseUrl="http://newtours.demoaut.com";
  
    }
    @Test
    public void testHomePage(){
        driver.get(baseUrl);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int size=links.size();
        for(int i=0;i<size;i++){
            WebElement e=links.get(i);
            String href=e.getAttribute("href");
            System.out.println(href);
            //driver.get(href);
        }
        
        
       /* List<WebElement> inputs=driver.findElements(By.tagName("input"));
        for(WebElement input:inputs){
            System.out.println("Name:"+input.getAttribute("name")+","+input.getAttribute("value"));
        }
        WebElement img=driver.findElement(By.xpath("//img[@src='/images/featured_destination.gif']"));
        assertNotNull(img);*/
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    
}
