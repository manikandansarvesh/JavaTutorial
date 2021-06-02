package com.test.Session3;

public class NumberFormatException {

    public static void main(String[] args) {
       try {
           String str = null;
           //int num = Integer.parseInt(str);
         //  System.out.println(num);

           String input="Maveric Systems";
           System.out.println(input.length());
           System.out.println(input.charAt(25));

       }catch (Exception e){
           System.out.println(e.getLocalizedMessage());
       }

    }
}
