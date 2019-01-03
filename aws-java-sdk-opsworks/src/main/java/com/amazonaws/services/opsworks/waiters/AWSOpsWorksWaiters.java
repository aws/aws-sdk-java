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
package com.amazonaws.services.opsworks.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.opsworks.AWSOpsWorks;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpsWorksWaiters {

    /**
     * Represents the service client
     */
    private final AWSOpsWorks client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AWSOpsWorksWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSOpsWorksWaiters(AWSOpsWorks client) {
        this.client = client;
    }

    /**
     * Builds a InstanceTerminated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceTerminated() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceTerminated.IsTerminatedMatcher(), new InstanceTerminated.IsResourceNotFoundExceptionMatcher(),
                        new InstanceTerminated.IsBootingMatcher(), new InstanceTerminated.IsOnlineMatcher(), new InstanceTerminated.IsPendingMatcher(),
                        new InstanceTerminated.IsRebootingMatcher(), new InstanceTerminated.IsRequestedMatcher(),
                        new InstanceTerminated.IsRunning_setupMatcher(), new InstanceTerminated.IsSetup_failedMatcher(),
                        new InstanceTerminated.IsStart_failedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AppExists waiter by using custom parameters waiterParameters and other parameters defined in the waiters
     * specification, and then polls until it determines whether the resource entered the desired state or not, where
     * polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAppsRequest> appExists() {

        return new WaiterBuilder<DescribeAppsRequest, DescribeAppsResult>().withSdkFunction(new DescribeAppsFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new HttpFailureStatusAcceptor(400, WaiterState.FAILURE))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceOnline waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceOnline() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceOnline.IsOnlineMatcher(), new InstanceOnline.IsSetup_failedMatcher(), new InstanceOnline.IsShutting_downMatcher(),
                        new InstanceOnline.IsStart_failedMatcher(), new InstanceOnline.IsStoppedMatcher(), new InstanceOnline.IsStoppingMatcher(),
                        new InstanceOnline.IsTerminatingMatcher(), new InstanceOnline.IsTerminatedMatcher(), new InstanceOnline.IsStop_failedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a DeploymentSuccessful waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeDeploymentsRequest> deploymentSuccessful() {

        return new WaiterBuilder<DescribeDeploymentsRequest, DescribeDeploymentsResult>().withSdkFunction(new DescribeDeploymentsFunction(client))
                .withAcceptors(new DeploymentSuccessful.IsSuccessfulMatcher(), new DeploymentSuccessful.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceStopped waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceStopped() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceStopped.IsStoppedMatcher(), new InstanceStopped.IsBootingMatcher(), new InstanceStopped.IsPendingMatcher(),
                        new InstanceStopped.IsRebootingMatcher(), new InstanceStopped.IsRequestedMatcher(), new InstanceStopped.IsRunning_setupMatcher(),
                        new InstanceStopped.IsSetup_failedMatcher(), new InstanceStopped.IsStart_failedMatcher(), new InstanceStopped.IsStop_failedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceRegistered waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceRegistered() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceRegistered.IsRegisteredMatcher(), new InstanceRegistered.IsSetup_failedMatcher(),
                        new InstanceRegistered.IsShutting_downMatcher(), new InstanceRegistered.IsStoppedMatcher(), new InstanceRegistered.IsStoppingMatcher(),
                        new InstanceRegistered.IsTerminatingMatcher(), new InstanceRegistered.IsTerminatedMatcher(),
                        new InstanceRegistered.IsStop_failedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
