package com.cydeo.tests.day4_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_practice {

    public static void main(String[] args) {

//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();

//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6
//        a. “Home” link
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


//        b. “Forgot password” header (XPATH 2.si)
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example >h2"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

//        c. “E-mail” text
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel_ex2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/label"));

//        d. E-mail input box
        WebElement InputBox_ex1 = driver.findElement(By.xpath("//input[@type='text']"));

//        e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

//        f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(poweredByCydeoText.getText());
//        4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("InputBox_ex1.isDisplayed() = " + InputBox_ex1.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

//We are not limited with any attribute or value.
//    tagName[attribute='value']

        //  String homeButtonLink = homeButton.



    }

}
