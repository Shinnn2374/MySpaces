package org.example;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Дочерний поток");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
