/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASHISH
 */
public class Check_Username {
public boolean isCheck_User(Statement st, String uname)
    {
        boolean flag=false;
        try
        {
            String qu="select * from registration_info where user_name='"+uname+" '";
            System.out.println("Query is:"+qu);
            ResultSet row=st.executeQuery(qu);
            if(row.next())
            {
                flag=true;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return flag;
    }
}
