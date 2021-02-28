package com.fleetApp.step_definitions;

import com.fleetApp.pages.LandingPage;
import com.fleetApp.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DriverStepDefinitions {
    LoginPage loginPage=new LoginPage();
    LandingPage landingPage=new LandingPage();

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.loginCreds("driver");
    }

    @Then("user navigates to Fleet and Vehicles")
    public void userNavigatesToFleetAndVehicles() {

        landingPage.fleetLink(); }

    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String text){
        landingPage.fleet_getCarText(text);
    }


    @And("user verifies that default page number is {string}")
    public void userVerifiesThatDefaultPageNumberIs(String num) {
        landingPage.verifyNumber(num);
        System.out.println(num);

        Assert.assertEquals("Dont Passed!!",num,"1");
        //new 12 34


    }
}
