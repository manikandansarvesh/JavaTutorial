package com.test;



interface Formula{
    double calculate(int a);


    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class Java8Example implements Formula {
    public static void main(String[] args) {
        Formula formula=new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };

        System.out.println(formula.calculate(100));



    }


    @Override
    public double calculate(int a) {
        return 0;
    }

    @Override
    public double sqrt(int a) {
        return 0;
    }
}
