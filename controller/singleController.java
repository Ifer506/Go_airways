package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.singleDetails;

public class singleController {
    DbConnection db;

    public int singleDetails(singleDetails customer){
       String query;
       query = "insert into book(flightNumber) values('" +
       singleDetails.getFlightNumber() + "');";

       db = new DbConnection();
       return db.maniulate(query);
    }
}
