package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://practice.cydeo.com/");

        //Click to A/B Testing from top of the list
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //Verify title is: Expected= No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS");
        } else {
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        //Verify title of home page.
        // Expected = "Practice"

        String expectedHomeTitle = "Practice";
        String actualHomeTitle = driver.getTitle();

        if (actualHomeTitle.equals(expectedHomeTitle)){
            System.out.println("Home Title verification PASS");
        } else {
            System.out.println("Home Title verification FAILED");
        }









    }




}
