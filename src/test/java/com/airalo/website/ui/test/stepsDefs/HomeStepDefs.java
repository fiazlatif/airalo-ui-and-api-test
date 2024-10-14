package com.airalo.website.ui.test.stepsDefs;

import com.airalo.website.ui.test.factory.DriverFactory;
import com.airalo.website.ui.test.pageObjects.HomePage;
import com.airalo.website.ui.test.pageResources.HomePageUITextAndMessages;
import com.airalo.website.ui.test.utils.Config;
import org.apache.log4j.helpers.LogLog;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class HomeStepDefs {

    public static WebDriver driver = null;

    HomePage homePage = new HomePage();

    SoftAssertions softAssert = new SoftAssertions();

    public void threadSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }


    public void checkGetPageHomeUrl() {
        softAssert.assertThat(homePage.getPageHomeUrl())
                .as("Home url is ... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.HOME_URL, homePage.getPageHomeUrl())
                .isEqualTo(HomePageUITextAndMessages.HOME_URL);
    }

    public void checkPageTitleExist() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        softAssert.assertThat(homePage.isPageTitleExist())
                .as("Page title text ... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.PAGE_TITLE_TEXT, homePage.isPageTitleExist())
                .isEqualTo(HomePageUITextAndMessages.PAGE_TITLE_TEXT);
    }


    public void checkClickOnAcceptPrivacyBTN() {
        homePage.clickOnAcceptPrivacyBTN();
        threadSleep(3);
    }


    public void checkHomePageLogoExist() {
        softAssert.assertThat(homePage.isPageAiraloLogoExist())
                .as("Home page Airalo logo exist: %s", homePage.isPageAiraloLogoExist() ? "true" : "false").isTrue();
    }


    public void checkClickOnPageCurrencyMenu() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.clickOnPageCurrencyMenu();

    }


    public void checkIsPageCurrencyPopUpDisplay() {
        threadSleep(2);
        softAssert.assertThat(homePage.isPageCurrencyPopUpDisplay()).isEqualTo(HomePageUITextAndMessages.CURRENCY_POPUP_Text);
    }

    public void checkIsPageCurrencySelectUSD() {
        homePage.isPageCurrencySelectUSD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void checkIsPageUpdateCurrencyPopUpDisplay() {
        threadSleep(2);
        Assertions.assertThat(homePage.isPageUpdateCurrencyPopUpDisplay()).contains(HomePageUITextAndMessages.UPDATE_CURRENCY_POPUP_Text);

    }

    public void CheckClickOnPageCurrencyUpdateBTN() {
        homePage.clickOnPageCurrencyUpdateBTN();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void checkIsPageUpdatedCurrencyDisplay() {
        softAssert.assertThat(homePage.isPageUpdatedCurrencyDisplay())
                .as("Updated currency United States dollar USD is displayed: %s", homePage.isPageUpdatedCurrencyDisplay() ? "true" : "false").isTrue();
    }


    public void checkSetPageSearchFieldInput() {

        homePage.setPageSearchFieldInput().sendKeys("Japan");
    }

    public void checkClickSelectCountryJapan() {
        driver.get("https://www.airalo.com/japan-esim");
        threadSleep(3);
    }


    public void checkClickOnSimPackageBuyNowBTN() {
        homePage.clickOnSimPackageBuyNowBTN();
        threadSleep(3);
    }


    public void checkIsSimDetailOperatorTitleExist() {
        softAssert.assertThat(homePage.isSimDetailOperatorTitleExist())
                .as("SIM detail operator title exist: %s", homePage.isSimDetailOperatorTitleExist() ? "true" : "false").isTrue();
    }

    public void checkGetSimDetailOperatorTitleText() {
        softAssert.assertThat(homePage.getSimDetailOperatorTitleText())
                .as("SIM detail operator title text... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.SIM_DETAIL_OPERATOR_TITLE_TEXT, homePage.getSimDetailOperatorTitleText())
                .isEqualTo(HomePageUITextAndMessages.SIM_DETAIL_OPERATOR_TITLE_TEXT);

    }


    public void checkIsSimDetailCoverageExist() {
        softAssert.assertThat(homePage.isSimDetailCoverageExist())
                .as("SIM detail operator coverage exist: %s", homePage.isSimDetailCoverageExist() ? "true" : "false").isTrue();
    }

    public void checkGetSimDetailCoverageText() {
        softAssert.assertThat(homePage.getSimDetailCoverageText())
                .as("SIM detail operator coverage text... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.SIM_DETAIL_COVERAGE_TEXT, homePage.getSimDetailCoverageText())
                .isEqualTo(HomePageUITextAndMessages.SIM_DETAIL_COVERAGE_TEXT);

    }


    public void checkIsSimDetailDataExist() {
        softAssert.assertThat(homePage.isSimDetailDataExist())
                .as("SIM detail operator data exist: %s", homePage.isSimDetailDataExist() ? "true" : "false").isTrue();
    }

    public void checkGetSimDetailDataText() {
        softAssert.assertThat(homePage.getSimDetailDataText())
                .as("SIM detail operator data text... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.SIM_DETAIL_DATA_TEXT, homePage.getSimDetailDataText())
                .isEqualTo(HomePageUITextAndMessages.SIM_DETAIL_DATA_TEXT);

    }

    public void isSimDetailValidityExist() {
        softAssert.assertThat(homePage.isSimDetailValidityExist())
                .as("SIM detail operator validity exist: %s", homePage.isSimDetailValidityExist() ? "true" : "false").isTrue();
    }

    public void getSimDetailValidityText() {
        softAssert.assertThat(homePage.getSimDetailValidityText())
                .as("SIM detail operator validity text... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.SIM_DETAIL_VALIDITY_TEXT, homePage.getSimDetailValidityText())
                .isEqualTo(HomePageUITextAndMessages.SIM_DETAIL_VALIDITY_TEXT);

    }

    public void checkIsSimDetailPriceExist() {
        softAssert.assertThat(homePage.isSimDetailPriceExist())
                .as("SIM detail operator price exist: %s", homePage.isSimDetailPriceExist() ? "true" : "false").isTrue();
    }

    public void checkGetSimDetailPriceText() {
        softAssert.assertThat(homePage.getSimDetailPriceText())
                .as("SIM detail operator price text... Expected: '%s', Actual: '%s'", HomePageUITextAndMessages.SIM_DETAIL_PRICE_TEXT, homePage.getSimDetailPriceText())
                .isEqualTo(HomePageUITextAndMessages.SIM_DETAIL_PRICE_TEXT);

    }


    public void checkAllAssert() {
        softAssert.assertAll();
        softAssert = null;
    }


    public void init() {
        try {
            driver = DriverFactory.getDriver();
            driver.get(Config.WEBSITE_URL);

            System.out.println("Browser is starting");

        } catch (Throwable t) {
            LogLog.error("Browser is not starting", t);
            throw t;

        }


    }

    public void tearDown() {
        try {
            DriverFactory.quitDriver();
            System.out.println("Browser is quit");

        } catch (Throwable t) {
            LogLog.error("Something is wrong", t);
            throw t;
        }
    }

}
