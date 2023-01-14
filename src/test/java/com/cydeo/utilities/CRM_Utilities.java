package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver) {
        driver.get("https://login1.nextbasecrm.com/");
        WebElement loginPrompt = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        loginPrompt.sendKeys("helpdesk1@cybertekschool.com");


        WebElement passwordPrompt = driver.findElement(By.xpath(" //*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        passwordPrompt.sendKeys("UserUser");


        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

    public static void crm_login(WebDriver driver, String username, String password) {
        driver.get("https://login1.nextbasecrm.com/");
        WebElement loginPrompt = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        loginPrompt.sendKeys(username + Keys.ENTER);


        WebElement passwordPrompt = driver.findElement(By.xpath(" //*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        passwordPrompt.sendKeys(password + Keys.ENTER);


        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }


}
