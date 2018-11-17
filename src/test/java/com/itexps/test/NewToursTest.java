/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author itexps
 */
public class NewToursTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
    public NewToursTest() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeRemoteDriver();
       //driver=DriverUtils.getFirefoxRemoteDriver();
        baseUrl="http://newtours.demoaut.com";
  
    }
    @Test
    public void testHomePage(){
        driver.get(baseUrl);
        
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int size=links.size();
        for(int i=0;i<size;i++){
            WebElement e=links.get(i);
            String href=e.getAttribute("href");
            System.out.println(href);
            //driver.get(href);
        }
   
    }
    
    /*@Test
        public void testLoginPO(){
            SigninPage loginPage=PageFactory.initElements(driver, SigninPage.class);
            loginPage.login("mercury", "mercury");
            //sassertTrue(flightFinder.getTitle().contains("Find a Flight"));
            //flightFinder.findFlights("oneway",3,"New York","London","Economy");
            
        }*/
    @Test
    public void testGoogleSearch(){
        driver.get("http://www.google.com");
        GoogleSearchPage p=PageFactory.initElements(driver, GoogleSearchPage.class);
        p.searchFor("selenium");
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    
}
