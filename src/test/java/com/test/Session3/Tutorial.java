package com.test.Session3;

public class Tutorial {
    String name=null;
    Tutorial(String name){
     this. name=name;
    }
    public static void main(String[] args) {
        Object obj = new Tutorial("Java Quiz");
        Tutorial tutorial = (Tutorial) obj;
        System.out.println(tutorial.name);
    }
}
