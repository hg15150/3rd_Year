package com.morgan.stanley;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static int getNumber(char a){
        return (Character.getNumericValue(a) - 9);
    }

    private static boolean sCheck(char a){
        return getNumber(a)%2 != 0;
    }

    static String encode(String m, int s){
        char set[] = m.toCharArray();

        for (int i = 0; i < set.length; i++){
            System.out.print("set[" + i + "] = " + set[i]);
            set[i] += String.valueOf(set[i] + s);
            System.out.println(" => " + set[i]);
            if (sCheck(set[i])) s++;
            else s--;
        }

        String mem = new String();

        m = set.toString();


        return m;
    }

    public static void main(String[] args) {

        String s = "hello";
        System.out.println(encode(s, 5));
    }
}
