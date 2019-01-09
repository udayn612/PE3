package com.company;

import java.util.Scanner;

public class StudentMarks {


    public static void check(int noOfStudents) {
        Scanner sc = new Scanner(System.in);
        int stuGrades[] = new int[noOfStudents];
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("enter the grades of student number " + i);

            try {
                stuGrades[i] = sc.nextInt();
                if (stuGrades[i] >= 0 && stuGrades[i] <= 100) {
                    continue;
                }
                else
                {
                    throw new ArithmeticException("grades may be greater than 100 or lesser than 0");
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Please enter the grade between 0 and 100");
                break;
            }

        }
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of students");
        int noOfStudents=sc.nextInt();
        check(noOfStudents);
        }


}
