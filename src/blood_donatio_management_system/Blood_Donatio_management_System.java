/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood_donatio_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;


/**
 *
 * @author ASHISH
 */
public class Blood_Donatio_management_System 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MainFrame mf=new MainFrame();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        mf.setSize(d);
    }
    
}
