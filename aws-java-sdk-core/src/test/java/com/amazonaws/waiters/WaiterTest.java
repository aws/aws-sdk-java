/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.waiters;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WaiterTest {

    @Mock
    private PollingStrategy.RetryStrategy mockRetryStrategy = mock(PollingStrategy.RetryStrategy.class);
    private PollingStrategy.DelayStrategy mockDelayStrategy = mock(PollingStrategy.DelayStrategy.class);

    WaiterExecutionBuilder waiterExecutionBuilder;
    MockDescribeRequest request = new MockDescribeRequest();
    @Before
    public void setup(){
        waiterExecutionBuilder = new WaiterExecutionBuilder<MockDescribeRequest, MockDescribeResult>()
                .withRequest(request)
                .withPollingStrategy(new PollingStrategy(mockRetryStrategy, mockDelayStrategy))
                .withSdkFunction(new MockDescribeFunction());
        when(mockRetryStrategy.shouldRetry(any(PollingStrategyContext.class))).thenReturn(true).thenReturn(true).thenReturn(false);
    }

    @Test
    public void successStatePolling() throws Exception {
        List<WaiterAcceptor> acceptors = new ArrayList<WaiterAcceptor>();
        acceptors.add(new SuccessStateResultAcceptor());
        acceptors.add(new ExceptionAcceptor());
        waiterExecutionBuilder.withAcceptors(acceptors);
        WaiterExecution waiter = new WaiterExecution(waiterExecutionBuilder);
        Assert.assertTrue("Resource status transitioned to failure", waiter.pollResource());
        verify(mockDelayStrategy, times(2)).delayBeforeNextRetry(any(PollingStrategyContext.class));
    }

    @Test(expected = WaiterUnrecoverableException.class)
    public void failureStatePolling() throws Exception {
        List<WaiterAcceptor> acceptors = new ArrayList<WaiterAcceptor>();
        acceptors.add(new FailureStateResultAcceptor());
        acceptors.add(new ExceptionAcceptor());
        waiterExecutionBuilder.withAcceptors(acceptors);
        WaiterExecution waiter = new WaiterExecution(waiterExecutionBuilder);
        waiter.pollResource();
    }

    @Test(expected = WaiterTimedOutException.class)
    public void retryStateFailDefaultPolling() throws Exception {
        List<WaiterAcceptor> acceptors = new ArrayList<WaiterAcceptor>();
        acceptors.add(new ExceptionAcceptor());
        waiterExecutionBuilder.withAcceptors(acceptors);
        WaiterExecution waiter = new WaiterExecution(waiterExecutionBuilder);
        waiter.pollResource();
    }

    @Test(expected = WaiterTimedOutException.class)
    public void retryStateFailCustomPolling() throws Exception {
        List<WaiterAcceptor> acceptors = new ArrayList<WaiterAcceptor>();
        acceptors.add(new ExceptionAcceptor());
        PollingStrategy pollingStrategy = new PollingStrategy(new PollingStrategy.RetryStrategy() {
            int retryCount = 0;
            @Override
            public boolean shouldRetry(PollingStrategyContext retryStrategyParameters) {
                if (retryStrategyParameters.getRetriesAttempted() < 4) {
                    retryCount++;
                    return true;
                }
                Assert.assertEquals("It didn't retry the expected number of times", 4, retryCount);
                return false;
            }
        }, new PollingStrategy.DelayStrategy() {
                    int retries = 0;
                    @Override
                    public void delayBeforeNextRetry(PollingStrategyContext pollingStrategyContext) throws InterruptedException {
                        Assert.assertEquals("Request object is different from the expected request", request, pollingStrategyContext.getOriginalRequest());
                        Assert.assertEquals("Number of retries is different from the expected retries", retries, pollingStrategyContext.getRetriesAttempted());
                        retries++;
                        if (pollingStrategyContext.getRetriesAttempted() < 4) {
                            Thread.sleep(2000);
                            return;
                        }
                        Assert.assertEquals("It didn't back off the expected number of times", 4, retries);

                    }

                });

        waiterExecutionBuilder.withAcceptors(acceptors)
                     .withPollingStrategy(pollingStrategy);
        WaiterExecution waiter = new WaiterExecution(waiterExecutionBuilder);
        waiter.pollResource();
    }


    class MockDescribeRequest extends AmazonWebServiceRequest {
        private String tableName;
    }

    class MockDescribeResult {
        private String tableName;
    }

    public MockDescribeResult mockDescribeTable(MockDescribeRequest describeTableRequest) {
        return new MockDescribeResult();
    }


    class MockDescribeFunction implements SdkFunction<MockDescribeRequest, MockDescribeResult> {

        private int numberOfCalls = 0;

        @Override
        public MockDescribeResult apply(MockDescribeRequest describeTableRequest) {
            numberOfCalls++;
            return mockDescribeTable(describeTableRequest);
        }

    }


    class FailureStateResultAcceptor extends WaiterAcceptor<MockDescribeResult> {

        public boolean matches(MockDescribeResult result) {
            return true;
        }

        public WaiterState getState() {
            return WaiterState.FAILURE;
        }
    }


    class SuccessStateResultAcceptor extends WaiterAcceptor<MockDescribeResult> {

        int retryCount = 0;
        public boolean matches(MockDescribeResult result) {
            return true;
        }
        public WaiterState getState() {
            if(retryCount <= 1) {
                retryCount++;
                return WaiterState.RETRY;
            }
            return WaiterState.SUCCESS;
        }

    }

    class ExceptionAcceptor extends WaiterAcceptor<MockDescribeResult> {

        public boolean matches(Exception e) {
            return e instanceof MockResourceNotFoundException;
        }

        public WaiterState getState() {
            return WaiterState.RETRY;
        }
    }


    class MockResourceNotFoundException extends AmazonServiceException {
        public MockResourceNotFoundException(String message) {
            super(message);
        }
    }
}




