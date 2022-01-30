package model;

public class travellersDetails{
    private static String fullName;
    private static String nationality;

    public travellersDetails(String fullName, String nationality){
        this.fullName = fullName;
        this.nationality = nationality;
    }
    public static String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public static String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
}