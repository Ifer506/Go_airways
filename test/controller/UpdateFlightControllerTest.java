package test.controller;

import controller.UpdateFlightController;
import model.UpdateFlightDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateFlightControllerTest {

    UpdateFlightDetails user;
    UpdateFlightController upDate;

    @Before
    public void init(){
        user = new UpdateFlightDetails();
        upDate = new UpdateFlightController();

    }

    @Test
    public void upDate() {
        user = new UpdateFlightDetails("123","11:12","5:00","Kathmandu","Birgung","");
        int actualResult = UpdateFlightController.UpdateFlightDetails(user);
        int expectedResult = 1;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @After
    public void tearDown(){
        user = null;
        upDate = null;
    }
}