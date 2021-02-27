package com.fleetApp.step_definitions;

import com.fleetApp.pages.LoginPage;
import com.fleetApp.utility.BrowserUtils;
import com.fleetApp.utility.ConfigurationReader;
import com.fleetApp.utility.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions {
LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url")); }


    @When("user login as a {string}")
    public void user_login_as_a(String string) {
        BrowserUtils.wait(3);
        loginPage.loginCreds(string);
        System.out.println("passed");
        BrowserUtils.wait(3);


    }
    @Then("user should see {string} page")
    public void user_should_see_page(String string) {
        BrowserUtils.wait(2);
        String expected= loginPage.getSubTitleText();
        BrowserUtils.wait(2);
        String actual="Dashboard";
        Assert.assertNotEquals(expected,actual,"Test Failed!!!");
        BrowserUtils.wait(2);
        System.out.println(expected);

        System.out.println("passed");
        Driver.closeDriver();


    }



}
