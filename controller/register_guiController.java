package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.register_guiDetails;

public class register_guiController {
    private static DbConnection db;

    public static int register_guiDetails(register_guiDetails user){
       String query;
       query = "insert into register_gui(fName, lName, uName, eMail, pNumber, gender, date, password, cPassword, admin) values('" +
       register_guiDetails.getFName() + "','" +
       register_guiDetails.getLName() + "','" +
       register_guiDetails.getUserName() + "','" +
       register_guiDetails.getEMail() + "','" +
       register_guiDetails.getPNumber() + "','" +
       register_guiDetails.getGender() + "','" +
       register_guiDetails.getDate() + "','" +
       register_guiDetails.getPassword() + "','" +
       register_guiDetails.getCPassword() + "','" +
       register_guiDetails.getAdmin() + "');";

       db = new DbConnection();
       return db.maniulate(query);
    }
}