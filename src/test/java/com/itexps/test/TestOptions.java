/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author itexps
 */
public class TestOptions {
     private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    public TestOptions() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeRemoteDriver();
        baseUrl="file:///c:/QA/register.html";
    }
    @Test
    public void testOptions(){
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().window().getPosition();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().logs().getAvailableLogTypes();
        String source=driver.getPageSource();
        assertTrue(source.contains("<h1>"));
    }
    
    @After
    public void tearDown() {
       driver.quit();
    }
    
}
