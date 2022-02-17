package controller;


import model.ContactDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactDetailsControllerTest {

    ContactDetails customer;
    ContactDetailsController cdc;

    @Before
    public void init(){
        customer = new ContactDetails();
        cdc = new ContactDetailsController();

    }
    @Test
    public void cdc() {
        customer = new ContactDetails("Hera", "Juno","Chinese","555","lol@gmail.com");
        int actualResult = ContactDetailsController.ContactDetails(customer);
        int expectedResult = 1;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @After
    public void tearDown(){
        customer = null;
        cdc = null;
    }

}