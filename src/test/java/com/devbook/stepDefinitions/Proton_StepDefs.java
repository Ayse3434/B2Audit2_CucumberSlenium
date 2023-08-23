package com.devbook.stepDefinitions;

import com.devbook.pages.ProtonPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Proton_StepDefs {
    ProtonPage protonPage = new ProtonPage();
    @Given("User is on the proton login page")
    public void user_is_on_the_proton_login_page() {
        Driver.get().get("https://account.proton.me/login");
        BrowserUtils.waitFor(2);

    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        protonPage.protonUserName.sendKeys("logintest2023@proton.me");
        BrowserUtils.waitFor(3);
        protonPage.protonUserPassword.sendKeys("12345678");

    }
    @When("Click to signin check")
    public void click_to_signin_check() {
        BrowserUtils.waitFor(3);
        protonPage.SignedInCheck.click();

    }
    @When("Click to sigin button")
    public void click_to_sigin_button() {
        BrowserUtils.waitFor(3);
        protonPage.protonSignInBtn.click();

    }
    @Then("Verify location")
    public void verify_location() {
        BrowserUtils.waitFor(2);
        protonPage.verifyLogin();
        BrowserUtils.waitFor(2);


    }

}
