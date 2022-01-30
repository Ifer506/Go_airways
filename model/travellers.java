package model;

public class travellers {
    private static String travel;

    public travellers(String travel){
        this.travel = travel;
    }
    public void setTravellers(String travel){
        this.travel = travel;

    }
    public static String getTravel() {
        return travel;
    }
}
