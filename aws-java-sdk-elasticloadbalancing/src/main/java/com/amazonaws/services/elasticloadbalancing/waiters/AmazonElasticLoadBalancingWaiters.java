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
package com.amazonaws.services.elasticloadbalancing.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticLoadBalancingWaiters {

    /**
     * Represents the service client
     */
    private final AmazonElasticLoadBalancing client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonElasticLoadBalancingWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonElasticLoadBalancingWaiters(AmazonElasticLoadBalancing client) {
        this.client = client;
    }

    /**
     * Builds a AnyInstanceInService waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstanceHealthRequest> anyInstanceInService() {

        return new WaiterBuilder<DescribeInstanceHealthRequest, DescribeInstanceHealthResult>().withSdkFunction(new DescribeInstanceHealthFunction(client))
                .withAcceptors(new AnyInstanceInService.IsInServiceMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceDeregistered waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstanceHealthRequest> instanceDeregistered() {

        return new WaiterBuilder<DescribeInstanceHealthRequest, DescribeInstanceHealthResult>().withSdkFunction(new DescribeInstanceHealthFunction(client))
                .withAcceptors(new InstanceDeregistered.IsOutOfServiceMatcher(), new InstanceDeregistered.IsInvalidInstanceMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceInService waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstanceHealthRequest> instanceInService() {

        return new WaiterBuilder<DescribeInstanceHealthRequest, DescribeInstanceHealthResult>().withSdkFunction(new DescribeInstanceHealthFunction(client))
                .withAcceptors(new InstanceInService.IsInServiceMatcher(), new InstanceInService.IsInvalidInstanceMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
