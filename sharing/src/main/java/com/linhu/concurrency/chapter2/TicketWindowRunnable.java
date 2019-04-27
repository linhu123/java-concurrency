package com.linhu.concurrency.chapter2;

public class TicketWindowRunnable implements Runnable {
    private static int Max = 50;

    private int index = 1;

    public void run() {
        while (index <= Max){
            System.out.println(Thread.currentThread()+"的票号是：=="+index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
