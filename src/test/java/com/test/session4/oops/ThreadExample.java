package com.test.session4.oops;

import sun.awt.windows.ThemeReader;

class Test implements Runnable {
    public void run() {
        System.out.println("The thread is running");
    }

}

public class ThreadExample {
    public static void main(String[] args) {
        Test test= new Test();
        Runnable target;
        Thread thread =new Thread(test);
        thread.start();

    }

}
