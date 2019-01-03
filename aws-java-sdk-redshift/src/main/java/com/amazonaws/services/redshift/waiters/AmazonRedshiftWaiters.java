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
package com.amazonaws.services.redshift.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.redshift.AmazonRedshift;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftWaiters {

    /**
     * Represents the service client
     */
    private final AmazonRedshift client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonRedshiftWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonRedshiftWaiters(AmazonRedshift client) {
        this.client = client;
    }

    /**
     * Builds a ClusterDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClustersRequest> clusterDeleted() {

        return new WaiterBuilder<DescribeClustersRequest, DescribeClustersResult>().withSdkFunction(new DescribeClustersFunction(client))
                .withAcceptors(new ClusterDeleted.IsClusterNotFoundMatcher(), new ClusterDeleted.IsCreatingMatcher(), new ClusterDeleted.IsModifyingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a SnapshotAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterSnapshotsRequest> snapshotAvailable() {

        return new WaiterBuilder<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult>()
                .withSdkFunction(new DescribeClusterSnapshotsFunction(client))
                .withAcceptors(new SnapshotAvailable.IsAvailableMatcher(), new SnapshotAvailable.IsFailedMatcher(), new SnapshotAvailable.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ClusterRestored waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClustersRequest> clusterRestored() {

        return new WaiterBuilder<DescribeClustersRequest, DescribeClustersResult>().withSdkFunction(new DescribeClustersFunction(client))
                .withAcceptors(new ClusterRestored.IsCompletedMatcher(), new ClusterRestored.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ClusterAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClustersRequest> clusterAvailable() {

        return new WaiterBuilder<DescribeClustersRequest, DescribeClustersResult>()
                .withSdkFunction(new DescribeClustersFunction(client))
                .withAcceptors(new ClusterAvailable.IsAvailableMatcher(), new ClusterAvailable.IsDeletingMatcher(),
                        new ClusterAvailable.IsClusterNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
