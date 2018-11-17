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
public class GoogleSearchPage {
    @FindBy(name="q")
    private WebElement searchText;
    
    public void searchFor(String s){
        searchText.sendKeys(s);
        searchText.submit();
    }
    
    
}
