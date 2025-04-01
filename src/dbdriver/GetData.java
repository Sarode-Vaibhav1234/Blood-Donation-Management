/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;


import java.util.ArrayList;

/**
 *
 * @author ASHISH
 */
public class GetData {
    public ArrayList getBMI(ArrayList d)
    {
        ArrayList <Double> x=new <Double> ArrayList();
        for (int i = 0; i < d.size(); i++) 
        {
            ArrayList x1=(ArrayList)d.get(i);
            String bmi=(String)x1.get(0);
            double ibmi=Double.parseDouble(bmi);
            x.add(ibmi);
        }
        return x;
    }
    public ArrayList getVol(ArrayList d)
    {
        ArrayList <Integer> y=new <Integer> ArrayList();
        for (int i = 0; i < d.size(); i++) 
        {
            ArrayList y1=(ArrayList)d.get(i);
            String Vol=(String)y1.get(1);
            int vol=Integer.parseInt(Vol);
            y.add(vol);
        }
        return y;
    }
}
