/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.medialive.AWSMediaLive;
import com.amazonaws.services.medialive.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaLiveWaiters {

    /**
     * Represents the service client
     */
    private final AWSMediaLive client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSMediaLiveWaiters");

    /**
     * Constructs a new AWSMediaLiveWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSMediaLiveWaiters(AWSMediaLive client) {
        this.client = client;
    }

    /**
     * Builds a MultiplexCreated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeMultiplexRequest> multiplexCreated() {

        return new WaiterBuilder<DescribeMultiplexRequest, DescribeMultiplexResult>()
                .withSdkFunction(new DescribeMultiplexFunction(client))
                .withAcceptors(new MultiplexCreated.IsIDLEMatcher(), new MultiplexCreated.IsCREATINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY), new MultiplexCreated.IsCREATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(5), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ChannelRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeChannelRequest> channelRunning() {

        return new WaiterBuilder<DescribeChannelRequest, DescribeChannelResult>()
                .withSdkFunction(new DescribeChannelFunction(client))
                .withAcceptors(new ChannelRunning.IsRUNNINGMatcher(), new ChannelRunning.IsSTARTINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a MultiplexRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeMultiplexRequest> multiplexRunning() {

        return new WaiterBuilder<DescribeMultiplexRequest, DescribeMultiplexResult>()
                .withSdkFunction(new DescribeMultiplexFunction(client))
                .withAcceptors(new MultiplexRunning.IsRUNNINGMatcher(), new MultiplexRunning.IsSTARTINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a MultiplexStopped waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeMultiplexRequest> multiplexStopped() {

        return new WaiterBuilder<DescribeMultiplexRequest, DescribeMultiplexResult>()
                .withSdkFunction(new DescribeMultiplexFunction(client))
                .withAcceptors(new MultiplexStopped.IsIDLEMatcher(), new MultiplexStopped.IsSTOPPINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(28), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ChannelCreated waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeChannelRequest> channelCreated() {

        return new WaiterBuilder<DescribeChannelRequest, DescribeChannelResult>()
                .withSdkFunction(new DescribeChannelFunction(client))
                .withAcceptors(new ChannelCreated.IsIDLEMatcher(), new ChannelCreated.IsCREATINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY), new ChannelCreated.IsCREATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(5), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ChannelStopped waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeChannelRequest> channelStopped() {

        return new WaiterBuilder<DescribeChannelRequest, DescribeChannelResult>()
                .withSdkFunction(new DescribeChannelFunction(client))
                .withAcceptors(new ChannelStopped.IsIDLEMatcher(), new ChannelStopped.IsSTOPPINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(28), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ChannelDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeChannelRequest> channelDeleted() {

        return new WaiterBuilder<DescribeChannelRequest, DescribeChannelResult>()
                .withSdkFunction(new DescribeChannelFunction(client))
                .withAcceptors(new ChannelDeleted.IsDELETEDMatcher(), new ChannelDeleted.IsDELETINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a MultiplexDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeMultiplexRequest> multiplexDeleted() {

        return new WaiterBuilder<DescribeMultiplexRequest, DescribeMultiplexResult>()
                .withSdkFunction(new DescribeMultiplexFunction(client))
                .withAcceptors(new MultiplexDeleted.IsDELETEDMatcher(), new MultiplexDeleted.IsDELETINGMatcher(),
                        new HttpFailureStatusAcceptor(500, WaiterState.RETRY))
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
