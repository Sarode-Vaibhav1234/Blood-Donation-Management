/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ASHISH
 */
public class Login {
    public boolean isLogin(Statement st, String uname, String pass)
    {
        boolean flag1=false;
        try
        {
            String qu="select * from registration_info where user_name='"+uname+"' && password='"+pass+"'";
            System.out.println(qu);
            ResultSet rs=st.executeQuery(qu);
            if(rs.next())
                flag1=true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return flag1;
    }
}
