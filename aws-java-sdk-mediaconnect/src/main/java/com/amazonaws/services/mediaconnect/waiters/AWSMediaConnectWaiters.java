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
package com.amazonaws.services.mediaconnect.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.mediaconnect.AWSMediaConnect;
import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConnectWaiters {

    /**
     * Represents the service client
     */
    private final AWSMediaConnect client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSMediaConnectWaiters");

    /**
     * Constructs a new AWSMediaConnectWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSMediaConnectWaiters(AWSMediaConnect client) {
        this.client = client;
    }

    /**
     * Builds a FlowStandby waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeFlowRequest> flowStandby() {

        return new WaiterBuilder<DescribeFlowRequest, DescribeFlowResult>()
                .withSdkFunction(new DescribeFlowFunction(client))
                .withAcceptors(new FlowStandby.IsSTANDBYMatcher(), new FlowStandby.IsSTOPPINGMatcher(), new HttpFailureStatusAcceptor(500, WaiterState.RETRY),
                        new HttpFailureStatusAcceptor(503, WaiterState.RETRY), new FlowStandby.IsERRORMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a FlowActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeFlowRequest> flowActive() {

        return new WaiterBuilder<DescribeFlowRequest, DescribeFlowResult>()
                .withSdkFunction(new DescribeFlowFunction(client))
                .withAcceptors(new FlowActive.IsACTIVEMatcher(), new FlowActive.IsSTARTINGMatcher(), new FlowActive.IsUPDATINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY), new HttpFailureStatusAcceptor(503, WaiterState.RETRY),
                        new FlowActive.IsERRORMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a FlowDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeFlowRequest> flowDeleted() {

        return new WaiterBuilder<DescribeFlowRequest, DescribeFlowResult>()
                .withSdkFunction(new DescribeFlowFunction(client))
                .withAcceptors(new HttpFailureStatusAcceptor(404, WaiterState.SUCCESS), new FlowDeleted.IsDELETINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY), new HttpFailureStatusAcceptor(503, WaiterState.RETRY),
                        new FlowDeleted.IsERRORMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
