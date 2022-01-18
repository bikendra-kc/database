package controller;

import database1.DbConnection;
import model.Customer;

public class CustomerController {

    DbConnection db;

    public int registerCustomer(Customer customer){
        String query;
        query= "insert into customer(custFname, custLname,address, phoneNo,username, password) values('"+
                customer.getCustFname()+"','"+
                customer.getCustLname()+"','"+
                customer.getAddress()+"','"+
                customer.getPhoneNo()+"','"+
                customer.getUsername()+"','"+
                customer.getPassword()+"');";

        db = new DbConnection();
        return db.maniulate(query);
    }
}
