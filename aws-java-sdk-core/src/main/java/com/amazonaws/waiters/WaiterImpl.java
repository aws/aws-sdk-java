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
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.ValidationUtils;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@SdkProtectedApi
public class WaiterImpl<Input extends AmazonWebServiceRequest, Output> implements Waiter<Input>{

    /**
     * Represents the operation function
     */
    private final SdkFunction<Input, Output> sdkFunction;

    /**
     * List of acceptors
     */
    private final List<WaiterAcceptor<Output>> acceptors;

    /**
     * Represents the default polling strategy
     */
    private final PollingStrategy defaultPollingStrategy;

    private final ExecutorService executorService;

    /**
     * Constructs a new waiter with the given internal parameters
     *
     * @param waiterBuilder Takes in default parameters and builds a
     *                      basic waiter. Excludes request and custom
     *                      polling strategy parameters.
     */
    @SdkProtectedApi
    public WaiterImpl(WaiterBuilder<Input, Output> waiterBuilder) {
        this.sdkFunction = ValidationUtils.assertNotNull(waiterBuilder.getSdkFunction(), "sdkFunction");
        this.acceptors = ValidationUtils.assertNotNull(waiterBuilder.getAcceptor(), "acceptors");
        this.defaultPollingStrategy = ValidationUtils.assertNotNull(waiterBuilder.getDefaultPollingStrategy(), "defaultPollingStrategy");
        this.executorService = ValidationUtils.assertNotNull(waiterBuilder.getExecutorService(), "executorService");
    }

    /**
     * Polls synchronously until it is determined that the resource
     * transitioned into the desired state or not.
     *
     * @param waiterParameters Custom provided parameters. Includes request and
     *                         optional custom polling strategy
     * @throws AmazonServiceException       If the service exception thrown doesn't match any of the expected
     *                                      exceptions, it's re-thrown.
     * @throws WaiterUnrecoverableException If the resource transitions into a failure/unexpected state.
     * @throws WaiterTimedOutException      If the resource doesn't transition into the desired state
     *                                      even after a certain number of retries.
     */
    public void run(WaiterParameters<Input> waiterParameters)
            throws AmazonServiceException, WaiterTimedOutException, WaiterUnrecoverableException {

        ValidationUtils.assertNotNull(waiterParameters, "waiterParameters");
        @SuppressWarnings("unchecked")
        Input request = (Input) ValidationUtils.assertNotNull(waiterParameters.getRequest(), "request").clone();
        request.getRequestClientOptions().appendUserAgent("waiter-request");
        WaiterExecution<Input, Output> waiterExecution = new WaiterExecutionBuilder<Input, Output>()
                .withRequest(request)
                .withPollingStrategy(waiterParameters.getPollingStrategy() != null ? waiterParameters.getPollingStrategy() : defaultPollingStrategy)
                .withAcceptors(acceptors)
                .withSdkFunction(sdkFunction)
                .build();

        waiterExecution.pollResource();

    }

    /**
     * Polls asynchronously until it is determined that the resource
     * transitioned into the desired state or not. Includes additional
     * callback.
     *
     * @param waiterParameters Custom provided parameters. Includes request and
     *                         optional custom polling strategy
     * @param callback         Custom callback
     * @return Future object that holds the result of an asynchronous
     * computation of waiter
     */
    public Future<Void> runAsync(final WaiterParameters<Input> waiterParameters, final WaiterHandler callback)
            throws AmazonServiceException, WaiterTimedOutException, WaiterUnrecoverableException {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                try {
                    run(waiterParameters);
                    callback.onWaitSuccess(waiterParameters.getRequest());
                } catch (Exception ex) {
                    callback.onWaitFailure(ex);

                    throw ex;
                }
                return null;
            }
        });

    }
}
