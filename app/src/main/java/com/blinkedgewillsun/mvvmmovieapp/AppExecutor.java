package com.blinkedgewillsun.mvvmmovieapp;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class AppExecutor {
    private static AppExecutor INSTANCE;
    public static AppExecutor getInstance()
    {
        if (INSTANCE==null)
        {
            INSTANCE = new AppExecutor();
        }
        return INSTANCE;
    }
    private final ScheduledExecutorService networkIO = Executors.newScheduledThreadPool(3);

    public ScheduledExecutorService getNetworkIO() {
        return networkIO;
    }
}
