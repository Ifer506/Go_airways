package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.ContactDetails;

public class ContactDetailsController {
    static DbConnection db;

    public static int ContactDetails(ContactDetails customer){
        String query;
        query = "insert into ContactDetails(firstName, lastName, nationality, contactNo, eMail) values('" +
         ContactDetails.getFirstName() + "','" +
         ContactDetails.getLastName() + "','" +
         ContactDetails.getNationality() + "','" +
         ContactDetails.getContactNo() + "','" +
         ContactDetails.getEMail() + "');";
    
        db = new DbConnection();
        return db.maniulate(query);
     }
    public ContactDetails AfterTicket(String FirstName, String LastName, String Nationality, String ContactNo, String EMail){
        String query;
        query = "select * from ContactDetails;";
        db = new DbConnection();
        ResultSet rs = db.retrieve(query);
        ContactDetails cd = null;
        
        try{
            while (rs.next()){
                cd = new ContactDetails();
                cd.setFirstName(rs.getString("firstName"));
                cd.setLastName(rs.getString("lastName"));
                cd.setNationality(rs.getString("nationality"));
                cd.setContactNo(rs.getString("contactNo"));
                cd.setEMail(rs.getString("eMail"));
            }
        }
        
        catch (Exception ex){
            System.out.println("Error"+ ex);
        }
        
        return cd;
        }
    
}
