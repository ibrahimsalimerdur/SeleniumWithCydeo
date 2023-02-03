package com.cydeo.tests.RevisitOver;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Alerts_Practice extends TestBase {

    @Test
    public void alertTest(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();


        WebElement resultText = driver.findElement(By.id("result"));
        assertTrue(resultText.isDisplayed());


    }
}
