package com.test;

public class BreakExample {

    public static void main(String[] args)
    {
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 9)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }
}

