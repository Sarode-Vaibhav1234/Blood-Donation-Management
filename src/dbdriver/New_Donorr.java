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
public class New_Donorr {
    public boolean isInsert(Statement st, String ad, String g, String he, String we, String bg, String ag,String bmi,String name,String mob,String email,String address,String DOB,String t_no,String t_status,String date_time, String B_vol)
    {
        boolean flag=false;
        try 
        {
            String qu="insert into donor_info values ('"+ad+"','"+g+"','"+he+"','"+we+"','"+bg+"','"+ag+"','"+bmi+"','"+name+"','"+mob+"','"+email+"','"+address+"','"+DOB+"','"+t_no+"','"+date_time+"','"+t_status+"','"+B_vol+"')";
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
