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
package com.amazonaws.services.iotsitewise.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.iotsitewise.AWSIoTSiteWise;
import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTSiteWiseWaiters {

    /**
     * Represents the service client
     */
    private final AWSIoTSiteWise client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSIoTSiteWiseWaiters");

    /**
     * Constructs a new AWSIoTSiteWiseWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSIoTSiteWiseWaiters(AWSIoTSiteWise client) {
        this.client = client;
    }

    /**
     * Builds a PortalNotExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribePortalRequest> portalNotExists() {

        return new WaiterBuilder<DescribePortalRequest, DescribePortalResult>().withSdkFunction(new DescribePortalFunction(client))
                .withAcceptors(new PortalNotExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a PortalActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribePortalRequest> portalActive() {

        return new WaiterBuilder<DescribePortalRequest, DescribePortalResult>().withSdkFunction(new DescribePortalFunction(client))
                .withAcceptors(new PortalActive.IsACTIVEMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AssetModelActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAssetModelRequest> assetModelActive() {

        return new WaiterBuilder<DescribeAssetModelRequest, DescribeAssetModelResult>().withSdkFunction(new DescribeAssetModelFunction(client))
                .withAcceptors(new AssetModelActive.IsACTIVEMatcher(), new AssetModelActive.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AssetNotExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAssetRequest> assetNotExists() {

        return new WaiterBuilder<DescribeAssetRequest, DescribeAssetResult>().withSdkFunction(new DescribeAssetFunction(client))
                .withAcceptors(new AssetNotExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AssetModelNotExists waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAssetModelRequest> assetModelNotExists() {

        return new WaiterBuilder<DescribeAssetModelRequest, DescribeAssetModelResult>().withSdkFunction(new DescribeAssetModelFunction(client))
                .withAcceptors(new AssetModelNotExists.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AssetActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeAssetRequest> assetActive() {

        return new WaiterBuilder<DescribeAssetRequest, DescribeAssetResult>().withSdkFunction(new DescribeAssetFunction(client))
                .withAcceptors(new AssetActive.IsACTIVEMatcher(), new AssetActive.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
