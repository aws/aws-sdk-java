/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.test.retry;

import com.amazonaws.util.ValidationUtils;

import java.util.concurrent.Callable;

/**
 * Utility to repeatedly invoke an action that returns a result until it succeeds or the max allowed
 * attempts is reached. All Exceptions except for those wrapped in {@link NonRetryableException} are
 * retried. Only errors wrapped in {@link RetryableError} are retried.
 */
public class RetryableAction<T> {

    private final Callable<T> delegate;
    private final RetryableParams params;

    private RetryableAction(Callable<T> delegate, RetryableParams params) {
        this.delegate = delegate;
        this.params = params;
    }

    private T call() throws Exception {
        return call(params.getMaxAttempts());
    }

    private T call(final int remainingAttempts) throws Exception {
        try {
            // Don't delay before the first attempt
            if (params.getMaxAttempts() != remainingAttempts) {
                delay();
            }
            return delegate.call();
        } catch (RetryableError e) {
            if (shouldNotRetry(remainingAttempts - 1)) {
                throw e.getCause();
            }
            return call(remainingAttempts - 1);
        } catch (NonRetryableException e) {
            throw e.getCause();
        } catch (Exception e) {
            if (shouldNotRetry(remainingAttempts - 1)) {
                throw e;
            }
            return call(remainingAttempts - 1);
        }
    }

    private boolean shouldNotRetry(int remainingAttempts) {
        return remainingAttempts <= 0;
    }

    private void delay() throws InterruptedException {
        if (params.getDelayInMs() > 0) {
            Thread.sleep(params.getDelayInMs());
        }
    }

    /**
     * Static method to repeatedly call action until it succeeds or the max allowed attempts is
     * reached.
     *
     * @param callable Callable implementing assertion logic
     * @param params   Retry related parameters
     * @return Successful result
     */
    public static <T> T doRetryableAction(Callable<T> callable, RetryableParams params) throws
                                                                                        Exception {
        ValidationUtils.assertIsPositive(params.getMaxAttempts(), "maxAttempts");
        return new RetryableAction<T>(callable, params).call();
    }
}
