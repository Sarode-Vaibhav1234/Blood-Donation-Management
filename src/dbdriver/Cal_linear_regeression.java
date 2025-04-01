package dbdriver;


import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author ASHISH
 */
public class Cal_linear_regeression {
    public double getLinearRegeressionFactor(ArrayList x,ArrayList y,double bmi)
    {
        double xa=0.0,sx=0.0,sx2=0.0,sxy=0,m=0.0,b;
        int ya=0,sy=0,n=x.size();
        for(int i=0;i<x.size();i++)
        {
            xa=(double)x.get(i);
            ya=(int)y.get(i);
            double x2=xa*xa;
            double xy=(double)xa*ya;
            sx=sx+xa;
            sy=sy+ya;
            sx2=sx2+x2;
            sxy=sxy+xy;
        }
        double ne=(double)((n*sxy)-(sx*sy));
        double de=(double)((n*sx2)-(sx*sx));
        m=ne/de;
        m=Double.parseDouble(new DecimalFormat("##.##").format(m));
        b=(sy-(m*sx))/n;
        b=Double.parseDouble(new DecimalFormat("##.##").format(b));
        double yy=(m*bmi)+b;
        yy=Double.parseDouble(new DecimalFormat("##.##").format(yy));
       return(yy);
    }
    
}
