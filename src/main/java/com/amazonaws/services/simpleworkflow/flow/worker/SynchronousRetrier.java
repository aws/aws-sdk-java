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
package com.amazonaws.services.simpleworkflow.flow.worker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SynchronousRetrier {
    
    private static final Log log = LogFactory.getLog(SynchronousRetrier.class);

    private final ExponentialRetryParameters retryParameters;

    private final Class<?>[] exceptionsToNotRetry;

    public SynchronousRetrier(ExponentialRetryParameters retryParameters, Class<?>... exceptionsToNotRetry) {
        if (retryParameters.getBackoffCoefficient() < 0) {
            throw new IllegalArgumentException("negative backoffCoefficient");
        }
        if (retryParameters.getInitialInterval() < 10) {
            throw new IllegalArgumentException("initialInterval cannot be less then 10: " + retryParameters.getInitialInterval());
        }
        if (retryParameters.getExpirationInterval() < retryParameters.getInitialInterval()) {
            throw new IllegalArgumentException("expirationInterval < initialInterval");
        }
        if (retryParameters.getMaximumRetries() < retryParameters.getMinimumRetries()) {
            throw new IllegalArgumentException("maximumRetries < minimumRetries");
        }
        this.retryParameters = retryParameters;
        this.exceptionsToNotRetry = exceptionsToNotRetry;
    }

    public ExponentialRetryParameters getRetryParameters() {
        return retryParameters;
    }
    
    public Class<?>[] getExceptionsToNotRetry() {
        return exceptionsToNotRetry;
    }

    public void retry(Runnable r) {
        int attempt = 0;
        long startTime = System.currentTimeMillis();
        BackoffThrottler throttler = new BackoffThrottler(retryParameters.getInitialInterval(),
                retryParameters.getMaximumRetryInterval(), retryParameters.getBackoffCoefficient());
        boolean success = false;
        do {
            try {
                attempt++;
                throttler.throttle();
                r.run();
                success = true;
                throttler.success();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            catch (RuntimeException e) {
                throttler.failure();
                for (Class<?> exceptionToNotRetry : exceptionsToNotRetry) {
                    if (exceptionToNotRetry.isAssignableFrom(e.getClass())) {
                        throw e;
                    }
                }
                long elapsed = System.currentTimeMillis() - startTime;
                if (attempt > retryParameters.getMaximumRetries()
                        || (elapsed >= retryParameters.getExpirationInterval() && attempt > retryParameters.getMinimumRetries())) {
                    throw e;
                }
                log.warn("Retrying after failure", e);
            }
        }
        while (!success);
    }

}
