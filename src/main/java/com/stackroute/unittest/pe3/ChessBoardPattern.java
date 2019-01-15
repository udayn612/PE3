package com.company;

import java.util.ArrayList;
import java.util.List;

/**Write a program to create a ChessBoard pattern with the help of multidimensional array,
 * where WWrepresents white color and BB represents Black color.
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

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
                    } else {
                        st += "BB";
                        st += "|";
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
                    } else {
                        st += "WW";
                        st += "|";
                    }

                }
                arr[i] = st;
                str=str+st;
                str=str+"\n";
                st = "";
            }

        }
        return str;
    }

}


