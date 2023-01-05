/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.route53recoverycontrolconfig.AWSRoute53RecoveryControlConfig;
import com.amazonaws.services.route53recoverycontrolconfig.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryControlConfigWaiters {

    /**
     * Represents the service client
     */
    private final AWSRoute53RecoveryControlConfig client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSRoute53RecoveryControlConfigWaiters");

    /**
     * Constructs a new AWSRoute53RecoveryControlConfigWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSRoute53RecoveryControlConfigWaiters(AWSRoute53RecoveryControlConfig client) {
        this.client = client;
    }

    /**
     * Builds a ClusterDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterDeleted() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>()
                .withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new HttpFailureStatusAcceptor(404, WaiterState.SUCCESS), new ClusterDeleted.IsPENDING_DELETIONMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ControlPanelDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeControlPanelRequest> controlPanelDeleted() {

        return new WaiterBuilder<DescribeControlPanelRequest, DescribeControlPanelResult>()
                .withSdkFunction(new DescribeControlPanelFunction(client))
                .withAcceptors(new HttpFailureStatusAcceptor(404, WaiterState.SUCCESS), new ControlPanelDeleted.IsPENDING_DELETIONMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ControlPanelCreated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeControlPanelRequest> controlPanelCreated() {

        return new WaiterBuilder<DescribeControlPanelRequest, DescribeControlPanelResult>()
                .withSdkFunction(new DescribeControlPanelFunction(client))
                .withAcceptors(new ControlPanelCreated.IsDEPLOYEDMatcher(), new ControlPanelCreated.IsPENDINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a RoutingControlDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeRoutingControlRequest> routingControlDeleted() {

        return new WaiterBuilder<DescribeRoutingControlRequest, DescribeRoutingControlResult>()
                .withSdkFunction(new DescribeRoutingControlFunction(client))
                .withAcceptors(new HttpFailureStatusAcceptor(404, WaiterState.SUCCESS), new RoutingControlDeleted.IsPENDING_DELETIONMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a RoutingControlCreated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeRoutingControlRequest> routingControlCreated() {

        return new WaiterBuilder<DescribeRoutingControlRequest, DescribeRoutingControlResult>()
                .withSdkFunction(new DescribeRoutingControlFunction(client))
                .withAcceptors(new RoutingControlCreated.IsDEPLOYEDMatcher(), new RoutingControlCreated.IsPENDINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ClusterCreated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterCreated() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>()
                .withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new ClusterCreated.IsDEPLOYEDMatcher(), new ClusterCreated.IsPENDINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(26), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
