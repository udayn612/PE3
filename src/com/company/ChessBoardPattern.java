package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChessBoardPattern {

    public String chessBoardPattern() {

        String[] arr = new String[8];
        String st = "";
        String str="";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        st += "WW";
                        st += "|";
//                        System.out.print("WW");
//                        System.out.print("|");
                    } else {
                        st += "BB";
                        st += "|";
//                        System.out.print("BB");
//                        System.out.print("|");
                    }

                }
                arr[i] = st;
                str=str+st;
                str=str+"\n";
                st = "";
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        st += "BB";
                        st += "|";
//                        System.out.print("BB");
//                        System.out.print("|");
                    } else {
                        st += "WW";
                        st += "|";
//                        System.out.print("WW");
//                        System.out.print("|");
                    }

                }
                arr[i] = st;
                str=str+st;
                str=str+"\n";
                st = "";
//                System.out.println();
            }


        }
        return str;
    }

    public static void main(String[] args) {
        String str;
        ChessBoardPattern obj = new ChessBoardPattern();
        str = obj.chessBoardPattern();
        System.out.println(str);
    }
}


