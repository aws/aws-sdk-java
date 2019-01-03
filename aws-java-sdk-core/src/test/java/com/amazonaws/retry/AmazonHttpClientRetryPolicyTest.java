/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.retry;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;

/**
 * Tests that {@link AmazonHttpClient#executeHelper()} method passes the correct
 * context information into the configured RetryPolicy.
 */
public class AmazonHttpClientRetryPolicyTest extends RetryPolicyTestBase {

    private static final int EXPECTED_RETRY_COUNT = 5;
    private static final int EXPECTED_SHOULD_RETRY_CALL_COUNT = EXPECTED_RETRY_COUNT + 1;
    private static final Random random = new Random();
    private AmazonHttpClient testedClient;

    /** Reset the RetryPolicy and restart collecting context data */
    @Before
    public void resetContextData() {
        retryCondition = new ContextDataCollectionRetryCondition();
        backoffStrategy = new ContextDataCollectionBackoffStrategy();
        // Reset the RetryPolicy
        clientConfiguration.setRetryPolicy(
                new RetryPolicy(retryCondition,
                                backoffStrategy,
                                EXPECTED_RETRY_COUNT, // max error retry
                                false));              // ignore the maxErrorRetry in ClientConfiguration level
        testedClient = new AmazonHttpClient(clientConfiguration);
    }
    
    /**
     * Tests AmazonHttpClient's behavior upon simulated service exceptions when the
     * request payload is repeatable.
     */
    @Test
    public void testServiceExceptionHandling() {
        int random500StatusCode = 500 + random.nextInt(100);
        String randomErrorCode = UUID.randomUUID().toString();
        
        // A mock HttpClient that always returns the specified status and error code.
        injectMockHttpClient(testedClient, new ReturnServiceErrorHttpClient(random500StatusCode, randomErrorCode));
        
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        
        Request<?> testedRepeatableRequest = getSampleRequestWithRepeatableContent(originalRequest);
        
        // It should keep retrying until it reaches the max retry limit and
        // throws the simulated ASE.
        AmazonServiceException expectedServiceException = null;
        try {
            testedClient.requestExecutionBuilder()
                    .request(testedRepeatableRequest)
                    .errorResponseHandler(errorResponseHandler)
                    .executionContext(context)
                    .execute();
            Assert.fail("AmazonServiceException is expected.");
        } catch (AmazonServiceException ase) {
            // We should see the original service exception
            Assert.assertEquals(random500StatusCode, ase.getStatusCode());
            Assert.assertEquals(randomErrorCode, ase.getErrorCode());
            expectedServiceException = ase;
        }

        // Verifies that the correct information was passed into the RetryCondition and BackoffStrategy
        verifyExpectedContextData(retryCondition,
                                  originalRequest,
                                  expectedServiceException,
                                  EXPECTED_SHOULD_RETRY_CALL_COUNT); // shouldRetry is being called again to record MaxRetriesExceeded
        verifyExpectedContextData(backoffStrategy,
                                  originalRequest,
                                  expectedServiceException,
                                  EXPECTED_RETRY_COUNT);
        
        // We also want to check the RequestCount metric is correctly captured.
        Assert.assertEquals(
                EXPECTED_RETRY_COUNT + 1, // request count = retries + 1
                context.getAwsRequestMetrics()
                        .getTimingInfo().getCounter(AWSRequestMetrics.Field.RequestCount.toString()).intValue());
    }
    
    /**
     * Tests AmazonHttpClient's behavior upon simulated IOException during
     * executing the http request when the request payload is repeatable.
     */
    @Test
    public void testIOExceptioinHandling() {
        // A mock HttpClient that always throws the specified IOException object
        IOException simulatedIOException = new IOException("fake IOException");
        injectMockHttpClient(testedClient, new ThrowingExceptionHttpClient(simulatedIOException));
        
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        
        Request<?> testedRepeatableRequest = getSampleRequestWithRepeatableContent(originalRequest);
        
        // It should keep retrying until it reaches the max retry limit and
        // throws the an ACE containing the simulated IOException.
        AmazonClientException expectedClientException = null;
        try {
            testedClient.requestExecutionBuilder()
                    .request(testedRepeatableRequest)
                    .errorResponseHandler(errorResponseHandler)
                    .executionContext(context)
                    .execute();
            Assert.fail("AmazonClientException is expected.");
        } catch (AmazonClientException ace) {
            Assert.assertTrue(simulatedIOException == ace.getCause());
            expectedClientException = ace;
        }

        // Verifies that the correct information was passed into the RetryCondition and BackoffStrategy
        verifyExpectedContextData(retryCondition,
                                  originalRequest,
                                  expectedClientException,
                                  EXPECTED_SHOULD_RETRY_CALL_COUNT); // shouldRetry is being called again to record MaxRetriesExceeded
        verifyExpectedContextData(backoffStrategy,
                                  originalRequest,
                                  expectedClientException,
                                  EXPECTED_RETRY_COUNT);
        
        // We also want to check the RequestCount metric is correctly captured.
        Assert.assertEquals(
                EXPECTED_RETRY_COUNT + 1, // request count = retries + 1
                context.getAwsRequestMetrics()
                        .getTimingInfo().getCounter(AWSRequestMetrics.Field.RequestCount.toString()).intValue());
    }
    
