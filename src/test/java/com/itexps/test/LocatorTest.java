/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 *
 * @author itexps
 */
public class LocatorTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
    public LocatorTest() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeRemoteDriver();
        baseUrl="file:///c:/QA/register.html";
        
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Test
    public void testOptions(){
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    /*@Test
    public void testLocators1(){
        driver.get(baseUrl);
        List<WebElement> radios=driver.findElements(By.name("gender"));
        radios.get(1).click();
    }*/
    
   /*@Test
    public void testLocators(){
        driver.get(baseUrl);
        WebElement lastName=driver.findElement(By.id("lname"));
        lastName.sendKeys("Lilaramani");
        WebElement firstName=driver.findElement(By.name("fname"));
        firstName.sendKeys("Narendra");
        WebElement pwd=driver.findElement(By.className("pwd"));
        pwd.sendKeys("Password");
        //driver.findElement(By.partialLinkText("Reset")).click();
        //resetLink.click();
        WebElement dropdown=driver.findElement(By.tagName("select"));
        dropdown.sendKeys("Masters");
        List<WebElement> radios=driver.findElements(By.name("gender"));
        radios.get(1).click();
        
        Select qualification=new Select(dropdown);
        //qualification.deselectAll();
        qualification.selectByIndex(1);
        
        WebElement terms=driver.findElement(By.name("terms"));
        if(!terms.isSelected()){
            terms.click();
        }
        
       // WebDriver augmentDriver=new Augmenter().augment(driver);
        //File screenshot=((TakesScreenshot)augmentDriver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(screenshot, new File("c:\\qa\\screenshot.png"));

    }*/
}
