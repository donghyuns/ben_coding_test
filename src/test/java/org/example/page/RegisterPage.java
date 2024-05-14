package org.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(60), Duration.ofMillis(1000));
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id='username']")
    WebElement fieldUserName;
    @FindBy (xpath = "//*[@id='password']")
    WebElement fieldPassword;
    @FindBy (xpath = "//*[@id='email']")
    WebElement fieldEmail;
    @FindBy (xpath = "//*[@id='newsletter']")
    WebElement chkNewsletter;
    @FindBy (xpath = "//input[@type='submit']")
    WebElement btnRegister;

    public WebElement getFieldUserName() { return fieldUserName; }
    public WebElement getFieldPassword() { return fieldPassword; }
    public WebElement getFieldEmail() { return fieldEmail; }
    public WebElement getChkNewsletter() { return chkNewsletter; }
    public WebElement getBtnRegister() { return btnRegister; }
}
