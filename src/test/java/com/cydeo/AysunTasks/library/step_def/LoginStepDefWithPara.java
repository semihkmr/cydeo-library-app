package com.cydeo.AysunTasks.library.step_def;

import com.cydeo.AysunTasks.library.pages.LoginPage;
import com.cydeo.AysunTasks.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefWithPara {

    LoginPage loginPage = new LoginPage(Driver.getDriver());

    @When("I enter username {string}")
    public void i_enter_username(String username) {
       loginPage.inputUsername.sendKeys(username);

    }
    @When("I enter password {string}")
    public void i_enter_password(String password) {
       loginPage.inputPassword.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
       loginPage.loginButton.click();
    }


    @When("user login using {string} and {string}")
    public void userLoginUsingAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @And("there should be {string} users")
    public void thereShouldBeUsers(String number) {
        Assert.assertEquals(loginPage.numberOfUsers.getText(),number);
    }
}
