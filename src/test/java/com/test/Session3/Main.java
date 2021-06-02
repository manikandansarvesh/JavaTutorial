package com.test.Session3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

interface Animal {

    void eat(); // abstract method
     void display();
     String name ="Pavithra";//final static
}

public class Main{
    public static void main(String[] args) {

        String [] names={"pavithra","Antony","laxman","Merlin","Dharini"};
        String [] names1={"pavithra","Antony","laxmn","Merlin","Dharini"};
        Arrays.sort(names);
       boolean result= Arrays.deepEquals(names,names1);
        System.out.println(result);

        System.out.println("The names are "+Arrays.toString(names));

       /* List list=Arrays.asList(names);
        Collections.sort(list);
        System.out.println(list)*/;




        Animal animal=new Animal() {


            public void eat() {
                System.out.println("Example for Anonmoyous inner Class");
            }

            @Override
            public void display() {
                System.out.println("Example for Display");
            }



        };animal.eat();
        animal.display();
        System.out.println(Animal.name);

    }
}
