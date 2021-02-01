package com.monsss.javagrammar;

public class LockTest {
    public static void main(String[] args) {

    }

    synchronized void test() throws InterruptedException {
        Thread.sleep(10);
    }
}
