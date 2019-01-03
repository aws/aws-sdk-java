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
package com.amazonaws.services.ecs.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.ecs.AmazonECS;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECSWaiters {

    /**
     * Represents the service client
     */
    private final AmazonECS client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonECSWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonECSWaiters(AmazonECS client) {
        this.client = client;
    }

    /**
     * Builds a TasksRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTasksRequest> tasksRunning() {

        return new WaiterBuilder<DescribeTasksRequest, DescribeTasksResult>().withSdkFunction(new DescribeTasksFunction(client))
                .withAcceptors(new TasksRunning.IsSTOPPEDMatcher(), new TasksRunning.IsMISSINGMatcher(), new TasksRunning.IsRUNNINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(100), new FixedDelayStrategy(6)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServicesStable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeServicesRequest> servicesStable() {

        return new WaiterBuilder<DescribeServicesRequest, DescribeServicesResult>()
                .withSdkFunction(new DescribeServicesFunction(client))
                .withAcceptors(new ServicesStable.IsMISSINGMatcher(), new ServicesStable.IsDRAININGMatcher(), new ServicesStable.IsINACTIVEMatcher(),
                        new ServicesStable.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ServicesInactive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeServicesRequest> servicesInactive() {

        return new WaiterBuilder<DescribeServicesRequest, DescribeServicesResult>().withSdkFunction(new DescribeServicesFunction(client))
                .withAcceptors(new ServicesInactive.IsMISSINGMatcher(), new ServicesInactive.IsINACTIVEMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TasksStopped waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTasksRequest> tasksStopped() {

        return new WaiterBuilder<DescribeTasksRequest, DescribeTasksResult>().withSdkFunction(new DescribeTasksFunction(client))
                .withAcceptors(new TasksStopped.IsSTOPPEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(100), new FixedDelayStrategy(6)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
