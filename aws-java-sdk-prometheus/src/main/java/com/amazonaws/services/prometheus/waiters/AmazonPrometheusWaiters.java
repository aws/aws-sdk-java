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
package com.amazonaws.services.prometheus.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.prometheus.AmazonPrometheus;
import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPrometheusWaiters {

    /**
     * Represents the service client
     */
    private final AmazonPrometheus client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonPrometheusWaiters");

    /**
     * Constructs a new AmazonPrometheusWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonPrometheusWaiters(AmazonPrometheus client) {
        this.client = client;
    }

    /**
     * Builds a WorkspaceDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeWorkspaceRequest> workspaceDeleted() {

        return new WaiterBuilder<DescribeWorkspaceRequest, DescribeWorkspaceResult>().withSdkFunction(new DescribeWorkspaceFunction(client))
                .withAcceptors(new WorkspaceDeleted.IsResourceNotFoundExceptionMatcher(), new WorkspaceDeleted.IsDELETINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a WorkspaceActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeWorkspaceRequest> workspaceActive() {

        return new WaiterBuilder<DescribeWorkspaceRequest, DescribeWorkspaceResult>().withSdkFunction(new DescribeWorkspaceFunction(client))
                .withAcceptors(new WorkspaceActive.IsACTIVEMatcher(), new WorkspaceActive.IsUPDATINGMatcher(), new WorkspaceActive.IsCREATINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
