/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.cloudfront.AmazonCloudFront;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontWaiters {

    /**
     * Represents the service client
     */
    private final AmazonCloudFront client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonCloudFrontWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonCloudFrontWaiters(AmazonCloudFront client) {
        this.client = client;
    }

    /**
     * Builds a DistributionDeployed waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetDistributionRequest> distributionDeployed() {

        return new WaiterBuilder<GetDistributionRequest, GetDistributionResult>().withSdkFunction(new GetDistributionFunction(client))
                .withAcceptors(new DistributionDeployed.IsDeployedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(25), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingDistributionDeployed waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingDistributionRequest> streamingDistributionDeployed() {

        return new WaiterBuilder<GetStreamingDistributionRequest, GetStreamingDistributionResult>()
                .withSdkFunction(new GetStreamingDistributionFunction(client)).withAcceptors(new StreamingDistributionDeployed.IsDeployedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(25), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InvalidationCompleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetInvalidationRequest> invalidationCompleted() {

        return new WaiterBuilder<GetInvalidationRequest, GetInvalidationResult>().withSdkFunction(new GetInvalidationFunction(client))
                .withAcceptors(new InvalidationCompleted.IsCompletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(20)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
