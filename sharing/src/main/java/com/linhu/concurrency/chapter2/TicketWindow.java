package com.linhu.concurrency.chapter2;

public class TicketWindow implements Runnable {
    private final int Max = 50;

    private static int index = 1;

    private String name;

    public TicketWindow() {
    }

    public TicketWindow(String name) {
        this.name = name;
    }

    public void run() {
        while (index <= Max){
            System.out.println("柜台号："+name+"当前的剽号是"+index++);
        }
    }
}
