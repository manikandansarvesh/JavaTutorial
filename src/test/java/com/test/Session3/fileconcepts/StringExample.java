package com.test.Session3.fileconcepts;


import org.checkerframework.checker.regex.qual.Regex;

public class StringExample {
    public static void main(String[] args) {
        String reverse="";
        String s1="Manikandan";
        for(int i=s1.length()-1; i>=0;i--){
            reverse=reverse+s1.charAt(i);
        }
        System.out.println(reverse);

        String textValue="SCBpassword1$";
        String [] textValueArray=textValue.split("(?!$^)");
        System.out.println(textValueArray[0]);
        for(String result:textValueArray){
          //  System.out.print(result);
        }

        String txt = textValue.replace( "[+^%~()]", "{$0}");
        System.out.println(txt);

    }



}
