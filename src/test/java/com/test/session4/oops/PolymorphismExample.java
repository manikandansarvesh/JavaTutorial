package com.test.session4.oops;

public class PolymorphismExample {

    // Two types of polymorphism

   // Method overloading and Method Overridding

    public int add(int a, int b){ //Method Name Should be the same with different arguments
        System.out.println("The value is " +(a+b));
        return a+b;
    }

    public int add(int a, int b,int c){
        System.out.println("The value is " +(a+b+c));
        return a+b+c;
    }

    public static void main(String[] args) {

        new PolymorphismExample().add(1,3);
        new PolymorphismExample().add(1,3,5);
        new PolymorphismExample().add(5,6);
    }

}
