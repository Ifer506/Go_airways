package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.searchDetails;

public class searchDetailsController {
    DbConnection db;

    public int Home(searchDetails customer){
       String query;
       query = "insert into searchDetails(from0, to0, ddate, adate, nationality) values('" +
        searchDetails.getFrom0() + "','" +
        searchDetails.getTo0() + "','" +
        searchDetails.getDdate() + "','" +
        searchDetails.getAdate() + "','" +
        searchDetails.getNationality() + "');";

       db = new DbConnection();
       return db.maniulate(query);
    }
    // Login Customer
public searchDetails FlightDetails(String from0, String to0, String ddate, String adate, String Nationality){
    String query;
    query = "select * from searchDetsils;";
    db = new DbConnection();
    ResultSet rs = db.retrieve(query);
    searchDetails searchDetails = null;
    try{
        while (rs.next()){
            searchDetails = new searchDetails();
            searchDetails.setFrom0(rs.getString("from0"));
            searchDetails.setTo0(rs.getString("to0"));
            searchDetails.setDdate(rs.getString("ddate"));
            searchDetails.setAdate(rs.getString("adate"));
            searchDetails.setNationality(rs.getString("nationality"));
        }
    }
    catch (Exception ex){
        System.out.println("Error"+ ex);
    }
    return searchDetails;
    }
}