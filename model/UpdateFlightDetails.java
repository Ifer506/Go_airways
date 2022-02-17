package model;

public class UpdateFlightDetails {
    private static String fNumber;
    private static String dTime;
    private static String aTime;
    private static String from;
    private static String destination;
    private static String flightCost;

    public UpdateFlightDetails(){

    }

    public UpdateFlightDetails(String fNumber,String dTime ,String aTime, String from, String destination,String flightCost){
        UpdateFlightDetails.fNumber = fNumber;
        UpdateFlightDetails.dTime = dTime;
        UpdateFlightDetails.aTime  = aTime;
        UpdateFlightDetails.from  = from;
        UpdateFlightDetails.destination = destination;
        UpdateFlightDetails.flightCost = flightCost;
    }
    public static String getfNumber() {
        return fNumber;
    }
   
    public void setfNumber(String fNumber) {
        UpdateFlightDetails.fNumber = fNumber;
    }
    public static String getFrom() {
        return from;
    }
   
    public void setFrom(String from) {
        UpdateFlightDetails.from = from;
    }

   
    public static String getdTime() {
        return dTime;
    }
   
    public void setdTime(String dTime) {
        UpdateFlightDetails.dTime = dTime;
    }
   
    public static String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        UpdateFlightDetails.aTime  = aTime;
    }
   
    public static String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        UpdateFlightDetails.destination = destination;
    }


    public static String getFlightCost() {
        return flightCost;
    }

   
    public void setFlightCost(String flightCost) {
        UpdateFlightDetails.flightCost = flightCost;
    }
}
