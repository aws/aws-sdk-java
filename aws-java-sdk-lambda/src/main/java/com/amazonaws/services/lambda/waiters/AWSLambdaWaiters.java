/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLambdaWaiters {

    /**
     * Represents the service client
     */
    private final AWSLambda client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSLambdaWaiters");

    /**
     * Constructs a new AWSLambdaWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSLambdaWaiters(AWSLambda client) {
        this.client = client;
    }

    /**
     * Builds a FunctionUpdated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetFunctionConfigurationRequest> functionUpdated() {

        return new WaiterBuilder<GetFunctionConfigurationRequest, GetFunctionConfigurationResult>()
                .withSdkFunction(new GetFunctionConfigurationFunction(client))
                .withAcceptors(new FunctionUpdated.IsSuccessfulMatcher(), new FunctionUpdated.IsFailedMatcher(), new FunctionUpdated.IsInProgressMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a FunctionExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetFunctionRequest> functionExists() {

        return new WaiterBuilder<GetFunctionRequest, GetFunctionResult>().withSdkFunction(new GetFunctionFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new FunctionExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a FunctionActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetFunctionConfigurationRequest> functionActive() {

        return new WaiterBuilder<GetFunctionConfigurationRequest, GetFunctionConfigurationResult>()
                .withSdkFunction(new GetFunctionConfigurationFunction(client))
                .withAcceptors(new FunctionActive.IsActiveMatcher(), new FunctionActive.IsFailedMatcher(), new FunctionActive.IsPendingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
