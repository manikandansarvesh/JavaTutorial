package com.test;

import com.sun.javafx.binding.StringFormatter;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {


        String input = "This is a text String";

        String result []=input.split(" ");
        String reverseWord="";
        for(String word:result){

            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            reverseWord+=sb.toString()+" ";

        }
      //  List list=Arrays.asList(result);
     //   Collections.reverse(list);
        System.out.println(reverseWord);



    }

}
