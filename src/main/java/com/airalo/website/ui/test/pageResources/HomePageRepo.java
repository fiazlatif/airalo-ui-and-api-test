package com.airalo.website.ui.test.pageResources;

public class HomePageRepo {

    /*
     *  Repository for all objects in home page
     */

    public static final String AIRALO_LOGO = "//img[@data-testid='airalo-logo']";

    public static final String ACCEPT_PRIVACY = "//button[@id='onetrust-accept-btn-handler']";

    public static final String CURRENCY_MENU = "//*/li[4]/div/span[@class='c--shared_header_item header-item']";

    public static final String CURRENCY_POPUP = "//*[text()='Currency']";

    public static final String CURRENCY_USD = "//*[@data-testid='USD-currency-select']";

    public static final String UPDATE_CURRENCY_POPUP = "//p[contains(text(),'Update your currency from')]";

    public static final String CURRENCY_UPDATE_BTN = "//*[@data-testid='UPDATE-button']";

    public static final String UPDATED_CURRENCY = "   //*[@data-testid='$ USD-header-language']";

    public static final String SEARCH_FIELD_INPUT = "//input[@data-testid='search-input']";

    public static final String SIM_PACKAGE_BUYNOW_BTN = "//*[@href='/japan-esim/moshi-moshi-7days-1gb']//*[contains(text(),'BUY NOW')]";

    public static final String SIM_DETAIL_OPERATOR_TITLE = "//*[@data-testid='sim-detail-operator-title']";

    public static final String SIM_DETAIL_COVERAGE = "//*[@class='c--sim_detail sim-detail theme-light']//*[@data-testid='COVERAGE-value']";

    public static final String SIM_DETAIL_DATA = "//*[@class='c--sim_detail sim-detail theme-light']//li[2]/div/p[@data-testid='DATA-value']";

    public static final String SIM_DETAIL_VALIDITY = "//*[@class='c--sim_detail sim-detail theme-light']//li[3]/div/p[@data-testid='VALIDITY-value']";

    public static final String SIM_DETAIL_PRICE = "//*[@class='c--sim_detail sim-detail theme-light']//li[4]/div/p[@data-testid='PRICE-value']";


}
