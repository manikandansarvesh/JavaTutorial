package com.test;

public class ForLoopExample {

        public static void main(String[] args) {

            /*

            for(initialization;condition;incr/decr){
//code to be executed
}
             */
            for(int i=1;i<=7;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("#");
                }
                System.out.println();//new line
            }
        }
    }

