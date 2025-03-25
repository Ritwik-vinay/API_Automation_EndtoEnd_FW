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
}
