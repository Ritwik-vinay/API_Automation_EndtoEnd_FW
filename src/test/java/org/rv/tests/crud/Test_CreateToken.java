package org.rv.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.rv.base.BaseTest;
import org.rv.endpoints.APIConstrants;
import org.rv.pojos.Token;
import org.rv.pojos.TokenResponse;
import org.testng.annotations.Test;

public class Test_CreateToken  extends BaseTest {
    @Test(groups = "qa", priority = 1)
    @Owner("Ritwik Vinay")
    @Description("Tc#INT2 - Step 2 Verify the Created Token")
    public void testcreateToken(){
        requestSpecification.basePath(APIConstrants.Auth_URL);
        response= RestAssured.given(requestSpecification)
                .when().body(payloadManager.create_PayloadTokenasString()).post();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        TokenResponse tokenResponse = payloadManager.bookingtokenResponseJava(response.asString());





    }
}
