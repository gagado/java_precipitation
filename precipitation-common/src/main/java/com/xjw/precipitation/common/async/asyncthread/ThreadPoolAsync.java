package com.xjw.precipitation.common.async.asyncthread;

import java.util.concurrent.*;

/**
 * @author xue
 * @date 2023/5/31 17:54
 */
public class ThreadPoolAsync {

    /**
     * 定义线程池
     */
    private static final ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(5,
            10,
            5L,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1024),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());


    public static void processRunnable(Runnable runnable) {
        EXECUTOR.submit(runnable);
        EXECUTOR.execute(runnable);
    }

    public static String processCallable(Callable callable) {
        Future submit = EXECUTOR.submit(callable);
        try {
            Object o = submit.get();
            return o.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
