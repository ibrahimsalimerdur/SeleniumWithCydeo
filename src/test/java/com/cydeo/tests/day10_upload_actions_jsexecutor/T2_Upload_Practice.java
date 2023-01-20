package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {


//2. Find some small file from your computer, and get the path of it.
//3. Upload the file.
//4. Assert:
//-File uploaded text is displayed on the page

    @Test
    public void upload_test(){
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String img_path = "C:\\Users\\erdur\\Desktop\\Tarik Vize Evrak 2022 August\\keremGeneric.JPG";
        WebElement chooseFileButton = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(3);
     //   chooseFileButton.click();
        chooseFileButton.sendKeys(img_path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();



        WebElement fileUploaded = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
        Assert.assertTrue(fileUploaded.isDisplayed());









    }

}
