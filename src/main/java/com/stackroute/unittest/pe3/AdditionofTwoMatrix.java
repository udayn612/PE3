package com.company;

import java.util.Scanner;


/** Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class AdditionofTwoMatrix {


    public int[][] addTwoMatrix(int a[][],int b[][],int row,int col)
    {
        int res[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }

    public static boolean compareMatrix(int a[][],int b[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
