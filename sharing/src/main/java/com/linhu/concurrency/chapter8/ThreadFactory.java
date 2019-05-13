package com.linhu.concurrency.chapter8;
//创建线程的工厂
@FunctionalInterface
public interface ThreadFactory {
    Thread createThread();
}
