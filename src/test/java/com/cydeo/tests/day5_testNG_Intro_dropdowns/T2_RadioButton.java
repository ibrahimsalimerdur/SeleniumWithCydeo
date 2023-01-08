package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {

    public static void main(String[] args) {

//Radiobutton handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
//3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioButton.click();
//4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyRadioButton.isSelected()){
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification Fails");
        }
    }

}
