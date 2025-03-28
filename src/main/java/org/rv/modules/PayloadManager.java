package org.rv.modules;

import com.google.gson.Gson;
import org.rv.pojos.*;

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
    //Converting the String into JAVA object
    public BookingResponse bookingResponseJava(String responseString){
        gson = new Gson();
        BookingResponse bookingResponse =gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;
    }

    public String create_PayloadTokenasString() {
        Token token = new Token();
        token.setUsername("admin");
        token.setPassword("password123");
        Gson gson1 = new Gson();
        String jsonStringtoken = gson.toJson(token);
        System.out.println(jsonStringtoken);
        return jsonStringtoken;
    }

    public TokenResponse bookingtokenResponseJava(String tokenresponseString) {
        gson = new Gson();
        TokenResponse tokenResponse = gson.fromJson(tokenresponseString, TokenResponse.class);
        return tokenResponse;
    }

}
