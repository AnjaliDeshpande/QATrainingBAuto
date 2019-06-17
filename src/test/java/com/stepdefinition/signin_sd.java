package com.stepdefinition;


import com.pages.signin_page;
import com.webDriverClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class signin_sd extends webDriverClass {
signin_page signinPage = PageFactory.initElements(driver, signin_page.class);




    @Given("^I go to URL as \"([^\"]*)\"$")
    public void iGoToURLAs(String URL) {
        signinPage.enterURL(URL);
    }

    @Given("^I goto URL as \"([^\"]*)\"$")
    public void iGotoURLAs(String arg0) {

    }


    @When("^I click on sign in button on signin page$")
    public void iClickOnSignInButtonOnSigninPage() {
        signinPage.clickSignInbuttonOnSignInPage();
    }

    @Given("^I enter Email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String emailid){
        signinPage.enterEmailAddress(emailid);



    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        signinPage.enterPasswordAs(password);

        }

    @When("^Click on sign in button on signin page$")
    public void clickOnSignInButtonOnSigninPage(){
        signinPage.clickSignInbuttonOnSignInPage();
    }

    @Then("^I should see error message <\"([^\"]*)\">$")
    public void iShouldSeeErrorMessage(String errorMessage_Exp){
        signinPage.assertErrorMessage(errorMessage_Exp);
    }
}


