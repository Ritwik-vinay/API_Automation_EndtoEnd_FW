package org.rv.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.rv.base.BaseTest;
import org.rv.endpoints.APIConstrants;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.requestSpecification;

public class Test_HealthCheck extends BaseTest {
    @Test
    @Owner("Ritwik Vinay")
    @Description("Tc#INT1 - Step 3 Verify HealthCheck ")
    public void testcreateBooking(){
        requestSpecification.basePath(APIConstrants.Ping_URL);
        Response response = RestAssured.given(requestSpecification)
                .when().get();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);

    }
}
