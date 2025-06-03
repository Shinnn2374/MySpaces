package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало выполнения программы");
        Thread newThread = new Thread(new MyThread());
        System.out.println("Запуск дочернего потока");
        newThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Главный поток");
            try {
                Thread.sleep(1200);
            }catch (InterruptedException e){
                System.out.println("Прерывание главного потока");
            }
        }
        System.out.println("Программа выполнена");
    }
}