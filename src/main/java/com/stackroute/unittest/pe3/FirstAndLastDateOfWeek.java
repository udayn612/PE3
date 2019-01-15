package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**TWrite a java program to calculate first and last date of a week.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

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
}


