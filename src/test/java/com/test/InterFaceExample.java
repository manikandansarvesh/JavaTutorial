package com.test;

import java.util.*;

public class InterFaceExample {

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private int empId;
    private String empName;
    private String designation;

    public static void main(String[] args) {

        /*InterFaceExample interFaceExample=new InterFaceExample();
        interFaceExample.setEmpId(2784);
        interFaceExample.setEmpName("Manikandan");
        interFaceExample.setDesignation("Principal Software Engineer");

        System.out.println("The Employee ID is "+interFaceExample.getEmpId() +"\n" +"The Employee name is "
                +interFaceExample.getEmpName()+"\n" +"The Employee designation is "+interFaceExample.getDesignation());
*/

        List<String> list = new ArrayList(); //Dynamic Array
        list.add("Pavithra");
        list.add("Nithyananadam");
        list.add("Merlin");
        list.add("Laxman");
        list.add("Antony");
        list.add("Khizar");
        list.add("Khizar");


        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove("Antony"));
        //System.out.println(list);

        //System.out.println(list.get(5));
       // list.set(8, "Antony");
        System.out.println(list);

        System.out.println("***************Iterator Example**********");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println("*************** Enhanced For Loop  Example**********");
        for(String names :list){
            System.out.println(names );
        }
        System.out.println("*************** Java 8  Example**********");
        list.stream().forEach((khizar) -> System.out.println(khizar));

        }



    }


