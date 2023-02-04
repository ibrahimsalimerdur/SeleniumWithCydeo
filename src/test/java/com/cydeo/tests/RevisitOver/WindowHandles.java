package com.cydeo.tests.RevisitOver;

import com.cydeo.base.TestBase;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles extends TestBase {

    @Test
    public void windowTest () throws InterruptedException {
        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        Set <String> allHandles= driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickBtn = driver.findElement(By.linkText("Click Here"));
        clickBtn.click();



        Thread.sleep(3000);

        System.out.println("After Click - driver.getWindowHandle () = " + driver.getWindowHandle ());
        System.out.println("After Click - driver.getWindowHandles() = " + driver.getWindowHandles());

        allHandles=driver.getWindowHandles();
        for (String eachHandle:allHandles ) {
            System.out.println("eachHandle" + eachHandle);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }

}
