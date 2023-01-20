package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test (){
//1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //h5[text()='name: user1']
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

//2. Hover over to first image
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(img1).doubleClick().perform();
        Assert.assertTrue(user1.isDisplayed());
//3. Assert:
//a. “name: user1” is displayed
//b. “view profile” is displayed
//4. Hover over to second image
//5. Assert:
        BrowserUtils.sleep(5);
        actions.moveToElement(img2).doubleClick().perform();
        Assert.assertTrue(user2.isDisplayed());
//a. “name: user2” is displayed
//b. “view profile” is displayed
//6. Hover over to third image
//7. Confirm:
        BrowserUtils.sleep(5);
        actions.moveToElement(img3).doubleClick().perform();
        Assert.assertTrue(user3.isDisplayed());
//a. “name: user3” is displayed
//b. “view profile” is displayed
    }


}
