package org.rv.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    @Test(groups="qa", priority=1)
    @Owner("Ritwik")
    @Description("TC# TC1 = Step1 verify that the booking can be created")
    public void testcreateBooking(){
        Assert.assertTrue(true);

    }
    @Test(groups="qa", priority=2)
    @Owner("Ritwik")
    @Description("TC# TC2 = Step2 verify that the booking cBy ID")
    public void testverifyBookingID(){
        Assert.assertTrue(true);

    }
    @Test(groups="qa", priority=3)
    @Owner("Ritwik")
    @Description("TC# TC3 = Step3 verify Updated Booking By ID")
    public void testupdateBookingId(){
        Assert.assertTrue(true);

    }
    @Test(groups="qa", priority=1)
    @Owner("Ritwik")
    @Description("TC# TC4 = Step4 verify Delete Booking By ID")
    public void testdeleteBookingID(){
        Assert.assertTrue(true);

    }
}
