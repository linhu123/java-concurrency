package com.linhu.concurrency.chapter2;

public class BankVersion2 {
    public static void main(String[] args) {
        final TicketWindowRunnable ticket = new TicketWindowRunnable();
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
