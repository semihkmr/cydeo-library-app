package com.cydeo.AysunTasks.library.step_def;

import com.cydeo.AysunTasks.library.pages.LoginPage;
import com.cydeo.AysunTasks.library.utilities.ConfigurationReader;
import com.cydeo.AysunTasks.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

     LoginPage loginPage = new LoginPage(Driver.getDriver());

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }
    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
       loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("lib22_user"));
       loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
       loginPage.loginButton.click();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login - Library");
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
     loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("student55_user"));
     loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("student55_pass"));
     loginPage.loginButton.click();
    }
    @Then("books should be displayed")
    public void books_should_be_displayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Login - Library");
    }
}
