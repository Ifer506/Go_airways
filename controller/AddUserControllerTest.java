// package controller;

// import model.AddUserDetails;
// import org.junit.After;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.Test;

// import static org.junit.Assert.*;

// public class AddUserControllerTest {


//     AddUserDetails user;
//     AddUserController plus;

//     @Before
//     public void init(){
//         user = new AddUserDetails();
//         plus = new AddUserController();

//         }

//         @Test
//         public void plus() {
//             user = new AddUserDetails("Kaido","Raj","One","hell@gmail.com","666","asd","asd","true");
//             int actualResult = AddUserController.AddUserDetails(user);
//             int expectedResult = 1;
//             Assert.assertEquals(actualResult,expectedResult);
//         }

//         @After
//         public void tearDown(){
//             user = null;
//             plus = null;
//         }

// }