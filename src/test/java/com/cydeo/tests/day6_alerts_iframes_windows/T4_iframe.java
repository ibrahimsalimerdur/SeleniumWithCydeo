package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_iframe {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframetest() {

        driver.switchTo().frame("mce_0_ifr");


        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement headerOfFramework = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));

        String expectedHeaderOfFramework = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(headerOfFramework.getText(),expectedHeaderOfFramework);


    }


}

/*
Iframe practice
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */