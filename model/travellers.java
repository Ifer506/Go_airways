package model;

public class travellers {
    private static String travel;

    public travellers(String travel){
        travellers.travel = travel;
    }
    public void setTravellers(String travel){
        travellers.travel = travel;

    }
    public static String getTravel() {
        return travel;
    }
}
