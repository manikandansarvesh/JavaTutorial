package com.test.session4.oops;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String > hashMap=new TreeMap<>();
        hashMap.put(2784,"Manikandan");
        hashMap.put(5008,"Laxman");
        hashMap.put(5011,"Nithyanandam");
        hashMap.put(5012,"Pavithra");
        hashMap.put(5009,"Merlin");
        hashMap.put(5011,"Nithyanandam");
       // hashMap.put("","")
       // hashMap.put(null,"Antony");
       // hashMap.put(null,"Indumathi");
     //   hashMap.put(null,"null");

        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(5012));
        System.out.println(hashMap.containsValue("Laxman"));
        System.out.println(hashMap.keySet());
        Collection hashMapValues=hashMap.values();
        System.out.println(hashMapValues);
    }
}
