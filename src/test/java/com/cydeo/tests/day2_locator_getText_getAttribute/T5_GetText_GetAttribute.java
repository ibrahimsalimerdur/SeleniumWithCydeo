package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/registration_form");

        //Verify header text is as expected
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification Passed");
        } else {
            System.out.println("Header text verification Failed");
        }

        //Locate "First Name" input box
        WebElement firstnameInput = driver.findElement(By.className("form-control"));

        //Verify place holder
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstnameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder verification Passed");
        } else {
            System.out.println("PlaceHolder verification Fails");
        }


    }


}
