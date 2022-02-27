package com.jiang.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> mycallable = new myCallable(100);
        FutureTask<String> futureTask = new FutureTask(mycallable);
        Thread thread=new Thread(futureTask);
        thread.start();
        try {
            String str= futureTask.get();
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}



class myCallable implements Callable<String>{
    private int n;
    public myCallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        return ""+n;
    }
}