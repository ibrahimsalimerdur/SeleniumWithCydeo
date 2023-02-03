package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SallyTest {


        @Test
        public void amazonTask(){


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.tr");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement cookieAccept = driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]"));
        cookieAccept.click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement searchPrompt = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

        searchPrompt.sendKeys("iphone 13 512" + Keys.ENTER);

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement iphone13_512 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[2]/h2/a/span"));

        iphone13_512.click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement size = driver.findElement(By.xpath("//*[@id=\'a-autoid-13-announce\']/div/div[1]/p"));
        System.out.println("Memory size : "+ size.getText()  );
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement color = driver.findElement(By.xpath("//*[@id=\'variation_color_name\']/div/span"));
        System.out.println("Color Information : "+ color.getText()  );
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            WebElement price = driver.findElement(By.xpath( "//*[@id=\'corePriceDisplay_desktop_feature_div\']/div[1]"));
        System.out.println("Price details : " + price.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement stock = driver.findElement(By.xpath("//*[@id='availability']"));
        System.out.println("Availability in stock : "+ stock.getText()  );



        }
}
