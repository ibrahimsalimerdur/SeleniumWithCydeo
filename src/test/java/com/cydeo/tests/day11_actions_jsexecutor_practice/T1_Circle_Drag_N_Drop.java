package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
//2. Drag and drop the small circle to bigger circle.
//3. Assert:
//-Text in big circle changed to: “You did great!”

    @Test
    public void drag_Drop_Test () throws InterruptedException {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //onetrust-accept-btn-handler
        WebElement acceptCookie = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookie.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Thread.sleep(2000);

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);





    }

}
