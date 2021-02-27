package com.fleetApp.pages;

import com.fleetApp.utility.BrowserUtils;
import com.fleetApp.utility.Driver;
import io.cucumber.java.bs.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage{

    @FindBy(className = "unclickable")
    private WebElement fleetLink1;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    private WebElement vehivlesLink;



    public void fleetLink(){
       Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetLink1).perform();
        BrowserUtils.wait(4);
        actions.moveToElement(vehivlesLink).click().perform();
        BrowserUtils.wait(3);
    }
    @FindBy(className = "oro-subtitle")
    private WebElement pageCarTitle;
public String fleet_getCarText(String text){
    BrowserUtils.wait(2);
    WebElement cText=Driver.getDriver().findElement(By.className("oro-subtitle"));
    BrowserUtils.wait(2);
    text=cText.getText();
    System.out.println(text);
    return text;
}
    @FindBy(xpath = "//*[@value='1']")
    private WebElement verifyNumber;

public String verifyNumber(String num){


    num=verifyNumber.getText();
    return num;

}


}
