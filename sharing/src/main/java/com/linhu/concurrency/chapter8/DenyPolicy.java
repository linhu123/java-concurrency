package com.linhu.concurrency.chapter8;
@FunctionalInterface
public interface DenyPolicy {
    void reject(Runnable runnable,ThreadPool threadPool);
    //该拒绝策略会直接将任务丢弃
    class DiscardDenyPolicy implements DenyPolicy{

        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            //do nothing
        }

    }

    //该拒绝策略会向任务提交者抛出异常
    class AbortDenyPolicy implements D


}
