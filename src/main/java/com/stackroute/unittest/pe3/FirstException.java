package com.company;


/**TCreate a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

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
