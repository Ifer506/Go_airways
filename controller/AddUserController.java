package controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import database.DbConnection;
import model.AddUserDetails;

public class AddUserController {
    static DbConnection db;

    public static int AddUserDetails(AddUserDetails user){
        String query;
        query = "insert into AddUser(First_Name, Last_Name, User_Name, EMail, Phone_Number, password, Confirm_Password, Admin) values('" +
        AddUserDetails.getfName() + "','" +
        AddUserDetails.getlName() + "','" +
         AddUserDetails.getuName() + "','" +
         AddUserDetails.geteMail() + "','" +
         AddUserDetails.getpNumber() + "','" +
         AddUserDetails.getPassword() + "','" +
         AddUserDetails.getCPassword() + "','" +
         AddUserDetails.getAdmin() + "');";
    
        db = new DbConnection();
        return db.maniulate(query);
     }
    }