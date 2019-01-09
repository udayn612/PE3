package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDateOfWeek {

    public  String firstDateofWeek()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        return df.format(c.getTime());

    }

    public  String lastDateofWeek()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        return df.format(c.getTime());

    }

    public static void main(String []args){

        FirstAndLastDateOfWeek firstAndLastDateOfWeek =new FirstAndLastDateOfWeek();
        System.out.println("First "+firstAndLastDateOfWeek.firstDateofWeek());
        System.out.println("Last "+firstAndLastDateOfWeek.lastDateofWeek());
    }
}


