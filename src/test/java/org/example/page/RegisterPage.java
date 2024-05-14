package org.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy (id = "username")
    WebElement fieldUserName;
    @FindBy (id = "password")
    WebElement fieldPassword;
    @FindBy (id = "email")
    WebElement fieldEmail;
    @FindBy (id = "newsletter")
    WebElement chkNewsletter;
    @FindBy (xpath = "//input[@type='submit']")
    WebElement btnRegister;

    public WebElement getFieldUserName(WebDriver driver) { return fieldUserName; }
    public WebElement getFieldPassword(WebDriver driver) { return fieldPassword; }
    public WebElement getFieldEmail(WebDriver driver) { return fieldEmail; }
    public WebElement getChkNewsletter(WebDriver driver) { return chkNewsletter; }
    public WebElement getBtnRegister(WebDriver driver) { return btnRegister; }
}
