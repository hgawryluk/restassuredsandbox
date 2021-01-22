package com.herokuapp.restfulbooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetBookingTest {

    @Test
    public void getBookingTest() {
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/1");
        response.print();
        Assert.assertEquals(response.getStatusCode(), 200);

    }
}
