package model;

public class register_guiDetails {
    private static String fName;
    private static String lName;
    private static String userName;
    private static String eMail;
    private static String pNumber;
    private static String password;
    private static String cPassword;
    private static String gender;
    private static String date;

    public register_guiDetails(){

    }

    public register_guiDetails(String fName,String lName ,String userName,String eMail,String pNumber, String password, String cPassword, String gender, String date){
        register_guiDetails.fName = fName;
        register_guiDetails.lName = lName;
        register_guiDetails.userName  = userName;
        register_guiDetails.eMail = eMail;
        register_guiDetails.pNumber = pNumber;
        register_guiDetails.password = password;
        register_guiDetails.cPassword = cPassword;
        register_guiDetails.gender = gender;
        register_guiDetails.date = date;
    }
    public static String getFName() {
        return fName;
    }

   
    public void setFName(String fName) {
        register_guiDetails.fName = fName;
    }

   
    public static String getLName() {
        return lName;
    }

   
    public void setLName(String lName) {
        register_guiDetails.lName = lName;
    }

   
    public static String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        register_guiDetails.userName = userName;
    }
   
    public static String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        register_guiDetails.eMail = eMail;
    }

  
    public static String getPNumber() {
        return pNumber;
    }

   
    public void setPNumber(String pNumber) {
        register_guiDetails.pNumber = pNumber;
    }
      
    public static String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        register_guiDetails.password = password;
    }
      
    public static String getCPassword() {
        return cPassword;
    }

   
    public void setCPassword(String cPassword) {
        register_guiDetails.cPassword = cPassword;
    }
      
    public static String getGender() {
        return gender;
    }

   
    public void setGender(String gender) {
        register_guiDetails.gender = gender;
    }
      
    public static String getDate() {
        return date;
    }

   
    public void setDate(String date) {
        register_guiDetails.date = date;
    }
}
