package com.linhu.concurrency.chapter2;

public class Bank {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow("窗口1");
        Thread t1 = new Thread(ticketWindow);
        t1.start();
        TicketWindow ticketWindow2 = new TicketWindow("窗口2");
        Thread t2 = new Thread(ticketWindow2);
        t2.start();
        TicketWindow ticketWindow3 = new TicketWindow("窗口3");
        Thread t3 = new Thread(ticketWindow3);
        t3.start();
        //there is nothong;
    }
}
