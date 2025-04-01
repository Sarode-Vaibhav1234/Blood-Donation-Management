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
public class Edit_Data {
    public boolean isUpdate(Statement st, String name, String email, String mobile, String address, String uname, String pass)
    {
        boolean flag=false;
        try 
        {
            String qu="update registration_info set user_name='"+name+"',email='"+email+"',mob='"+mobile+"',address='"+address+"',password='"+pass+"' where user_name='"+uname+"'";
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
    public boolean isDonorDetailsUpdated(Statement st,String aadhar,String token_status)
    {
        boolean flag=false;
        try
        {
            String query="update donor_info set Token_Status='"+token_status+"' where Adhar_no='"+aadhar+"'";
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
        }
        catch(Exception e)
        {
            System.out.println("Exception in Edit_Donor_Details:"+e);
        }
            
        return flag;    
    }
}
