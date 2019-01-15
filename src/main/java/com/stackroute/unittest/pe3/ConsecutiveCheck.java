package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**Write a program to find out if a series of 7 digits are consecutive numbers.
 *  To make this easier, assume the digits are a string and use split()
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class ConsecutiveCheck {

    public  boolean checkConsecutive(String input)
    {
        if(input!=null && input.length()>0) {
            String[] arr = input.split(",");
            Arrays.sort(arr);
            int small = Integer.parseInt(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.println(arr[i]);
                if (Integer.parseInt(arr[i]) != small + i) {
                    return false;
                }
            }

            return true;
        }
        return false;

    }
}
