package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.updateDetails;

public class updateDetailsController {
    DbConnection db;

    public int Home(updateDetails customer){
       String query;
       query = "insert into updateDetails(flightNumber, Dep_Time, Arr_Time, Destination) values('" +
        updateDetails.getfn() + "','" +
        updateDetails.getdt() + "','" +
        updateDetails.getat() + "','" +
        updateDetails.getd() + "');";

       db = new DbConnection();
       return db.maniulate(query);
    }
}