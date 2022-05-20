package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myStr="   my name is mehdi   ";
        String myStr_2="my name is mamad";
        String emptyString="  ";
        System.out.println(myStr.toLowerCase(Locale.ROOT));
        System.out.println(myStr.toUpperCase(Locale.ROOT));
        System.out.println(myStr.indexOf("is"));
        System.out.println(myStr.lastIndexOf("m"));
        System.out.println(myStr+" "+myStr_2);
        System.out.println(myStr.concat(myStr_2));
        System.out.println(myStr_2.length());
        System.out.println(myStr.substring(10));
        System.out.println(myStr.contains("m"));
        System.out.println(myStr.equals(myStr_2));
        System.out.println(myStr.equalsIgnoreCase(myStr_2));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println(myStr.replace("mehdi","zahra"));
        System.out.println(myStr.trim());
    }
}
