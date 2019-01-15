package com.company;

import java.util.Scanner;

/**Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */


public class RemoveVowels {

    public  String removeVowel(String word)
    {
        String result="";


        char[] chars = word.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            //System.out.println(chars[i]);
            if(chars[i]!='a'&& chars[i]!='e'&& chars[i]!='i'&& chars[i]!='o' && chars[i]!='u')
            {
              //  System.out.println(stringBuilder.charAt(i));
                result=result+chars[i];
            }
        }

    return result;
    }

}
