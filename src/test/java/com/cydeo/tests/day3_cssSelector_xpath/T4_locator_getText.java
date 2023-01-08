package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_locator_getText {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//tagname[attribute='value']
        WebElement resetButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        //Expected: Reset password

        String actualResetButton = resetButton.getText();
        String expectedResetButton = "Reset password";

        if (actualResetButton.equals(expectedResetButton)){
            System.out.println("Reset Button Verification Pass");
        } else {
            System.out.println("Reset Button Verification Fail");
        }



    }
}
