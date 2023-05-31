package com.xjw.precipitation.common.async;

import com.xjw.precipitation.common.async.asyncthread.Task01;
import com.xjw.precipitation.common.async.asyncthread.Task02;
import com.xjw.precipitation.common.async.asyncthread.ThreadAsync;
import com.xjw.precipitation.common.async.asyncthread.ThreadPoolAsync;
import com.xjw.precipitation.common.async.futuretask.FutureTaskAsync;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

/**
 * @author xue
 * @date 2023/5/31 17:35
 */
public class AsyncTest {

    @Test
    public void test() {
        ThreadAsync threadAsync = new ThreadAsync();
        threadAsync.start();
    }

    @Test
    public void task01Test() {
        Thread thread = new Thread(new Task01());
        thread.start();
    }

    @Test
    public void threadPoolAsyncTest() {
        ThreadPoolAsync.processRunnable(new Task01());
        String s = ThreadPoolAsync.processCallable(new Task02());
        System.out.println(s);
    }

    @Test
    public void futureTaskAsyncTest() throws ExecutionException, InterruptedException {
        FutureTaskAsync.process();
    }
}
