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
package com.amazonaws.services.autoscaling.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.autoscaling.AmazonAutoScaling;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAutoScalingWaiters {

    /**
     * Represents the service client
     */
    private final AmazonAutoScaling client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonAutoScalingWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonAutoScalingWaiters(AmazonAutoScaling client) {
        this.client = client;
    }

    /**
     * Builds a GroupInService waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAutoScalingGroupsRequest> groupInService() {

        return new WaiterBuilder<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult>()
                .withSdkFunction(new DescribeAutoScalingGroupsFunction(client))
                .withAcceptors(new GroupInService.IsFalseMatcher(), new GroupInService.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a GroupNotExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAutoScalingGroupsRequest> groupNotExists() {

        return new WaiterBuilder<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult>()
                .withSdkFunction(new DescribeAutoScalingGroupsFunction(client))
                .withAcceptors(new GroupNotExists.IsFalseMatcher(), new GroupNotExists.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a GroupExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAutoScalingGroupsRequest> groupExists() {

        return new WaiterBuilder<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult>()
                .withSdkFunction(new DescribeAutoScalingGroupsFunction(client))
                .withAcceptors(new GroupExists.IsTrueMatcher(), new GroupExists.IsFalseMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(10), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
