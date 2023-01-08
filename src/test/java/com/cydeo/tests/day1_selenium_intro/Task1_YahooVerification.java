package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooVerification {

    public static void main(String[] args) {  //OutOfBox thinking >>> after reading documentation/requirement. Igo out of box thinking.

        //1 setup for browser driver
        WebDriverManager.chromedriver().setup();

        //2 open chrome browser
        WebDriver driver = new ChromeDriver();

        //3 go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //4 verify title
        //Expected >  Yahooist Teil der Yahoo Markenfamilie
        String expectedTitle = "Yahooist Teil der Yahoo Markenfamilie";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title is expected. Verification Passed!");
        } else {
            System.out.println("Title is Not expected. Verification Failed!");
        }




    }






}
