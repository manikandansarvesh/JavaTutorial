package com.test.Session3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {


        String text = "geeks1for2geekgs3";  // geeks for geeks.

        // Specifies the string pattern which is to be searched
        String delimiter = "\\D";
        Pattern pattern = Pattern.compile("ge");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start() + "_____________" + matcher.group());

        }


    }
}


   /* // Used to perform case insensitive search of the string
    String[] result = pattern.split(text);


        for (String temp: result)
            System.out.println(temp);*/



