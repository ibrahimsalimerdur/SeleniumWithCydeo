package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browser = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement cookiesAcceptPrompt = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        cookiesAcceptPrompt.click();
    }

    @Test
    public void google_search_test(){

        WebElement googleSearchPrompt = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        googleSearchPrompt.sendKeys("apple"+ Keys.ENTER);
//3- Write “apple” in search box
//4- Verify title:
//Expected: apple - Google Search
        String expectedTitleText = "apple - Google Search";
        BrowserUtils.verifyTitle(driver, expectedTitleText);



    }

}
