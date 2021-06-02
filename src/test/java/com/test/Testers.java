package com.test;

import java.math.BigDecimal;

public class Testers {

    public Testers(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Testers{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String name;
    public BigDecimal salary;
    public int age;



}
