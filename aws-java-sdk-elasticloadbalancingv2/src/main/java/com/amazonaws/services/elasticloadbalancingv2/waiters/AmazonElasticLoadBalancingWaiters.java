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
package com.amazonaws.services.elasticloadbalancingv2.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
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
     * Builds a LoadBalancerAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeLoadBalancersRequest> loadBalancerAvailable() {

        return new WaiterBuilder<DescribeLoadBalancersRequest, DescribeLoadBalancersResult>()
                .withSdkFunction(new DescribeLoadBalancersFunction(client))
                .withAcceptors(new LoadBalancerAvailable.IsActiveMatcher(), new LoadBalancerAvailable.IsProvisioningMatcher(),
                        new LoadBalancerAvailable.IsLoadBalancerNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TargetDeregistered waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTargetHealthRequest> targetDeregistered() {

        return new WaiterBuilder<DescribeTargetHealthRequest, DescribeTargetHealthResult>().withSdkFunction(new DescribeTargetHealthFunction(client))
                .withAcceptors(new TargetDeregistered.IsInvalidTargetMatcher(), new TargetDeregistered.IsUnusedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TargetInService waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTargetHealthRequest> targetInService() {

        return new WaiterBuilder<DescribeTargetHealthRequest, DescribeTargetHealthResult>().withSdkFunction(new DescribeTargetHealthFunction(client))
                .withAcceptors(new TargetInService.IsHealthyMatcher(), new TargetInService.IsInvalidInstanceMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LoadBalancerExists waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeLoadBalancersRequest> loadBalancerExists() {

        return new WaiterBuilder<DescribeLoadBalancersRequest, DescribeLoadBalancersResult>().withSdkFunction(new DescribeLoadBalancersFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new LoadBalancerExists.IsLoadBalancerNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LoadBalancersDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeLoadBalancersRequest> loadBalancersDeleted() {

        return new WaiterBuilder<DescribeLoadBalancersRequest, DescribeLoadBalancersResult>().withSdkFunction(new DescribeLoadBalancersFunction(client))
                .withAcceptors(new LoadBalancersDeleted.IsActiveMatcher(), new LoadBalancersDeleted.IsLoadBalancerNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
