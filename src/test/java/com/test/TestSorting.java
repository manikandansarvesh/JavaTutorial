package com.test;

import java.math.BigDecimal;
import java.util.*;

public class TestSorting {
    public static void main(String[] args) {
        List<Testers> list =getTesters();
        System.out.println("**********************Before Sorting************************");
        for (Testers testers : list) {
            System.out.println(testers);
        }
        Collections.sort(list, new Comparator<Testers>() {
            @Override
            public int compare(Testers o1, Testers o2) {
                return o1.getSalary().compareTo( o2.getSalary());
            }
        });

        //using lambda !
              //  list.sort((Testers o1, Testers o2)->o1.getAge()-o2.getAge());
       // list.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
       // list.sort((o1,o2)->o1.getSalary().compareTo( o2.getSalary()));


        System.out.println("***************Java 8 Example Sorting*******************");
        list.forEach((tester)->System.out.println(tester));

    }




    private static List<Testers> getTesters() {

        List<Testers> result = new ArrayList<Testers>();

        result.add(new Testers("Manikandan", new BigDecimal("70000"), 29));
        result.add(new Testers("Swathi", new BigDecimal("60000"), 26));
        result.add(new Testers("Sarvesh", new BigDecimal("10000"), 1));
        result.add(new Testers("Raj", new BigDecimal("100000"), 55));

        return result;

    }

}

