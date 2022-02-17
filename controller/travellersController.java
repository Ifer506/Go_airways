package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.travellers;

public class travellersController {
    DbConnection db;

    public int travellers(travellers travel){
       String query;
       query = "insert into travellers(travellers) values('" +
        travellers.getTravel() + "');";

       db = new DbConnection();
       return db.maniulate(query);
}

    public travellers AfterTicket(String travel){
        String query;
        query = "select * from travellers;";
        db = new DbConnection();
        ResultSet rs = db.retrieve(query);
        travellers travell = null;
        
        try{
            while (rs.next()){
                travell = new travellers(query);
                travell.setTravellers(rs.getString("travellers"));
            }
        }
        
        catch (Exception ex){
            System.out.println("Error"+ ex);
        }
        
        return travell;
        }
}