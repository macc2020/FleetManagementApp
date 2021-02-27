package com.fleetApp.pages;

import com.fleetApp.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BasePage {

    @FindBy(className = "oro-subtitle")
    protected WebElement pageSubTitle;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this); }


        public String getSubTitleText(){
        return pageSubTitle.getText();

        }

}
