/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASHISH
 */
public class Dbconnection {
    public Statement getConnection()
    {
        Statement st=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_donation","root","");
            st=con.createStatement();
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return st;
    }
}
