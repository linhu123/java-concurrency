package com.linhu.concurrency.chapter8;

//任务队列，主要用于缓存提交到线程池中的任务
public interface RunnableQueue {
    //当有新的任务进来是首先会offerd到队列中
    void offer(Runnable runnable);

    //工作线程通过take方法获取Runnable
    Runnable take();

    //获取队列中任务的数量
    int size();
}
