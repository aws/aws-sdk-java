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
package com.amazonaws.services.elasticmapreduce.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticMapReduceWaiters {

    /**
     * Represents the service client
     */
    private final AmazonElasticMapReduce client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonElasticMapReduceWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonElasticMapReduceWaiters(AmazonElasticMapReduce client) {
        this.client = client;
    }

    /**
     * Builds a ClusterRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterRunning() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>()
                .withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new ClusterRunning.IsRUNNINGMatcher(), new ClusterRunning.IsWAITINGMatcher(), new ClusterRunning.IsTERMINATINGMatcher(),
                        new ClusterRunning.IsTERMINATEDMatcher(), new ClusterRunning.IsTERMINATED_WITH_ERRORSMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StepComplete waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeStepRequest> stepComplete() {

        return new WaiterBuilder<DescribeStepRequest, DescribeStepResult>().withSdkFunction(new DescribeStepFunction(client))
                .withAcceptors(new StepComplete.IsCOMPLETEDMatcher(), new StepComplete.IsFAILEDMatcher(), new StepComplete.IsCANCELLEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ClusterTerminated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterTerminated() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>().withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new ClusterTerminated.IsTERMINATEDMatcher(), new ClusterTerminated.IsTERMINATED_WITH_ERRORSMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
