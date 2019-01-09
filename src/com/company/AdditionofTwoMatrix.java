package com.company;

import java.util.Scanner;

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

    public static boolean comparematrix(int a[][],int b[][],int row,int col)
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

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int first[][]=new int[row][col];
        int second[][]=new int[row][col];
        int result[][]=new int[row][col];

        System.out.println("enter the values of 1st matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the values of 2nd matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
        AdditionofTwoMatrix aa =new AdditionofTwoMatrix();
        result=aa.addTwoMatrix(first,second,row,col);


    }
}
