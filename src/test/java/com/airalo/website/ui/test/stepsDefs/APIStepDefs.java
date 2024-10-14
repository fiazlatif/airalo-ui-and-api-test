package com.airalo.website.ui.test.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

import java.util.HashMap;

public class APIStepDefs {

    public static String accessToken = "";
    public static Response response;


    @When("A POST request is sent to Airalo partner API for OAuth2")
    public void postReq() {

        RestAssured.baseURI = "https://sandbox-partners-api.airalo.com";
        String body = "{\n" +
                "    \"client_id\": \"7e29e2facf83359855f746fc490443e6\",\n" +
                "    \"client_secret\": \"e5NNajm6jNAzrWsKoAdr41WfDiMeS1l6IcGdhmbb\",\n" +
                "    \"grant_type\": client_credentials\n" +
                "}";

        HashMap<String, String> map = new HashMap();
        map.put("client_id", "7e29e2facf83359855f746fc490443e6");
        map.put("client_secret", "e5NNajm6jNAzrWsKoAdr41WfDiMeS1l6IcGdhmbb");
        map.put("grant_type", "client_credentials");

        response = RestAssured.
                given().
                header("Accept", "application/json").
                formParams(map).
                when().log().all().
                post("/v2/token").
                then().
                log().all().
                extract().response();

        accessToken = response.asString().split("access_token\":\"")[1].split("\"")[0];

        System.out.println("accessToken");

    }

    @When("A POST request is sent to Airalo partner API for order eSIMs")
    public void createOrder() {

        HashMap<String, String> map = new HashMap();
        map.put("quantity", "6");
        map.put("package_id", "merhaba-7days-1gb");
        map.put("type", "sim");

        response = RestAssured.
                given().
                header("Accept", "application/json").
                header("Authorization", "Bearer " + accessToken).
                formParams(map).
                when().log().all().
                post("/v2/orders").
                then().
                log().all().
                extract().response();


    }

    @And("Check the response message contains package_id")
    public void responseMessagePackageId() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"package_id\":\"merhaba-7days-1gb\"");
    }


    @And("Check the response message contains quantity information")
    public void responseMessageQuantity() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"quantity\":6");
    }

    @And("Check the response message contains currency USD information")
    public void responseMessageCurrency() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"currency\":\"USD\"");
    }

    @And("Check the response message contains eSIM type information")
    public void responseMessageSIMType() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"esim_type\":\"Prepaid\"");
    }


    @When("A GET request is receive list of eSims")
    public void getOrder() {

        HashMap<String, String> map = new HashMap();
        map.put("limit", "6");
        map.put("package_id", "merhaba-7days-1gb");

        response = RestAssured.
                given().
                header("Accept", "application/json").
                header("Authorization", "Bearer " + accessToken).
                formParams(map).
                when().log().all().
                get("/v2/sims").
                then().
                log().all().
                extract().response();


    }

    @Then("Verify the http response code is 200")
    public void statusCodeCheck() {
        Assertions.assertThat(response.getStatusCode()).isEqualTo(200);
    }


    @And("Check the response message contains lpa information")
    public void responseMessageLPA() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"lpa\":\"lpa.airalo.com\"");
    }

    @And("Check the response message contains matching id information")
    public void responseMessageMatching_id() {
        String metaData = response.asString().split("data")[1];
        Assertions.assertThat(metaData).contains("\"matching_id\":\"TEST\"");
    }


    @And("Check the response message is a Success")
    public void successMessage() {
        String metaData = response.asString().split("meta")[1];
        Assertions.assertThat(metaData).contains("\"message\":\"success\"");
    }


}
