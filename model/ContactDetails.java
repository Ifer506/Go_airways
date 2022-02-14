package model;

public class ContactDetails {
    private static String FirstName;
    private static String LastName;
    private static String Nationality;
    private static String ContactNo;
    private static String EMail;

    public ContactDetails(){
    }

    public ContactDetails(String FirstName,String LastName ,String Nationality,String ContactNo,String EMail){
        ContactDetails.FirstName = FirstName;
        ContactDetails.LastName = LastName;
        ContactDetails.Nationality  = Nationality;
        ContactDetails.ContactNo = ContactNo;
        ContactDetails.EMail = EMail;
    }

    public static String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        ContactDetails.FirstName = FirstName;
    }
    public static String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        ContactDetails.LastName = LastName;
    }

   
    public static String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        ContactDetails.ContactNo = ContactNo;
    }
   
    public static String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        ContactDetails.EMail = EMail;
    }

  
    public static String getNationality() {
        return Nationality;
    }

   
    public void setNationality(String Nationality) {
        ContactDetails.Nationality = Nationality;
    }
}
