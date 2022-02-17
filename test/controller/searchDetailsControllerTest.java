package controller;


import static org.junit.Assert.*;
import controller.searchDetailsController;
import model.searchDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class searchDetailsControllerTest {

    @org.junit.Test
    public void Home() {
    }

    @org.junit.Test
    public void flightDetails() {
    }

    searchDetails customer;
    controller.searchDetailsController searchDetailsController;

    @Before
    public void init(){
        customer = new searchDetails();
        searchDetailsController = new searchDetailsController();
    }

    @Test
    public void connection(){
        customer = new searchDetails("Birgung", "Kathmandu", "Dec 25, 2012", "Dec 28, 2012", "Chinese");
        int actualResult = searchDetailsController.Home(customer);
        int expectedResult = 1;

        Assert.assertEquals(actualResult,expectedResult);
    }

    @After
    public void tearDown(){
        customer = null;
        searchDetailsController = null;
    }


}