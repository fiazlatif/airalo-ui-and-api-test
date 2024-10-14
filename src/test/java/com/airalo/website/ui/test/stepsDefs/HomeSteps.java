package com.airalo.website.ui.test.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomeStepDefs homeStepDefs = new HomeStepDefs();


    @Given("User is on the Home page")
    public void verifyHomePage() {
        homeStepDefs.init();
        homeStepDefs.checkGetPageHomeUrl();


    }

    @When("User accepts cookies privacy")
    public void verifyCheckClickOnAcceptPrivacyBTN() {
        homeStepDefs.checkClickOnAcceptPrivacyBTN();
    }


    @Then("Check the Home page title")
    public void verifyHomePageTitle() {
        homeStepDefs.checkPageTitleExist();
    }

    @And("Check the Home page title text is as expected")
    public void verifyHomePageTitleText() {
        homeStepDefs.checkPageTitleExist();
    }


    @And("Check the Home page Airalo logo is displayed")
    public void verifyHomePageLogo() {
        homeStepDefs.checkHomePageLogoExist();
    }


    @When("Click on currency menu")
    public void verifyCheckClickOnPageCurrencyMenu() {
        homeStepDefs.checkClickOnPageCurrencyMenu();
    }

    @Then("Check currency popup is displayed as expected")
    public void verifyCheckIsPageCurrencyPopUpDisplay() {
        homeStepDefs.checkIsPageCurrencyPopUpDisplay();
    }


    @And("Click on currency united states dollar USD")
    public void verifyCheckIsPageCurrencySelectUSD() {
        homeStepDefs.checkIsPageCurrencySelectUSD();
    }

    @And("Check update your currency popup is displayed as expected")
    public void verifCheckIsPageUpdateCurrencyPopUpDisplay() {
        homeStepDefs.checkIsPageUpdateCurrencyPopUpDisplay();
    }


    @And("Click on update button")
    public void verifyCheckClickOnPageCurrencyUpdateBTN() {
        homeStepDefs.CheckClickOnPageCurrencyUpdateBTN();
    }

    @And("Check currency united states dollar is display as expected")
    public void verifyCheckIsPageUpdatedCurrencyDisplay() {
        homeStepDefs.checkIsPageUpdatedCurrencyDisplay();
    }

    @When("Check search for country Japan input is working as expected")
    public void verifyCheckSetPageSearchFieldInput() {
        homeStepDefs.checkSetPageSearchFieldInput();
    }


    @Then("Select searched country Japan")
    public void verifyClickSelectCountryJapan() {
        homeStepDefs.checkClickSelectCountryJapan();
    }


    @And("Click on Buy Now button on the first eSIM Package")
    public void checkClickOnSimPackageBuyNowBTN() {
        homeStepDefs.checkClickOnSimPackageBuyNowBTN();
    }

    @And("Check eSIM package title is displayed")
    public void checkIsSimDetailOperatorTitleExist() {
        homeStepDefs.checkIsSimDetailOperatorTitleExist();
    }

    @And("Check eSIM package title text is as expected")
    public void checkGetSimDetailOperatorTitleText() {
        homeStepDefs.checkGetSimDetailOperatorTitleText();
    }


    @And("Check eSIM package coverage is displayed")
    public void checkIsSimDetailCoverageExist() {
        homeStepDefs.checkIsSimDetailCoverageExist();
    }

    @And("Check eSIM package  coverage value is as expected")
    public void checkGetSimDetailCoverageText() {
        homeStepDefs.checkGetSimDetailCoverageText();
    }


    @And("Check eSIM package data is displayed")
    public void checkIsSimDetailDataExist() {
        homeStepDefs.checkIsSimDetailDataExist();
    }

    @And("Check eSIM package  data value is as expected")
    public void checkGetSimDetailDataText() {
        homeStepDefs.checkGetSimDetailDataText();
    }


    @And("Check eSIM package validity is displayed")
    public void isSimDetailValidityExist() {
        homeStepDefs.isSimDetailValidityExist();
    }

    @And("Check eSIM package  validity value is as expected")
    public void getSimDetailValidityText() {
        homeStepDefs.getSimDetailValidityText();
    }


    @And("Check eSIM package price is displayed")
    public void checkIsSimDetailPriceExist() {
        homeStepDefs.checkIsSimDetailPriceExist();
    }

    @And("Check eSIM package price value is as expected")
    public void checkGetSimDetailPriceText() {
        homeStepDefs.checkGetSimDetailPriceText();
    }


    @And("Verify all and report")
    public void verifyAllReport() {
        homeStepDefs.checkAllAssert();

    }

}
