package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_webTable_OrderVerify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
//1. Go to: https://practice.cydeo.com/web-tables

    @Test
    public void order_name_verify_test (){
//2. Verify Bob’s name is listed as expected.
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String actualBobMartinName = bobMartinCell.getText();
//Expected: “Bob Martin”
        String expectedBobMartinName = "Bob Martin";

        Assert.assertEquals(actualBobMartinName,expectedBobMartinName);
//3. Verify Bob Martin’s order
//Expected: 12/31/2021

        WebElement orderDateOfBob = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String orderDateOfBobInText = orderDateOfBob.getText();
        String expectedOrderDateOfBob = "12/31/2021";

        Assert.assertEquals(orderDateOfBobInText,expectedOrderDateOfBob);





    }

    @Test
    public void test2(){
        String customerOrderDate = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");

     }

}
