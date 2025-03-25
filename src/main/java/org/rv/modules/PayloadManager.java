package org.rv.modules;

import com.google.gson.Gson;
import org.rv.pojos.Booking;
import org.rv.pojos.Bookingdates;

public class PayloadManager {
    //Convert the java objects to JSON
    //GSON-> Ser and deser.
    Gson gson;
    public String create_PayloadBookingasString() {
        Booking booking = new Booking();
        booking.setFirstname("Ritwik");
        booking.setLastname("Vinay");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-02");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        System.out.println(booking);
        //Java object ->json
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);
        return jsonStringBooking;
    }
}
