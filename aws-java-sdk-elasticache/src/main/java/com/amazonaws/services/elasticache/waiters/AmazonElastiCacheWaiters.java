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
package com.amazonaws.services.elasticache.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.elasticache.AmazonElastiCache;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElastiCacheWaiters {

    /**
     * Represents the service client
     */
    private final AmazonElastiCache client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonElastiCacheWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonElastiCacheWaiters(AmazonElastiCache client) {
        this.client = client;
    }

    /**
     * Builds a CacheClusterDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCacheClustersRequest> cacheClusterDeleted() {

        return new WaiterBuilder<DescribeCacheClustersRequest, DescribeCacheClustersResult>()
                .withSdkFunction(new DescribeCacheClustersFunction(client))
                .withAcceptors(new CacheClusterDeleted.IsDeletedMatcher(), new CacheClusterDeleted.IsCacheClusterNotFoundMatcher(),
                        new CacheClusterDeleted.IsAvailableMatcher(), new CacheClusterDeleted.IsCreatingMatcher(),
                        new CacheClusterDeleted.IsIncompatiblenetworkMatcher(), new CacheClusterDeleted.IsModifyingMatcher(),
                        new CacheClusterDeleted.IsRestorefailedMatcher(), new CacheClusterDeleted.IsSnapshottingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationGroupAvailable waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationGroupsRequest> replicationGroupAvailable() {

        return new WaiterBuilder<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult>()
                .withSdkFunction(new DescribeReplicationGroupsFunction(client))
                .withAcceptors(new ReplicationGroupAvailable.IsAvailableMatcher(), new ReplicationGroupAvailable.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a CacheClusterAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCacheClustersRequest> cacheClusterAvailable() {

        return new WaiterBuilder<DescribeCacheClustersRequest, DescribeCacheClustersResult>()
                .withSdkFunction(new DescribeCacheClustersFunction(client))
                .withAcceptors(new CacheClusterAvailable.IsAvailableMatcher(), new CacheClusterAvailable.IsDeletedMatcher(),
                        new CacheClusterAvailable.IsDeletingMatcher(), new CacheClusterAvailable.IsIncompatiblenetworkMatcher(),
                        new CacheClusterAvailable.IsRestorefailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationGroupDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationGroupsRequest> replicationGroupDeleted() {

        return new WaiterBuilder<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult>()
                .withSdkFunction(new DescribeReplicationGroupsFunction(client))
                .withAcceptors(new ReplicationGroupDeleted.IsDeletedMatcher(), new ReplicationGroupDeleted.IsAvailableMatcher(),
                        new ReplicationGroupDeleted.IsReplicationGroupNotFoundFaultMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
