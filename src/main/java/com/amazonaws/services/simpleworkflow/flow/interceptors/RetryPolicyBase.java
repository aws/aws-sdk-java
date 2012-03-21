/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.DecisionException;


public abstract class RetryPolicyBase implements RetryPolicy {
    
    private List<Class<? extends Throwable>> exceptionsToRetry;
    
    private List<Class<? extends Throwable>> exceptionsToExclude;
    
    public List<Class<? extends Throwable>> getExceptionsToRetry() {
        if (exceptionsToRetry == null) {
            exceptionsToRetry = new ArrayList<Class<? extends Throwable>>();
            exceptionsToRetry.add(Throwable.class);
        }
        return exceptionsToRetry;
    }

    public void setExceptionsToRetry(List<Class<? extends Throwable>> exceptionsToRetry) {
        List<Class<? extends Throwable>> exceptionsToRetryCopy = new ArrayList<Class<? extends Throwable>>();
        if (exceptionsToRetry != null) {
            exceptionsToRetryCopy.addAll(exceptionsToRetry);
        }
        
        this.exceptionsToRetry = exceptionsToRetryCopy;
    }
    
    public RetryPolicyBase withExceptionsToRetry(Collection<Class<? extends Throwable>> exceptionsToRetry) {
        List<Class<? extends Throwable>> exceptionsToRetryCopy = new ArrayList<Class<? extends Throwable>>();
        if (exceptionsToRetry != null) {
            exceptionsToRetryCopy.addAll(exceptionsToRetry);
        }
        
        this.exceptionsToRetry = exceptionsToRetryCopy;
        return this;
    }
    
    public List<Class<? extends Throwable>> getExceptionsToExclude() {
        if (exceptionsToExclude == null) {
            exceptionsToExclude = new ArrayList<Class<? extends Throwable>>();
        }
        return exceptionsToExclude;
    }
    
    public void setExceptionsToExclude(List<Class<? extends Throwable>> exceptionsToExclude) {
        List<Class<? extends Throwable>> exceptionsToExcludeCopy = new ArrayList<Class<? extends Throwable>>();
        if (exceptionsToExclude != null) {
            exceptionsToExcludeCopy.addAll(exceptionsToRetry);
        }
        
        this.exceptionsToExclude = exceptionsToExcludeCopy;
    }
    
    public RetryPolicyBase withExceptionsToExclude(Collection<Class<? extends Throwable>> exceptionsToRetry) {
        List<Class<? extends Throwable>> exceptionsToExcludeCopy = new ArrayList<Class<? extends Throwable>>();
        if (exceptionsToExclude != null) {
            exceptionsToExcludeCopy.addAll(exceptionsToRetry);
        }
        
        this.exceptionsToExclude = exceptionsToExcludeCopy;
        return this;
    }

    @Override
    public boolean isRetryable(Throwable failure) {
        boolean isRetryable = false;
        
        if (failure instanceof DecisionException && failure.getCause() != null) {
            failure = failure.getCause();
        }
        
        for (Class<? extends Throwable> exceptionToRetry: getExceptionsToRetry()) {
            if (exceptionToRetry.isAssignableFrom(failure.getClass())) {
                isRetryable = true;
                break;
            }
        }
        
        if (isRetryable) {
            for (Class<? extends Throwable> exceptionNotToRetry: getExceptionsToExclude()) {
                if (exceptionNotToRetry.isAssignableFrom(failure.getClass())) {
                    isRetryable = false;
                    break;
                }
            }
        }
        
        return isRetryable;
    }
}
