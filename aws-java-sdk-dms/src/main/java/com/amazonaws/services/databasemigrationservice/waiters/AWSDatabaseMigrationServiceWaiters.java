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
package com.amazonaws.services.databasemigrationservice.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationService;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDatabaseMigrationServiceWaiters {

    /**
     * Represents the service client
     */
    private final AWSDatabaseMigrationService client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AWSDatabaseMigrationServiceWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSDatabaseMigrationServiceWaiters(AWSDatabaseMigrationService client) {
        this.client = client;
    }

    /**
     * Builds a TestConnectionSucceeds waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeConnectionsRequest> testConnectionSucceeds() {

        return new WaiterBuilder<DescribeConnectionsRequest, DescribeConnectionsResult>().withSdkFunction(new DescribeConnectionsFunction(client))
                .withAcceptors(new TestConnectionSucceeds.IsSuccessfulMatcher(), new TestConnectionSucceeds.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationInstanceAvailable waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationInstancesRequest> replicationInstanceAvailable() {

        return new WaiterBuilder<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult>()
                .withSdkFunction(new DescribeReplicationInstancesFunction(client))
                .withAcceptors(new ReplicationInstanceAvailable.IsAvailableMatcher(), new ReplicationInstanceAvailable.IsDeletingMatcher(),
                        new ReplicationInstanceAvailable.IsIncompatiblecredentialsMatcher(), new ReplicationInstanceAvailable.IsIncompatiblenetworkMatcher(),
                        new ReplicationInstanceAvailable.IsInaccessibleencryptioncredentialsMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationTaskReady waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationTasksRequest> replicationTaskReady() {

        return new WaiterBuilder<DescribeReplicationTasksRequest, DescribeReplicationTasksResult>()
                .withSdkFunction(new DescribeReplicationTasksFunction(client))
                .withAcceptors(new ReplicationTaskReady.IsReadyMatcher(), new ReplicationTaskReady.IsStartingMatcher(),
                        new ReplicationTaskReady.IsRunningMatcher(), new ReplicationTaskReady.IsStoppingMatcher(), new ReplicationTaskReady.IsStoppedMatcher(),
                        new ReplicationTaskReady.IsFailedMatcher(), new ReplicationTaskReady.IsModifyingMatcher(), new ReplicationTaskReady.IsTestingMatcher(),
                        new ReplicationTaskReady.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EndpointDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointsRequest> endpointDeleted() {

        return new WaiterBuilder<DescribeEndpointsRequest, DescribeEndpointsResult>()
                .withSdkFunction(new DescribeEndpointsFunction(client))
                .withAcceptors(new EndpointDeleted.IsResourceNotFoundFaultMatcher(), new EndpointDeleted.IsActiveMatcher(),
                        new EndpointDeleted.IsCreatingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationTaskDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationTasksRequest> replicationTaskDeleted() {

        return new WaiterBuilder<DescribeReplicationTasksRequest, DescribeReplicationTasksResult>()
                .withSdkFunction(new DescribeReplicationTasksFunction(client))
                .withAcceptors(new ReplicationTaskDeleted.IsReadyMatcher(), new ReplicationTaskDeleted.IsCreatingMatcher(),
                        new ReplicationTaskDeleted.IsStoppedMatcher(), new ReplicationTaskDeleted.IsRunningMatcher(),
                        new ReplicationTaskDeleted.IsFailedMatcher(), new ReplicationTaskDeleted.IsResourceNotFoundFaultMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationTaskStopped waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationTasksRequest> replicationTaskStopped() {

        return new WaiterBuilder<DescribeReplicationTasksRequest, DescribeReplicationTasksResult>()
                .withSdkFunction(new DescribeReplicationTasksFunction(client))
                .withAcceptors(new ReplicationTaskStopped.IsStoppedMatcher(), new ReplicationTaskStopped.IsReadyMatcher(),
                        new ReplicationTaskStopped.IsCreatingMatcher(), new ReplicationTaskStopped.IsStartingMatcher(),
                        new ReplicationTaskStopped.IsRunningMatcher(), new ReplicationTaskStopped.IsFailedMatcher(),
                        new ReplicationTaskStopped.IsModifyingMatcher(), new ReplicationTaskStopped.IsTestingMatcher(),
                        new ReplicationTaskStopped.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationTaskRunning waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationTasksRequest> replicationTaskRunning() {

        return new WaiterBuilder<DescribeReplicationTasksRequest, DescribeReplicationTasksResult>()
                .withSdkFunction(new DescribeReplicationTasksFunction(client))
                .withAcceptors(new ReplicationTaskRunning.IsRunningMatcher(), new ReplicationTaskRunning.IsReadyMatcher(),
                        new ReplicationTaskRunning.IsCreatingMatcher(), new ReplicationTaskRunning.IsStoppingMatcher(),
                        new ReplicationTaskRunning.IsStoppedMatcher(), new ReplicationTaskRunning.IsFailedMatcher(),
                        new ReplicationTaskRunning.IsModifyingMatcher(), new ReplicationTaskRunning.IsTestingMatcher(),
                        new ReplicationTaskRunning.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReplicationInstanceDeleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeReplicationInstancesRequest> replicationInstanceDeleted() {

        return new WaiterBuilder<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult>()
                .withSdkFunction(new DescribeReplicationInstancesFunction(client))
                .withAcceptors(new ReplicationInstanceDeleted.IsAvailableMatcher(), new ReplicationInstanceDeleted.IsResourceNotFoundFaultMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
