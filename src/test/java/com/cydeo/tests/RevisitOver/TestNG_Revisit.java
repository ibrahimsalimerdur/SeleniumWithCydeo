package com.cydeo.tests.RevisitOver;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class TestNG_Revisit {

    WebDriver driver;

    @Test(priority = 1)
    public void googleTitle()  {
        driver.get("https://google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Google Title not same, failed");
    }

    @Test (dataProvider = "searchData")
    public void test1 (String keyword, String expectedTitle) throws InterruptedException {
        driver.get("https://google.com");
        WebElement rejectCookies = driver.findElement(By.id("W0wltc")); // to bypass cookies preference pop-up / accept or reject
        rejectCookies.sendKeys(Keys.ENTER);

        Thread.sleep(1500);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword+ Keys.ENTER);

        assertEquals(driver.getTitle(),expectedTitle);

    }

    @DataProvider (name = "searchData")
    public Object [][] testData(){

        return new Object[][]{
                {"selenium", "selenium - Google Search"},
                {"java", "java - Google Search"},
                {"job", "job - Google Search"},
                {"Cydeo", "Cydeo - Google Search"},
        };
    }


    @BeforeClass
    public void getReady() {
        System.out.println("Get ready, Before class confirmed from here");
    }

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method is running");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("After class is running");

    }


}
