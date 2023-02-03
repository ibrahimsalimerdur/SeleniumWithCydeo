package com.cydeo.tests.RevisitOver;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class iframeRevisit extends TestBase {

    @Test
    public void frameTest (){
        driver.get("https://practice.cydeo.com/iframe");

        WebElement iframeBox = driver.findElement(By.id("mce_0_ifr"));
        //driver.switchTo().frame(iframeBox);
        driver.switchTo().frame(0);

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();
    }
}
