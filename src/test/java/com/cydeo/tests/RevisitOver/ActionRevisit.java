package com.cydeo.tests.RevisitOver;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ActionRevisit extends TestBase {

    @Test
    public void dragDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        Thread.sleep(3000);
        Actions action = new Actions(driver);
         action.dragAndDrop(smallCircle,bigCircle).perform();
        /*action.moveToElement(smallCircle).pause(1000)
                .clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release().perform();

         */

        Thread.sleep(3000);

        assertEquals(bigCircle.getText(),"You did great!");


    }


}
