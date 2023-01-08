package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement RememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = RememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("RememberMe Verification Pass");
        } else {
            System.out.println("RememberMe Verification Fail");
        }

        WebElement forgetPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgetPasswordLinkText = "Forgot your password?";
        String actualForgetPasswordLinkText = forgetPasswordLink.getText();

        if (actualForgetPasswordLinkText.equals(expectedForgetPasswordLinkText)){
            System.out.println("ForgetPasswordLink Verification Pass");
        } else {
            System.out.println("ForgetPasswordLink Verification Fail");
        }

        String expectedForgetPasswordHref = "forgot_password=yes";
        String actualForgetPasswordHref = forgetPasswordLink.getAttribute("href");

        if (actualForgetPasswordHref.equals(expectedForgetPasswordHref)){
            System.out.println("ForgetPassword Href Verification Pass");
        } else {
            System.out.println("ForgetPassword Href Verification Fail");
        }


      //  Expected: forgot_password=yes


    }




}
