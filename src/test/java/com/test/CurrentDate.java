package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;


public class CurrentDate {
    public static void main(String[] args) {

        Date date =new Date();
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        System.out.println(formatter.format(date));


        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.getCalendarType());

        int Mon = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.DAY_OF_YEAR);
        int ErA = calendar.get(Calendar.ERA);
        int week = calendar.get(Calendar.FEBRUARY);
        System.out.println(Mon);
        System.out.println(year);
        System.out.println(ErA);
        System.out.println(week);

        Date date1 = calendar.getTime();
        System.out.println("The Time is " + date1);
        System.out.println("The Date is " + date1.getDate());
        System.out.println("The Date is " + date1.getDay());
        System.out.println("The Date is " + date1.getHours());






    }
}
