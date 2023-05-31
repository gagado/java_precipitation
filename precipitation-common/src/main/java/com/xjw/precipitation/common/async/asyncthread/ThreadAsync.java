package com.xjw.precipitation.common.async.asyncthread;

/**
 * @author xue
 * @date 2023/5/31 17:24
 */
public class ThreadAsync extends Thread {

    @Override
    public void run() {
        System.out.println("Current thread name:" + Thread.currentThread().getName() + " Send email success!");
    }
}
