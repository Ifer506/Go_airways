package model;

public class searchDetails {
    private static String from0;
    private static String to0;
    private static String ddate;
    private static String adate;
    private static String nationality;

    public searchDetails(){
    }

    public searchDetails(String from0,String to0 ,String ddate,String adate,String nationality){
        searchDetails.from0 = from0;
        searchDetails.to0 = to0;
        searchDetails.ddate  = ddate;
        searchDetails.adate = adate;
        searchDetails.nationality = nationality;
    }

    public static String getFrom0() {
        return from0;
    }
    public void setFrom0(String from0) {
        searchDetails.from0 = from0;
    }
    public static String getTo0() {
        return to0;
    }
    public void setTo0(String to0) {
        searchDetails.to0 = to0;
    }

   
    public static String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        searchDetails.ddate = ddate;
    }
   
    public static String getAdate() {
        return adate;
    }

    public void setAdate(String adate) {
        searchDetails.adate = adate;
    }

  
    public static String getNationality() {
        return nationality;
    }

   
    public void setNationality(String nationality) {
        searchDetails.nationality = nationality;
    }
}
