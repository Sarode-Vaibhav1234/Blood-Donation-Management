/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ASHISH
 */
public class DateAndTime {
    public String getDate()
    {
        Calendar cal=Calendar.getInstance();
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        String d=df.format(cal.getTime());
        return d;
    }
    public String getTime()
    {
        Calendar cal=new GregorianCalendar();
        String am_pm;
        int h=cal.get(cal.HOUR);
        int m=cal.get(cal.MINUTE);
        int s=cal.get(cal.SECOND);
        if(cal.get(cal.AM_PM)==0)
            am_pm="AM";
        else
            am_pm="AM";
        String gg=h+":"+m+":"+s+" "+am_pm;
        return gg;
    }
}
