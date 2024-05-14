package org.example.test;

import org.example.library.SeleniumTestNG;
import org.example.page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.fail;


public class RegisterTest extends SeleniumTestNG {
    @Test(groups = { "register" })
    public void verifyRegister() {

        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            System.out.println("STARTED: verifyRegister");
            driver.get("http://13.209.85.69/");
            RegisterPage pRegister = new RegisterPage();
            pRegister.getFieldUserName(driver).sendKeys("testtest");
            pRegister.getFieldPassword(driver).sendKeys("12345678");
            pRegister.getFieldEmail(driver).sendKeys("test@gmail.com");
            pRegister.getChkNewsletter(driver).click();
            pRegister.getBtnRegister(driver).click();

            System.out.println("ENDED: verifyRegister");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace(System.out);
            fail("Errors on Subscription Detail - UI");
        }
    }


}
