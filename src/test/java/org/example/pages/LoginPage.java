package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "login-button")
    WebElement btnLogin;

    @FindBy(className = "error-message-container")
    WebElement mensagemDeErro;

    LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        btnLogin.submit();
    }

}
