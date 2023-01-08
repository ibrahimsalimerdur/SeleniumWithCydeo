package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_SimpleDropDowns {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropDownTest() {

//3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropDownText = currentlySelectedOption.getText();
        String expectedSimpleDropDownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropDownText,expectedSimpleDropDownText);

//Expected: “Please select an option”

//4. Verify “State selection” default selected value is correct
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String expectedStateDropDown = "Select a State";
        String actualStateDropDown = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropDown, expectedStateDropDown);
//Expected: “Select a State”



    }

}
