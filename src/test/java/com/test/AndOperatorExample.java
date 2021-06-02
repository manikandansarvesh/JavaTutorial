package com.test;

import java.util.Map;
import java.util.HashMap;

public class AndOperatorExample{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false

        Map map =new HashMap();
        map.put("Saranaya",1234);
        map.put("Raj",4567);
        map.put("Rajesh",8901);


    }
}
