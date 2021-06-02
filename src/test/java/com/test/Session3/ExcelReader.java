package com.test.Session3;

import java.util.Calendar;
import java.util.Date;

public class ExcelReader {
    public static void main(String[] args) {
      //  Date date = new Date();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Calendar prevYear = Calendar.getInstance();
        prevYear.add(Calendar.YEAR, -10);
        System.out.println( prevYear.get(Calendar.YEAR));
        System.out.println("Year for date object is :"+ year);
    }
}
