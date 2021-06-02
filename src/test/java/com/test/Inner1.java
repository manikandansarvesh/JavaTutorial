package com.test;

class Outer1 {
    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }
    public static class Inner1 {
        public static void main(String[] args) {
            System.out.println("inside inner class Method");
            outerMethod();
        }

    }
}
