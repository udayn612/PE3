package com.company;

import java.util.Scanner;

/**Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents.
 * It then prompts user for the grades of each of the students and saves them in an int array called stuGrades.
 * Your program shall check that the grade is between 0 and 100 else has to trow an error message.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

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



}
