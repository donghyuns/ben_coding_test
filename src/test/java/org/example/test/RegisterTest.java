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
            Thread.sleep(2000);
            RegisterPage pRegister = new RegisterPage(driver);
            pRegister.getFieldUserName().sendKeys("testtest");
            pRegister.getFieldPassword().sendKeys("12345678");
            pRegister.getFieldEmail().sendKeys("test@gmail.com");
            pRegister.getChkNewsletter().click();
            pRegister.getBtnRegister().click();

            System.out.println("ENDED: verifyRegister");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace(System.out);
            fail("Errors on Subscription Detail - UI");
        }
    }


}
