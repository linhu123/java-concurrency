package com.linhu.concurrency.chapter1;

public class TryConcurrency {
    /*
    main函数是一个非守护的现程
     */
    public static void main(String[] args) {
       /* Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    println("Task i =>" +i);
                }
            }
        };
        t1.start();//线程如果不start 还不是线程
        for (int j = 0;j<100;j++){
            println("Task j =>" +j);
        }*/
       /* try {
            Thread.sleep(1000*300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       new Thread("readData"){
           @Override
           public void run() {
               readFromDateBase();
           }
       }.start();
       new Thread("WriteData"){
           @Override
           public void run() {
               writeDataToFile();
           }
       }.start();
    }

    private static void readFromDateBase(){
        //read data from database and handle it
        try {
            println("Begin read datebase from db.");
            Thread.sleep(1000*100L);
            println("Read data done and start handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully.");
    }
    private static void writeDataToFile(){
        try {
            println("Begin write datebase to db.");
            Thread.sleep(1000*100L);
            println("Write data done and start handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully.");
    }
    private static void println(String message){
        System.out.println(message);
    }

}
