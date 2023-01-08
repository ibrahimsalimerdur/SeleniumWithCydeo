package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.get("https://google.com");

        //3- Write “apple” in search box
        //4- Click google search button
        Thread.sleep(1500);

        WebElement rejectCookies = driver.findElement(By.id("W0wltc")); // to bypass cookies preference pop-up / accept or reject
        rejectCookies.sendKeys(Keys.ENTER);

        Thread.sleep(1500);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word

        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith("apple")) {
            System.out.println("Test PASS! title: " + actualTitle);
        } else {
            System.out.println("Test FAILED!!! title: " + actualTitle);
        }

        Thread.sleep(2500);


        driver.close();





    }


}
