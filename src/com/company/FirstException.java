package com.company;

public class FirstException {
     FirstException(String mes) {
        mes="abcdefgh";
        System.out.println(mes);
    }

    public static void main(String[] args) {
        try
        {
            throw new Exception();

        }
        catch(Exception e)
        {
            System.out.println("uday");
            //e.printStackTrace();
        }
        finally {
            System.out.println("It will get print");
        }
    }
}
