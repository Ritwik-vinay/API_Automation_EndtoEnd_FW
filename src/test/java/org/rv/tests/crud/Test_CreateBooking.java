package org.rv.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.rv.base.BaseTest;
import org.rv.endpoints.APIConstrants;
import org.rv.pojos.BookingResponse;
import org.testng.annotations.Test;

public class Test_CreateBooking extends BaseTest {
    @Test(groups = "qa", priority = 1)
    @Owner("Ritwik Vinay")
    @Description("Tc#INT1 - Step 1 verify that the booking can be created")
    public void testcreateBooking() {
        requestSpecification.basePath(APIConstrants.create_update_booking_URL);
        response = RestAssured.given(requestSpecification).when().body(payloadManager.create_PayloadBookingasString())
                .post();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());
        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(), "Ritwik");

    }
}
