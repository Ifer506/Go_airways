package model;

public class AddUserDetails {
    private static String fName;
    private static String lName, uName, eMail, pNumber, password, cPassword;
    public static String admin;

    public AddUserDetails(){

    }

    public AddUserDetails(String fName,String lName ,String uName,String eMail,String pNumber, String password, String cPassword, String admin){
        AddUserDetails.fName = fName;
        AddUserDetails.lName = lName;
        AddUserDetails.uName  = uName;
        AddUserDetails.eMail = eMail;
        AddUserDetails.pNumber = pNumber;
        AddUserDetails.password = password;
        AddUserDetails.cPassword = cPassword;
        AddUserDetails.admin = admin;
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

   
    public void setPassword(String password) {
        AddUserDetails.password = password;
    }
    
    public static String getCPassword() {
        return cPassword;
    }

   
    public void setCPassword(String cPassword) {
        AddUserDetails.cPassword = cPassword;
    }
    
    public static String getPassword() {
        return password;
    }

   
    public void setpNumber(String pNumber) {
        AddUserDetails.pNumber = pNumber;
    }
    public static String getAdmin() {
        return admin;
    }

   
    public void setAdmin(String admin) {
        AddUserDetails.admin = admin;
    }
    }

