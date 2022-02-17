package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.travellersDetails;

public class travellerDetailsController {
    DbConnection db;

    public int travellersDetails(travellersDetails customer){
       String query;
       query = "insert into TravellersDetails(fullName, nationality) values('" +
       travellersDetails.getFullName() + "','" +
       travellersDetails.getNationality() + "');";

       db = new DbConnection();
       return db.maniulate(query);
    }
}
