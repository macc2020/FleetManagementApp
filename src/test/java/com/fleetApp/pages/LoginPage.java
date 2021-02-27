package com.fleetApp.pages;

import com.fleetApp.utility.BrowserUtils;
import com.fleetApp.utility.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="prependedInput")
    private WebElement userName;

    @FindBy(id="prependedInput2")
    private WebElement password;

    @FindBy(id="_submit")
    private WebElement loginButton;

    public void loginCreds(String role){

        String usernameValue= "";
        String passwordValue=ConfigurationReader.getProperty("password");

        switch (role.toLowerCase()) {

            case "sales manager":
                usernameValue = ConfigurationReader.getProperty("salesmanager.username");
                userName.sendKeys(usernameValue);
                password.sendKeys(passwordValue,Keys.ENTER);
                break;
            case "driver":
                usernameValue = ConfigurationReader.getProperty("driver.username");
                userName.sendKeys(usernameValue);
                password.sendKeys(passwordValue,Keys.ENTER);

                break;
            case "store manager":
                usernameValue = ConfigurationReader.getProperty("storemanager.username");
                userName.sendKeys(usernameValue);
                password.sendKeys(passwordValue,Keys.ENTER);
                break;
        }







        }









}
