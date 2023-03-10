package com.cydeo.tests.day7_webtables_utilities_javafaker;


import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {


//1. Create new test and make set ups
//2. Go to : http://login1.nextbasecrm.com/
//3. Enter valid username
//4. Enter valid password
//5. Click to `Log In` button
//6. Verify title is as expected:
//Expected: Portal

    @Test
    public void crm_login_test()   {
        driver.get("https://login1.nextbasecrm.com/");
        WebElement loginPrompt = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        loginPrompt.sendKeys("helpdesk1@cybertekschool.com");


        WebElement passwordPrompt = driver.findElement(By.xpath(" //*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        passwordPrompt.sendKeys("UserUser" );


        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

         String expectedTitle = "My tasks";
     //   String actualTitle = driver.getTitle();

      //  Assert.assertEquals(actualTitle,expectedTitle);
        BrowserUtils.verifyTitle(driver,expectedTitle);

    }

}

