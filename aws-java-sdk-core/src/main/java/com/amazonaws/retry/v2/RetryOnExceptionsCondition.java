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
package com.amazonaws.retry.v2;

import java.util.ArrayList;
import java.util.List;

import static com.amazonaws.util.ValidationUtils.assertNotNull;

/**
 * Retry condition implementation that retries if the exception or the cause of the exception matches the classes defined.
 */
public class RetryOnExceptionsCondition implements RetryCondition {

    private final List<Class<? extends Exception>> exceptionsToRetryOn;

    /**
     * @param exceptionsToRetryOn Exception classes to retry on.
     */
    public RetryOnExceptionsCondition(List<Class<? extends Exception>> exceptionsToRetryOn) {
        this.exceptionsToRetryOn = new ArrayList<Class<? extends Exception>>(
                assertNotNull(exceptionsToRetryOn, "exceptionsToRetryOn"));
    }

    /**
     * @param context Context about the state of the last request and information about the number of requests made.
     * @return True if the exception class matches one of the whitelisted exceptions or if the cause of the exception matches the
     * whitelisted exception.
     */
    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        if (context.exception() != null) {
            for (Class<? extends Exception> exceptionClass : exceptionsToRetryOn) {
                if (exceptionMatches(context, exceptionClass)) {
                    return true;
                }
                // Note that we check the wrapped exception too because for things like SocketException or IOException
                // we wrap them in an SdkClientException before throwing.
                if (wrappedCauseMatches(context, exceptionClass)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param context        Context containing exception.
     * @param exceptionClass Expected exception class.
     * @return True if the exception in the context matches the provided class.
     */
    private boolean exceptionMatches(RetryPolicyContext context, Class<? extends Exception> exceptionClass) {
        return context.exception().getClass().equals(exceptionClass);
    }

    /**
     * @param context        Context containing exception.
     * @param exceptionClass Expected exception class.
     * @return True if the cause of the exception in the context matches the provided class.
     */
    private boolean wrappedCauseMatches(RetryPolicyContext context, Class<? extends Exception> exceptionClass) {
        if (context.exception().getCause() == null) {
            return false;
        }
        return context.exception().getCause().getClass().equals(exceptionClass);
    }
}
