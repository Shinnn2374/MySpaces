package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
// First task
//        System.out.println("Начало выполнения программы");
//        Thread newThread = new Thread(new MyThread());
//        System.out.println("Запуск дочернего потока");
//        newThread.start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Главный поток");
//            try {
//                Thread.sleep(1200);
//            }catch (InterruptedException e){
//                System.out.println("Прерывание главного потока");
//            }
//        }
//        System.out.println("Программа выполнена");
//   _______________________________________________
// second task
            Thread t = new Thread(new Runnable(){
                public void run(){
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Дочерний поток");
                        try {
                            Thread.sleep(1200);
                        }catch (InterruptedException e){
                            System.out.println("Прерывание дочернего потока");
                        }
                    }
                }
            });
        System.out.println("Запускается дочерний поток");
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Главный поток");
            Thread.sleep(1200);
        }
        if (t.isAlive()) {
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}