package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

        //Method #1 info:
        //• Name: returnOrderDate ()
        //• Return type: String
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //This method should accept a costumerName and return the costumer order date
        //as a String.
        public static String returnOrderDate(WebDriver driver, String customerName) {
            String locator = "//table[@id='ctl00_MainContent_orderGrid']//td[.='"+customerName+"']/following-sibling::td[3]";

            WebElement customerDataCell= driver.findElement(By.xpath(locator));

            return customerDataCell.getText();
        }


        public static void orderVerify (WebDriver driver, String customerName, String expectedOrderDate){
            String locator = "//table[@id='ctl00_MainContent_orderGrid']//td[.='"+customerName+"']/following-sibling::td[3]";
            WebElement customerDataCell= driver.findElement(By.xpath(locator));
            String actualOrderDate = customerDataCell.getText();

            Assert.assertEquals(actualOrderDate,expectedOrderDate);

        }



    }

