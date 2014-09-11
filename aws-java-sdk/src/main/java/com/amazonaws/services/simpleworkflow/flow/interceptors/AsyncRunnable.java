package com.amazonaws.services.simpleworkflow.flow.interceptors;

/**
 * Serves the same purpose as {@link Runnable}, but avoids special handling of checked exceptions.
 * 
 * @see AsyncExecutor
 */
public interface AsyncRunnable {
    
    public void run() throws Throwable;

}
