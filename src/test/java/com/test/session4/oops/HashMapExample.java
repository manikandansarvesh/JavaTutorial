package com.test.session4.oops;

import java.util.*;

public class HashMapExample {



        public static void main(String[] args) {

            Map< Integer, String> hashMap = new TreeMap<>();

            hashMap.put(5015,"vignesh");
            hashMap.put(4536,"hariharan ");
            hashMap.put(1234,"indu");
            hashMap.put(5011,"nithi");
            hashMap.put(4536,"hariharan");
            hashMap.put(5011,"Nithyanandam");
// hashMap.put(null,"Indumathi");
// hashMap.put(null,"null");
            System.out.println(hashMap.entrySet());
            System.out.println(hashMap.size());
            System.out.println(hashMap.get(5015));
            System.out.println(hashMap.containsValue("indu"));
            System.out.println(hashMap.keySet());
            Collection hashMapValues=hashMap.values();
            System.out.println(hashMapValues);


        }
    }


