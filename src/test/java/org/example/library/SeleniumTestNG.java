package org.example.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestNG {

    public static WebDriver driver;

    @BeforeMethod(groups = { "abstract" })
    public void setUpTest() {
        //Establish a WebDriver driver;
        try {
            //Support Chrome
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get("http://13.209.85.69/");
            driver.manage().window().maximize();;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterMethod(groups = { "abstract" })
    public void tearDownTest() {
        //Close the WebDriver
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public WebDriver getDriver() {
        return this.driver;
    }
}
