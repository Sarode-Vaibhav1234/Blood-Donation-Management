/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.util.Random;

/**
 *
 * @author ASHISH
 */
public class RandomNumGen {
    public String getRandomNum(int L,int H)
    {
        Random r=new Random();
        int re=r.nextInt(H-L)+L;
        String ran_num=Integer.toString(re);
        return(ran_num);
    }
}
