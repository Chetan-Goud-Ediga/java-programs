package com.interview.questions;

import java.util.*;

class CapitaliseFirstLetterInWord {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitaliseBasic(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitaliseBasic(String str) {
        String s[] = str.split(" ");
        int size = s.length;
        String s2 = "";
        for(int i=0;i<size;i++){
            StringBuffer sb = new StringBuffer(s[i]);
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
            s2 = s2+sb.toString()+" ";
        }return s2.trim();

    }
}