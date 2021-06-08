/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSElasticBeanstalkWaiters {

    /**
     * Represents the service client
     */
    private final AWSElasticBeanstalk client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSElasticBeanstalkWaiters");

    /**
     * Constructs a new AWSElasticBeanstalkWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSElasticBeanstalkWaiters(AWSElasticBeanstalk client) {
        this.client = client;
    }

    /**
     * Builds a EnvironmentTerminated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEnvironmentsRequest> environmentTerminated() {

        return new WaiterBuilder<DescribeEnvironmentsRequest, DescribeEnvironmentsResult>().withSdkFunction(new DescribeEnvironmentsFunction(client))
                .withAcceptors(new EnvironmentTerminated.IsTerminatedMatcher(), new EnvironmentTerminated.IsTerminatingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(20)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EnvironmentUpdated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEnvironmentsRequest> environmentUpdated() {

        return new WaiterBuilder<DescribeEnvironmentsRequest, DescribeEnvironmentsResult>().withSdkFunction(new DescribeEnvironmentsFunction(client))
                .withAcceptors(new EnvironmentUpdated.IsReadyMatcher(), new EnvironmentUpdated.IsUpdatingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(20)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EnvironmentExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEnvironmentsRequest> environmentExists() {

        return new WaiterBuilder<DescribeEnvironmentsRequest, DescribeEnvironmentsResult>().withSdkFunction(new DescribeEnvironmentsFunction(client))
                .withAcceptors(new EnvironmentExists.IsReadyMatcher(), new EnvironmentExists.IsLaunchingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(20)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
