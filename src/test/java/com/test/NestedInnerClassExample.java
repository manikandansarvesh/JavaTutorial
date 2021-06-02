package com.test;


class Outer{
    public void show() {
        System.out.println("In a Outer class method");
    }
    class Inner{
        public void show() {
            System.out.println("In a nested class method");
        }
    }
}

public class NestedInnerClassExample {
    public static void main(String[] args) {
        new Outer().show();//Call the Outerclass.methodName()
        new Outer().new Inner().show();//Calling the Outerclass then Inneclass.method()

    }
}
