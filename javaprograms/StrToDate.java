//Program 23

package com.javaprograms;

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class StrToDate 
{
    public static void main(String[] args) throws Exception
    {
        String strDate = "25/12/22";
 
        Date date = new SimpleDateFormat("dd/mm/yyyy").parse(strDate);

        System.out.print(strDate + " " + date);
    }
}
