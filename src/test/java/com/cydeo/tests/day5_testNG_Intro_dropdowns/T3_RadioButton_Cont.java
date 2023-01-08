package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_Cont {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
//Locate name = 'sports' radio button and store in list of WEB ELEMENTs

        clickAndVerifyRadioButton(driver, "color", "black");

        clickAndVerifyRadioButton(driver,"sport", "football");

    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));
        for (WebElement each : radioButton) {
            String eachID = each.getAttribute("id");
            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(idValue + " is selected " + each.isSelected());
                break;
            }
        }
    }


}
