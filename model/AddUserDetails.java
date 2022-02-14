package model;

public class AddUserDetails {
    private static String fName, lName, uName, eMail, pNumber;

    public AddUserDetails(){

    }

    public AddUserDetails(String fName,String lName ,String uName,String eMail,String pNumber){
        AddUserDetails.fName = fName;
        AddUserDetails.lName = lName;
        AddUserDetails.uName  = uName;
        AddUserDetails.eMail = eMail;
        AddUserDetails.pNumber = pNumber;
    }
    public static String getfName() {
        return fName;
    }

   
    public void setfName(String fName) {
        AddUserDetails.fName = fName;
    }

   
    public static String getlName() {
        return lName;
    }

   
    public void setlName(String lName) {
        AddUserDetails.lName = lName;
    }

   
    public static String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        AddUserDetails.uName  = uName;
    }
   
    public static String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        AddUserDetails.eMail = eMail;
    }


    public static String getpNumber() {
        return pNumber;
    }

   
    public void setpNumber(String pNumber) {
        AddUserDetails.pNumber = pNumber;
    }
}
