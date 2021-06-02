package com.test.Session3;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {

        try {
            System.out.println(5 / 0);
            Thread.sleep(10000);
        } catch (ArithmeticException e) {
            System.out.println("The Exception is " + e.getMessage());
        }
    }
}
