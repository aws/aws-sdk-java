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

import com.amazonaws.*;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.ValidationUtils;

@SdkProtectedApi
public class WaiterExecution<Input extends AmazonWebServiceRequest, Output> {

    /**
     * Resource specific function that makes a call to the
     * operation specified by the waiter
     */
    private final SdkFunction<Input, Output> sdkFunction;

    /**
     * Represents the input of the operation.
     */
    private final Input request;

    /**
     * List of acceptors defined for each waiter
     */
    private final CompositeAcceptor<Output> acceptor;

    /**
     * Custom polling strategy as given by the end users
     */
    private final PollingStrategy pollingStrategy;

    /**
     * Constructs a new waiter with all the parameters defined
     * in the WaiterExecutionBuilder
     *
     * @param waiterExecutionBuilder Contains all the parameters required to construct a
     *                               new waiter
     */
    public WaiterExecution(WaiterExecutionBuilder<Input, Output> waiterExecutionBuilder) {
        this.sdkFunction = ValidationUtils.assertNotNull(waiterExecutionBuilder.getSdkFunction(), "sdkFunction");
        this.request = ValidationUtils.assertNotNull(waiterExecutionBuilder.getRequest(), "request");
        this.acceptor = new CompositeAcceptor<Output>(ValidationUtils.assertNotNull(waiterExecutionBuilder.getAcceptorsList(), "acceptors"));
        this.pollingStrategy = ValidationUtils.assertNotNull(waiterExecutionBuilder.getPollingStrategy(), "pollingStrategy");
    }

    /**
     * Polls until a specified resource transitions into either success or failure state or
     * until the specified number of retries has been made.
     *
     * @return True if the resource transitions into desired state.
     * @throws AmazonServiceException       If the service exception thrown doesn't match any of the expected
     *                                      exceptions, it's re-thrown.
     * @throws WaiterUnrecoverableException If the resource transitions into a failure/unexpected state.
     * @throws WaiterTimedOutException      If the resource doesn't transition into the desired state
     *                                      even after a certain number of retries.
     */
    public boolean pollResource() throws AmazonServiceException, WaiterTimedOutException, WaiterUnrecoverableException {
        int retriesAttempted = 0;
        while (true) {
            switch (getCurrentState()) {
                case SUCCESS:
                    return true;
                case FAILURE:
                    throw new WaiterUnrecoverableException("Resource never entered the desired state as it failed.");
                case RETRY:
                    PollingStrategyContext pollingStrategyContext = new PollingStrategyContext(request, retriesAttempted);
                    if (pollingStrategy.getRetryStrategy().shouldRetry(pollingStrategyContext)) {
                        safeCustomDelay(pollingStrategyContext);
                        retriesAttempted++;
                    } else {

                        throw new WaiterTimedOutException("Reached maximum attempts without transitioning to the desired state");
                    }
                    break;
            }

        }
    }

    /**
     * Fetches the current state of the resource based on the acceptor it matches
     *
     * @return Current state of the resource
     * @throws Exception
     */
    private WaiterState getCurrentState() throws AmazonServiceException {
        try {
            return acceptor.accepts(sdkFunction.apply(request));
        } catch (AmazonServiceException amazonServiceException) {
            return acceptor.accepts(amazonServiceException);
        }

    }

    /**
     * Calls the custom delay strategy to control the sleep time
     *
     * @param pollingStrategyContext Provides the polling strategy context.
     *                               Includes request and number of retries
     *                               attempted so far.
     */
    private void safeCustomDelay(PollingStrategyContext pollingStrategyContext) {
        try {
            pollingStrategy.getDelayStrategy().delayBeforeNextRetry(pollingStrategyContext);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

}
