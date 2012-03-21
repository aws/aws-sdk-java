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

import java.util.Collection;
import java.util.Date;

import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.common.FlowDefaults;

public class ExponentialRetryPolicy extends RetryPolicyBase {

    private final long initialRetryIntervalSeconds;
    private long maximumRetryIntervalSeconds = FlowDefaults.EXPONENTIAL_RETRY_MAXIMUM_RETRY_INTERVAL_SECONDS;
    private long retryExpirationIntervalSeconds = FlowDefaults.EXPONENTIAL_RETRY_RETRY_EXPIRATION_SECONDS;
    private double backoffCoefficient = FlowDefaults.EXPONENTIAL_RETRY_BACKOFF_COEFFICIENT;
    private int maximumAttempts = FlowDefaults.EXPONENTIAL_RETRY_MAXIMUM_ATTEMPTS;
    
    public ExponentialRetryPolicy(long initialRetryIntervalSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
    }
    
    public long getInitialRetryIntervalSeconds() {
        return initialRetryIntervalSeconds;
    }

    public long getMaximumRetryIntervalSeconds() {
        return maximumRetryIntervalSeconds;
    }
    
    public void setMaximumRetryIntervalSeconds(long maximumRetryIntervalSeconds) {
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
    }
    
    public ExponentialRetryPolicy withMaximumRetryIntervalSeconds(long maximumRetryIntervalSeconds) {
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
        return this;
    }

    public long getRetryExpirationIntervalSeconds() {
        return retryExpirationIntervalSeconds;
    }
    
    public void setRetryExpirationIntervalSeconds(long retryExpirationIntervalSeconds) {
        this.retryExpirationIntervalSeconds = retryExpirationIntervalSeconds;
    }
    
    public ExponentialRetryPolicy withRetryExpirationIntervalSeconds(long retryExpirationIntervalSeconds) {
        this.retryExpirationIntervalSeconds = retryExpirationIntervalSeconds;
        return this;
    }

    public double getBackoffCoefficient() {
        return backoffCoefficient;
    }
    
    public void setBackoffCoefficient(double backoffCoefficient) {
        this.backoffCoefficient = backoffCoefficient;
    }
    
    public ExponentialRetryPolicy withBackoffCoefficient(double backoffCoefficient) {
        this.backoffCoefficient = backoffCoefficient;
        return this;
    }

    public int getMaximumAttempts() {
        return maximumAttempts;
    }
    
    public void setMaximumAttempts(int maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
    }
    
    public ExponentialRetryPolicy withMaximumAttempts(int maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
        return this;
    }
    
    @Override
    public ExponentialRetryPolicy withExceptionsToRetry(Collection<Class<? extends Throwable>> exceptionsToRetry) {
        super.withExceptionsToRetry(exceptionsToRetry);
        return this;
    }
    
    @Override
    public ExponentialRetryPolicy withExceptionsToExclude(Collection<Class<? extends Throwable>> exceptionsToRetry) {
        super.withExceptionsToExclude(exceptionsToRetry);
        return this;
    }

    @Override
    public long nextRetryDelaySeconds(Date firstAttempt, Date recordedFailure, int numberOfTries) {
        
        if (numberOfTries < 2) {
            throw new IllegalArgumentException("attempt is less then 2: " + numberOfTries);
        }
        
        if (maximumAttempts > FlowConstants.NONE && numberOfTries > maximumAttempts) {
            return -1;
        }
        
        long result = (long) (initialRetryIntervalSeconds * Math.pow(backoffCoefficient, numberOfTries - 2));
        result = maximumRetryIntervalSeconds > FlowConstants.NONE ? Math.min(result, maximumRetryIntervalSeconds) : result;
        int secondsSinceFirstAttempt = (int) ((recordedFailure.getTime() - firstAttempt.getTime()) / 1000);
        if (retryExpirationIntervalSeconds > FlowConstants.NONE && secondsSinceFirstAttempt + result >= retryExpirationIntervalSeconds) {
            return -1;
        }
        
        return result;
    }

    /**
     * Performs the following three validation checks for ExponentialRetry Policy:
     * 1) initialRetryIntervalSeconds is not greater than maximumRetryIntervalSeconds
     * 2) initialRetryIntervalSeconds is not greater than retryExpirationIntervalSeconds
     */
    public void validate() throws IllegalStateException {
        if (maximumRetryIntervalSeconds > FlowConstants.NONE && initialRetryIntervalSeconds > maximumRetryIntervalSeconds) {
            throw new IllegalStateException("ExponentialRetryPolicy requires maximumRetryIntervalSeconds to have a value larger than initialRetryIntervalSeconds.");
        }
        
        if (retryExpirationIntervalSeconds > FlowConstants.NONE && initialRetryIntervalSeconds > retryExpirationIntervalSeconds) {
            throw new IllegalStateException("ExponentialRetryPolicy requires retryExpirationIntervalSeconds to have a value larger than initialRetryIntervalSeconds.");
        }
    }
}
