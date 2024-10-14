package com.airalo.website.ui.test.pageObjects;


import com.airalo.website.ui.test.pageResources.HomePageRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.airalo.website.ui.test.factory.DriverFactory.driver;

public class HomePage {


    private final By pageAiraloLogo = By.xpath(HomePageRepo.AIRALO_LOGO);

    private final By acceptPrivacy = By.xpath(HomePageRepo.ACCEPT_PRIVACY);

    private final By pageCurrencyMenu = By.xpath(HomePageRepo.CURRENCY_MENU);

    private final By pageCurrencyPopUp = By.xpath(HomePageRepo.CURRENCY_POPUP);

    private final By pageCurrencySelectUSD = By.xpath(HomePageRepo.CURRENCY_USD);

    private final By pageUpdateCurrencyPopUp = By.xpath(HomePageRepo.UPDATE_CURRENCY_POPUP);

    private final By pageCurrencyUpdateBTN = By.xpath(HomePageRepo.CURRENCY_UPDATE_BTN);

    private final By pageUpdatedCurrency = By.xpath(HomePageRepo.UPDATED_CURRENCY);

    private final By pageSearchFieldInput = By.xpath(HomePageRepo.SEARCH_FIELD_INPUT);


    private final By SimPackageBuyNowBTN = By.xpath(HomePageRepo.SIM_PACKAGE_BUYNOW_BTN);
    private final By SimDetailOperatorTitle = By.xpath(HomePageRepo.SIM_DETAIL_OPERATOR_TITLE);

    private final By SimDetailCoverage = By.xpath(HomePageRepo.SIM_DETAIL_COVERAGE);
    private final By SimDetailData = By.xpath(HomePageRepo.SIM_DETAIL_DATA);


    private final By SimDetailValidity = By.xpath(HomePageRepo.SIM_DETAIL_VALIDITY);
    private final By SimDetailPrice = By.xpath(HomePageRepo.SIM_DETAIL_PRICE);


    public String isPageTitleExist() {

        return driver.getTitle();
    }

    public String getPageHomeUrl() {
        return driver.getCurrentUrl();
    }

    public void clickOnAcceptPrivacyBTN() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(acceptPrivacy)));
        js.executeScript("arguments[0].click();", driver.findElement(acceptPrivacy));

    }

    public boolean isPageAiraloLogoExist() {

        return driver.findElement(pageAiraloLogo).isDisplayed();
    }


    public void clickOnPageCurrencyMenu() {
        driver.findElement(pageCurrencyMenu).click();
    }

    public String isPageCurrencyPopUpDisplay() {

        return driver.findElement(pageCurrencyPopUp).getText();


    }


    public void isPageCurrencySelectUSD() {
        driver.findElement(pageCurrencySelectUSD).click();
    }

    public String isPageUpdateCurrencyPopUpDisplay() {


        return driver.findElement(pageUpdateCurrencyPopUp).getText();


    }


    public void clickOnPageCurrencyUpdateBTN() {
        driver.findElement(pageCurrencyUpdateBTN).click();
    }


    public boolean isPageUpdatedCurrencyDisplay() {

        return driver.findElement(pageUpdatedCurrency).isDisplayed();
    }

    public WebElement setPageSearchFieldInput() {
        return driver.findElement(pageSearchFieldInput);
    }

    public void clickOnSimPackageBuyNowBTN() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(SimPackageBuyNowBTN)));
        js.executeScript("arguments[0].click();", driver.findElement(SimPackageBuyNowBTN));


    }


    public boolean isSimDetailOperatorTitleExist() {

        return driver.findElement(SimDetailOperatorTitle).isDisplayed();
    }

    public String getSimDetailOperatorTitleText() {
        return driver.findElement(SimDetailOperatorTitle).getText();
    }


    public boolean isSimDetailCoverageExist() {

        return driver.findElement(SimDetailCoverage).isDisplayed();
    }

    public String getSimDetailCoverageText() {
        return driver.findElement(SimDetailCoverage).getText();
    }

    public boolean isSimDetailDataExist() {

        return driver.findElement(SimDetailData).isDisplayed();
    }

    public String getSimDetailDataText() {
        return driver.findElement(SimDetailData).getText();
    }


    public boolean isSimDetailValidityExist() {

        return driver.findElement(SimDetailValidity).isDisplayed();
    }

    public String getSimDetailValidityText() {
        return driver.findElement(SimDetailValidity).getText();
    }


    public boolean isSimDetailPriceExist() {

        return driver.findElement(SimDetailPrice).isDisplayed();
    }

    public String getSimDetailPriceText() {
        return driver.findElement(SimDetailPrice).getText();
    }


}
