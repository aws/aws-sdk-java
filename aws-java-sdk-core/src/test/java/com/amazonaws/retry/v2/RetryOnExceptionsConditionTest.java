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

import com.amazonaws.SdkBaseException;
import com.amazonaws.SdkClientException;

import org.junit.Test;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RetryOnExceptionsConditionTest {

    private RetryCondition condition = new RetryOnExceptionsCondition(Arrays.asList(
            RetryableServiceException.class,
            RetryableClientException.class,
            SocketTimeoutException.class
    ));

    @Test
    public void noExceptionInContext_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(null)));
    }

    @Test
    public void retryableServiceException_ReturnsTrue() {
        assertTrue(condition.shouldRetry(RetryPolicyContexts.withException(new RetryableServiceException())));
    }

    @Test
    public void nonRetryableServiceException_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(new NonRetryableServiceException())));
    }

    @Test
    public void retryableClientException_ReturnsTrue() {
        assertTrue(condition.shouldRetry(RetryPolicyContexts.withException(new RetryableClientException())));
    }

    @Test
    public void nonRetryableClientException_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(new NonRetryableClientException())));
    }

    @Test
    public void retryableWrappedClientException_ReturnsTrue() {
        assertTrue(condition.shouldRetry(RetryPolicyContexts.withException(new SdkClientException(new SocketTimeoutException("foo")))));
    }

    @Test
    public void nonRetryableWrappedClientException_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(new SdkClientException(new ConnectException("foo")))));
    }

    @Test
    public void genericClientException_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(new SdkClientException("foo"))));
    }

    @Test
    public void genericBaseException_ReturnsFalse() {
        assertFalse(condition.shouldRetry(RetryPolicyContexts.withException(new SdkBaseException("foo"))));
    }

    @Test
    public void noRetryableExceptions_ReturnsFalse() {
        final RetryCondition noExceptionsCondition = new RetryOnExceptionsCondition(
                Collections.<Class<? extends Exception>>emptyList());
        assertFalse(noExceptionsCondition.shouldRetry(RetryPolicyContexts.withException(new RetryableServiceException())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullList_ThrowsException() {
        new RetryOnExceptionsCondition(null);
    }

    private static class RetryableServiceException extends SdkBaseException {
        public RetryableServiceException() {
            super("My service exception");
        }
    }

    private static class NonRetryableServiceException extends SdkBaseException {
        public NonRetryableServiceException() {
            super("My service exception");
        }
    }

    private static class RetryableClientException extends SdkClientException {
        public RetryableClientException() {
            super("My client exception");
        }
    }

    private class NonRetryableClientException extends SdkClientException {
        public NonRetryableClientException() {
            super("My client exception");
        }
    }
}
