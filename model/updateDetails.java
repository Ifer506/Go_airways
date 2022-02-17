package model;

public class updateDetails{
    private static String fn;
    private static String dt;
    private static String at;
    private static String d;

    public updateDetails(String fn, String dt, String at, String d){
        updateDetails.fn = fn;
        updateDetails.dt = dt;
        updateDetails.at = at;
        updateDetails.d = d;
    }
    public static String getfn(){
        return fn;
    }
    public void setfn(String fn){
        updateDetails.fn = fn;
    }
    public static String getdt(){
        return dt;
    }
    public void setdt(String dt){
        updateDetails.dt = dt;
    }
    public static String getat(){
        return at;
    }
    public void setat(String at){
        updateDetails.at = at;
    }
    public static String getd(){
        return d;
    }
    public void setd(String d){
        updateDetails.d = d;
    }
}