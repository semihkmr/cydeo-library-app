package com.cydeo.AysunTasks.library.pages;

import com.cydeo.AysunTasks.library.utilities.ConfigurationReader;
import com.cydeo.AysunTasks.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='col p-r-0 align-self-center']/h2[@id='user_count']")
    public WebElement numberOfUsers;

    public void login(String username, String password){


        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
}

