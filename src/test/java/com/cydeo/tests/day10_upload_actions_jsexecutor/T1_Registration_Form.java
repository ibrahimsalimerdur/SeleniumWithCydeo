package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class T1_Registration_Form {

    @Test
    public void registration_form_test (){
//1. Open browser
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
//2. Go to website: https://practice.cydeo.com/registration_form
        Faker faker1 = new Faker();

        WebElement inputFirstName =Driver.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[1]/div/input"));


//3. Enter first name
        inputFirstName.sendKeys(faker1.name().firstName());
//4. Enter last name
        WebElement inputLastName =Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        inputLastName.sendKeys(faker1.name().lastName());
//5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input"));
        String user = faker1.bothify("helpdesk###");
        inputUserName.sendKeys(faker1.bothify(user));

//6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
        inputEmail.sendKeys(user+"@gmail.com");
//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
        inputPassword.sendKeys(faker1.numerify("########"));

//8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
        inputPhoneNumber.sendKeys(faker1.numerify("571-###-####"));
//9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();
//10. Enter date of birth
        WebElement inputbirthDay = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input"));
        inputbirthDay.sendKeys("11/22/1987");

//11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker1.number().numberBetween(1,9));

//12. Select Job Title

//13. Select programming language from checkboxes
//14. Click to sign up button
//15. Verify success message “You’ve successfully completed registration.” is
//displayed.


    }

}
