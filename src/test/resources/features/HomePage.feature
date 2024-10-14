@Airalo
Feature: Test all features in Home Page of Airalo's website

  Background: Check if user is on Home Page
    Given User is on the Home page


  @H_TC001
  Scenario: [@H_TC001] Verify application is running
    When User accepts cookies privacy
    Then Check the Home page title
    And  Check the Home page title text is as expected
    And  Check the Home page Airalo logo is displayed
    And  Verify all and report


  @H_TC002
  Scenario: [@H_TC002] Update currency to $USD
    When Click on currency menu
    Then Check currency popup is displayed as expected
    And  Click on currency united states dollar USD
    And  Check update your currency popup is displayed as expected
    And  Click on update button
    And  Check currency united states dollar is display as expected
    And  Verify all and report


  @H_TC003
  Scenario: [@H_TC003] Select Japan eSim package and verify corresponding details
    When Check search for country Japan input is working as expected
    Then Select searched country Japan
    And  Click on Buy Now button on the first eSIM Package
    And  Check eSIM package title is displayed
    And  Check eSIM package title text is as expected
    And  Check eSIM package coverage is displayed
    And  Check eSIM package  coverage value is as expected
    And  Check eSIM package data is displayed
    And  Check eSIM package  data value is as expected
    And  Check eSIM package validity is displayed
    And  Check eSIM package  validity value is as expected
    And  Check eSIM package price is displayed
    And  Check eSIM package price value is as expected
    And Verify all and report