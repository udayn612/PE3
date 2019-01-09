package com.company;

import java.util.Scanner;



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

    public static void main(String[] args) {
        RemoveVowels obj=new RemoveVowels();
        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
       // System.out.println("sume"+word);
        System.out.println(obj.removeVowel(word));

    }
}