    /**
     * Tests AmazonHttpClient's behavior upon simulated service exceptions when the
     * request payload is not repeatable.
     */
    @Test
    public void testServiceExceptionHandlingWithNonRepeatableRequestContent() {
        int random500StatusCode = 500 + random.nextInt(100);
        String randomErrorCode = UUID.randomUUID().toString();
        
        // A mock HttpClient that always returns the specified status and error code.
        injectMockHttpClient(testedClient, new ReturnServiceErrorHttpClient(random500StatusCode, randomErrorCode));
        
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        
        // A non-repeatable request
        Request<?> testedNonRepeatableRequest = getSampleRequestWithNonRepeatableContent(originalRequest);
        
        // It should fail directly and throw the ASE, without consulting the
        // custom shouldRetry(..) method.
        try {
            testedClient.requestExecutionBuilder()
                    .request(testedNonRepeatableRequest)
                    .errorResponseHandler(errorResponseHandler)
                    .executionContext(context)
                    .execute();
            Assert.fail("AmazonServiceException is expected.");
        } catch (AmazonServiceException ase) {
            Assert.assertEquals(random500StatusCode, ase.getStatusCode());
            Assert.assertEquals(randomErrorCode, ase.getErrorCode());
        }
        
        // Verifies that shouldRetry and calculateSleepTime were never called
        verifyExpectedContextData(retryCondition,
                                  null,
                                  null,
                                  EXPECTED_SHOULD_RETRY_CALL_COUNT); // shouldRetry is being called again to record MaxRetriesExceeded
        verifyExpectedContextData(backoffStrategy,
                                  null,
                                  null, 
                                  EXPECTED_RETRY_COUNT);
        Assert.assertEquals(
                EXPECTED_RETRY_COUNT + 1,   // request count = retries + 1
                context.getAwsRequestMetrics()
                        .getTimingInfo().getCounter(AWSRequestMetrics.Field.RequestCount.toString()).intValue());
    }

    /**
     * Tests AmazonHttpClient's behavior upon simulated IOException when the
     * request payload is not repeatable.
     */
    @Test
    public void testIOExceptionHandlingWithNonRepeatableRequestContent() {
        // A mock HttpClient that always throws the specified IOException object
        IOException simulatedIOException = new IOException("fake IOException");
        injectMockHttpClient(testedClient, new ThrowingExceptionHttpClient(simulatedIOException));
        
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        
        // A non-repeatable request
        Request<?> testedRepeatableRequest = getSampleRequestWithNonRepeatableContent(originalRequest);
        
        // It should fail directly and throw an ACE containing the simulated
        // IOException, without consulting the
        // custom shouldRetry(..) method.
        try {
            testedClient.requestExecutionBuilder()
                    .request(testedRepeatableRequest)
                    .errorResponseHandler(errorResponseHandler)
                    .executionContext(context)
                    .execute();
            Assert.fail("AmazonClientException is expected.");
        } catch (AmazonClientException ace) {
            Assert.assertTrue(simulatedIOException == ace.getCause());
        }

        // Verifies that shouldRetry and calculateSleepTime are still called
        verifyExpectedContextData(retryCondition,
                                  null,
                                  null,
                                  EXPECTED_SHOULD_RETRY_CALL_COUNT); // shouldRetry is being called again to record MaxRetriesExceeded
        verifyExpectedContextData(backoffStrategy,
                                  null,
                                  null, 
                                  EXPECTED_RETRY_COUNT);
        
        Assert.assertEquals(
                EXPECTED_RETRY_COUNT + 1, // request count = retries + 1
                context.getAwsRequestMetrics()
                        .getTimingInfo().getCounter(AWSRequestMetrics.Field.RequestCount.toString()).intValue());
    }
    
    /**
     * Tests AmazonHttpClient's behavior upon simulated RuntimeException (which
     * should be handled as an unexpected failure and not retried).
     */
    @Test
    public void testUnexpectedFailureHandling() {
        // A mock HttpClient that always throws an NPE
        NullPointerException simulatedNPE = new NullPointerException("fake NullPointerException");
        injectMockHttpClient(testedClient, new ThrowingExceptionHttpClient(simulatedNPE));
        
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        
        Request<?> testedRepeatableRequest = getSampleRequestWithRepeatableContent(originalRequest);
        
        // It should fail directly and throw the simulated NPE, without
        // consulting the custom shouldRetry(..) method.
        try {
            testedClient.requestExecutionBuilder()
                    .request(testedRepeatableRequest)
                    .errorResponseHandler(errorResponseHandler)
                    .executionContext(context)
                    .execute();
            Assert.fail("AmazonClientException is expected.");
        } catch (NullPointerException npe) {
            Assert.assertTrue(simulatedNPE == npe);
        }

        // Verifies that shouldRetry and calculateSleepTime were never called
        verifyExpectedContextData(retryCondition,
                                  null,
                                  null, 
                                  0);
        verifyExpectedContextData(backoffStrategy,
                                  null,
                                  null, 
                                  0);
        
        // The captured RequestCount should be 1
        Assert.assertEquals(
                1,
                context.getAwsRequestMetrics()
                        .getTimingInfo().getCounter(AWSRequestMetrics.Field.RequestCount.toString()).intValue());
    }
}
