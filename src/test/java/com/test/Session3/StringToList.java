package com.test.Session3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {

        String name1="Manikandan";
        String name2="swathi";
        String name3="Sarvesh";

        List<String> list=new ArrayList<String>();
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.stream().forEach(names-> System.out.println(names));

        String fullName="TDMKianjahe TDMPriebe";
        String [] CCname=fullName.split(" ");
        System.out.println(CCname[0]);

        String removeInder="+65 97113353";
        System.out.println(removeInder.substring(3).trim());

    }
}
