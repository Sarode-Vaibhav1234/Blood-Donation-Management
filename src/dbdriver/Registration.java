/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;

/**
 *
 * @author ASHISH
 */
public class Registration {
    public boolean isInsert(Statement st, String name, String email, String mobile, String address, String uname, String pass)
    {
        boolean flag=false;
        try 
        {
            String qu="insert into registration_info values ('"+name+"','"+email+"','"+mobile+"','"+address+"','"+uname+"','"+pass+"')";
            int x=st.executeUpdate(qu);
            if(x>0)
                flag=true;
            else
                flag=false;
        }   
            
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return flag;
    }

}
