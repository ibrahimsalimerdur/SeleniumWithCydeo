package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {

    public static void main(String[] args) throws InterruptedException {

//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
//3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
//4. Verify “Delete” button is displayed after clicking.
        Thread.sleep(2000);
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
//5. Click to “Delete” button.
        deleteButton.click();

//6. Verify “Delete” button is NOT displayed after clicking.

        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e){
            System.out.println("--> StaleElementReferenceException is thrown");
            System.out.println("Means this web element deleted from the page");
        }


    }



}
