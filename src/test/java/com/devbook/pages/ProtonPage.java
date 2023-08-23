package com.devbook.pages;

import com.devbook.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProtonPage extends BasePage {
    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement protonUserName;

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement protonUserPassword;

    @FindBy(id = "staySignedIn")
    public WebElement SignedInCheck;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement protonSignInBtn;

    public void verifyLogin() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Proton Mail";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
