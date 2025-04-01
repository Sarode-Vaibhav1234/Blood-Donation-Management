/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASHISH
 */
public class Check_Adhar {

    public boolean isAdhar(Statement st, String ad)
    {
        boolean flag=false;
        try
        {
            String qu="select * from donor_info where Adhar_no='"+ad+" '";
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
