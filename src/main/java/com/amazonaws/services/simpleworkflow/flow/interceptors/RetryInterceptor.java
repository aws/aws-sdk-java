package com.amazonaws.services.simpleworkflow.flow.interceptors;


public interface RetryInterceptor {
    public Object execute() throws Throwable;
}
