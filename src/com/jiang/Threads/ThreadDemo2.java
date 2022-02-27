package com.jiang.Threads;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable runnable = new RunnableTarget();
        new Thread(runnable).start();

        new Thread(()->{
        for (int i = 0; i < 200 ; i++) {
                System.out.println("线程2 "+i);
            }}).start();
    }
}


class RunnableTarget implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200 ; i++) {
            System.out.println("线程1 "+i);
        }
    }
}
