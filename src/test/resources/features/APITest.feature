@Airalo
Feature: Tests for Airalo's partner API

  Scenario: [TC01] Authenticate to get access token
    When A POST request is sent to Airalo partner API for OAuth2
    Then Verify the http response code is 200
    And Check the response message is a Success


  Scenario: [TC02] Post an order for 6 merhaba-7days-1gb eSIMs
    When A POST request is sent to Airalo partner API for order eSIMs
    Then Verify the http response code is 200
    And Check the response message contains package_id
    And Check the response message contains quantity information
    And Check the response message contains currency USD information
    And Check the response message contains eSIM type information
    And Check the response message is a Success


  Scenario: [TC03] Get a list of eSIMs
    When A GET request is receive list of eSims
    Then Verify the http response code is 200
    And Check the response message contains lpa information
    And Check the response message contains matching id information
    And Check the response message is a Success