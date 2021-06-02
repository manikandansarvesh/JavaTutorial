package com.test.session4.oops;


class Cycle { //Parent Base or Super

    public String cycleName="Hercules";

    void display() { //Same method name with Same method Signature
        System.out.println("The Parent class is Cycle");
    }
}
   //Child Derived or Sub class
    class Bicycle extends Cycle{


        void display() {
            super.display();
            System.out.println("The cycle name is "+super.cycleName);
            System.out.println("The child  class is BiCycle");


        }
}

public class OverridingExample {
    public static void main(String[] args) {

       Bicycle bicycle= new Bicycle();
        bicycle.display();

        System.out.println("The Cycle object is "+(bicycle instanceof Cycle));


    }




}
