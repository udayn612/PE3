package com.company;

import java.util.Arrays;
import java.util.Scanner;

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


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        ConsecutiveCheck obj =new ConsecutiveCheck();
        System.out.println(obj.checkConsecutive(input));
    }
}
