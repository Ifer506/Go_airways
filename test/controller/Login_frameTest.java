package controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import view.Login_frame;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;

public class Login_frameTest {

    Login_frame fram;
    Login_frame reg;

    @Before
    public void init(){
        fram = new Login_frame();
        reg = new Login_frame();

    }

    @Test
    public void login_buttonActionPerformed(){
        fram = new Login_frame();
        


    }

    @After
    public void tearDown(){
        fram = null;
        reg = null;
    }
}