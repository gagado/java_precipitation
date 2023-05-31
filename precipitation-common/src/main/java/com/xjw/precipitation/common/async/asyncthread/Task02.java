package com.xjw.precipitation.common.async.asyncthread;

import java.util.concurrent.Callable;

/**
 * @author xue
 * @date 2023/5/31 17:42
 */
public class Task02 implements Callable<String> {

    @Override
    public String call() {
        System.out.println("实现Callable的任务");
        return "实现Callable的任务,返回字符串";
    }
}
