package dbdriver;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHISH
 */
public class Cal_Difference_Between_Dates {
    public long getDateDiff(ArrayList a,String d)
    {
        long small=10000;
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy", Locale.ENGLISH); 
            Date currentdate = sdf.parse (d);
            for(int i=0;i<a.size();i++)
            {
                String temp=(String)a.get(i);               
                Date tempdate = sdf.parse(temp);
                long timeDiff = Math.abs(currentdate.getTime() - tempdate.getTime()); 
                long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit. MILLISECONDS); 
                if (daysDiff<small)
                    small=daysDiff;
                System.out.println(temp+"-"+daysDiff);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception="+e);
        }
        return small;
    }
}
