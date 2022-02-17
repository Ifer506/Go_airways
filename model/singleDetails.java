package model;

public class singleDetails {
    private static String flightNumber;

    public singleDetails(String flightNumber){
        singleDetails.flightNumber = flightNumber;
    }
    public void setFlightNumber(String flightNumber){
        singleDetails.flightNumber = flightNumber;

    }
    public static String getFlightNumber() {
        return flightNumber;
    }
}
