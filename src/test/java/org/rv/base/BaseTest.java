package org.rv.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.rv.asserts.AssertActions;
import org.rv.endpoints.APIConstrants;
import org.rv.modules.PayloadManager;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    //Common to All Test Cases
    //URL, content Type-Json- common
    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;
    @BeforeTest
    public void setUp(){
        //Base URL, Content Type->Json
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
//        requestSpecification= RestAssured.given().baseUri(APIConstrants.base_URL)
//                .contentType(ContentType.JSON).log().all();
        requestSpecification = new RequestSpecBuilder().setBaseUri(APIConstrants.base_URL)
                .addHeader("Content-Type","application/json").build()
                .log().all();

    }
}
