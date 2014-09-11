package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.concurrent.Executor;

/**
 * Serves the same purpose as {@link Executor}, but in asynchronous world. The
 * difference from {@link Executor} is that checked exceptions are not treated
 * differently then runtime ones.
 */
public interface AsyncExecutor {

    public void execute(AsyncRunnable command) throws Throwable;

}
