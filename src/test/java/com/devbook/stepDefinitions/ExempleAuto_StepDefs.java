package com.devbook.stepDefinitions;

import com.devbook.pages.ExempleAutoPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.ConfigurationReader;
import com.devbook.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class ExempleAuto_StepDefs {
    ExempleAutoPage exempleAutoPage = new ExempleAutoPage();
    Faker faker = new Faker();
    String url = "https://www.automationexercise.com/";

    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        exempleAutoPage.verifyHomePageLogo();

    }

    @When("Click to Signup Login button")
    public void click_to_signup_login_button() {
        BrowserUtils.waitFor(3);
        exempleAutoPage.signUpLoginBtn.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        exempleAutoPage.verifyNewUserText();

    }

    @When("Enter name and email address")
    public void enter_name_and_email_address() {
        exempleAutoPage.userName.sendKeys(faker.name().fullName());
        exempleAutoPage.emailName.sendKeys(faker.internet().emailAddress());


    }

    @When("Click  to Signup button")
    public void click_to_signup_button() {
        exempleAutoPage.signUpBtn.click();
        BrowserUtils.waitFor(1);

    }

    @Then("Verify that  ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        exempleAutoPage.verifyEnterAccountText();
        BrowserUtils.waitFor(2);

    }

    @When("Enters Title Name Email Password Date of birth")
    public void enters_title_name_email_password_date_of_birth() {

        exempleAutoPage.passwordInbox.sendKeys(faker.internet().password());
        BrowserUtils.waitFor(2);
        exempleAutoPage.dayIn.sendKeys("10", Keys.ENTER);
        exempleAutoPage.monthIn.sendKeys("June", Keys.ENTER);
        exempleAutoPage.yearIn.sendKeys("1997", Keys.ENTER);
    }


    @When("Select checkbox sign up for our newsletter!'")
    public void select_checkbox_sign_up_for_our_newsletter() {
        BrowserUtils.waitFor(2);
        exempleAutoPage.newsletterCheck.click();
    }

    @When("Select checkbox  Receive special offers from our partners")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        exempleAutoPage.partnersCheck.click();
        BrowserUtils.waitFor(2);
    }

    @When("Enters First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void enters_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        exempleAutoPage.firstName.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(1);
        exempleAutoPage.lastName.sendKeys(faker.name().lastName());
        BrowserUtils.waitFor(1);
        exempleAutoPage.companyName.sendKeys(faker.company().name());
        BrowserUtils.waitFor(1);
        exempleAutoPage.address1Name.sendKeys(faker.address().streetAddress());
        BrowserUtils.waitFor(1);
        exempleAutoPage.address2Name.sendKeys(faker.address().fullAddress());
        BrowserUtils.waitFor(1);
        exempleAutoPage.countryName.sendKeys(faker.address().country());
        BrowserUtils.waitFor(1);
        exempleAutoPage.stateName.sendKeys(faker.address().state());
        BrowserUtils.waitFor(1);
        exempleAutoPage.cityName.sendKeys(faker.address().cityName());
        BrowserUtils.waitFor(1);
        exempleAutoPage.zipCode.sendKeys(faker.address().zipCode());
        BrowserUtils.waitFor(1);
        exempleAutoPage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    }

    @When("Click create Account button")
    public void click_create_account_button() {
        exempleAutoPage.createAccountBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        exempleAutoPage.verifyAccountCreated();
        BrowserUtils.waitFor(2);
    }

}
