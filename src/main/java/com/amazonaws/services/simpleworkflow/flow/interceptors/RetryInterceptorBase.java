package com.amazonaws.services.simpleworkflow.flow.interceptors;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;


@SuppressWarnings("rawtypes")
public abstract class RetryInterceptorBase implements RetryInterceptor {
    protected final DecisionContextProvider contextProvider = new DecisionContextProviderImpl();
    protected final RetryCallable retryCallable;
    protected final RetryPolicy retryPolicy;
    
    public RetryInterceptorBase(RetryCallable retryCallable, RetryPolicy retryPolicy) {
        this.retryCallable = retryCallable;
        this.retryPolicy = retryPolicy;
    }
    
    public abstract Object execute() throws Throwable;
}
