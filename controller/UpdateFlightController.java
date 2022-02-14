package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.UpdateFlightDetails;

public class UpdateFlightController {
    static DbConnection db;

    public int UpdateFlightDetails(UpdateFlightDetails user){
        String query;
        query = "insert into UpdateFlight(Flight_Number, Departure_Time, Arrival_Time, From_, Destination, Flight_Cost) values('" +
        UpdateFlightDetails.getfNumber() + "','" +
        UpdateFlightDetails.getdTime() + "','" +
        UpdateFlightDetails.getaTime() + "','" +
        UpdateFlightDetails.getFrom() + "','" +
        UpdateFlightDetails.getDestination() + "','" +
        UpdateFlightDetails.getFlightCost() + "');";
    
        db = new DbConnection();
        return db.maniulate(query);
     }
    }