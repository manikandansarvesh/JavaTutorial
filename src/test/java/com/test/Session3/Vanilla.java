package com.test.Session3;


interface Icecream {
    public void arun(); // interface method (does not have a body)
    public void amul(); // interface method (does not have a body)
}
class StrawBerry implements Icecream {

    @Override
    public void arun() {
        System.out.println("*****Arun Icecream is Delicious");

    }

    @Override
    public void amul() {

    }
}



public class Vanilla {
    public static void main(String[] args) {
        StrawBerry strawBerry=new StrawBerry();
        strawBerry.arun();

    }


}

