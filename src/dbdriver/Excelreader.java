/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.io.File;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;
import jxl.Cell;

/**
 *
 * @author ASHISH
 */
public class Excelreader {
    public ArrayList getExcelData(String p)
    {
        ArrayList data=new ArrayList();
        try
        {
            Workbook readExcel = Workbook.getWorkbook(new File(p));
            Sheet sheet=readExcel.getSheet(0);
            int r=sheet.getRows();
            int c=sheet.getColumns();
            for (int i = 1; i < r; i++) 
            {
                ArrayList in=new ArrayList();
                for (int j = 0; j < c; j++) 
                {
                    Cell a1=sheet.getCell(j,i);
                    String ed=a1.getContents();
                    ed=ed.trim();
                    in.add(ed);
                }
                data.add(in);
            }
            readExcel.close();
        }
        catch(Exception e)
        {
            System.out.println("exception"+e);
        }
        return data;
    }
    
}
