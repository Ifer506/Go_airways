// package controller;

// import model.searchDetails;
// import org.junit.Test;

// import static org.junit.Assert.*;
// import model.register_guiDetails;
// import org.junit.After;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.Test;

// public class register_guiControllerTest {

//     register_guiDetails user;
//     register_guiController reg;

//     @Before
//     public void init(){
//         user = new register_guiDetails();
//         reg = new register_guiController();

//     }

//     @Test
//     public void reg() {
//         user = new register_guiDetails("Sumedha","Raj","Ifer","helloKitty@gmail.com","666","asd","asd","male","Dec 18,2001",true);
//         int actualResult = register_guiController.register_guiDetails(user);
//         int expectedResult = 1;
//         Assert.assertEquals(actualResult,expectedResult);
//     }

//     @After
//     public void tearDown(){
//         user = null;
//         reg = null;
//     }

// }