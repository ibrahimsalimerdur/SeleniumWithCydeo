package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instanceof the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");

        //get title of the page
        String currentTitle = driver.getTitle();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        //stop execution for 10 seconds
        Thread.sleep(3000);

        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //use selenium to navigate back
        driver.navigate().back();

        //stop execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //stop execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate otherWebPage
        driver.navigate().to("https://www.google.com");

        currentTitle = driver.getTitle();

        //stop execution for 3 seconds
        Thread.sleep(3000);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        //Close current open one
        driver.close();
        //Close all browsers.
        driver.quit();

        //Tell me about the common exception, when you are using Selenium Webdriver





    }


}
