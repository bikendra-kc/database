package controller;

import database1.DoctorConnection;
import model.Doctor;

public class DoctorController {

    DoctorConnection db;

    public int registerCustomer(Doctor doctor){
        String query;
        query= "insert into doctor(custFname, custLname,address, phone"+
                "username, password) values('"+
                doctor.getCustFname()+"','"+
                doctor.getCustLname()+"','"+
                doctor.getAddress()+"','"+
                doctor.getPhoneNo()+"','"+
                doctor.getUsername()+"','"+
                doctor.getPassword()+"');";

        db = new DoctorConnection();
        return db.maniulate(query);
    }
}
