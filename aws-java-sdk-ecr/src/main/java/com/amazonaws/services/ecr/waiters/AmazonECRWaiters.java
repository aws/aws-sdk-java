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
package com.amazonaws.services.ecr.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.ecr.AmazonECR;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECRWaiters {

    /**
     * Represents the service client
     */
    private final AmazonECR client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonECRWaiters");

    /**
     * Constructs a new AmazonECRWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonECRWaiters(AmazonECR client) {
        this.client = client;
    }

    /**
     * Builds a ImageScanComplete waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeImageScanFindingsRequest> imageScanComplete() {

        return new WaiterBuilder<DescribeImageScanFindingsRequest, DescribeImageScanFindingsResult>()
                .withSdkFunction(new DescribeImageScanFindingsFunction(client))
                .withAcceptors(new ImageScanComplete.IsCOMPLETEMatcher(), new ImageScanComplete.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LifecyclePolicyPreviewComplete waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetLifecyclePolicyPreviewRequest> lifecyclePolicyPreviewComplete() {

        return new WaiterBuilder<GetLifecyclePolicyPreviewRequest, GetLifecyclePolicyPreviewResult>()
                .withSdkFunction(new GetLifecyclePolicyPreviewFunction(client))
                .withAcceptors(new LifecyclePolicyPreviewComplete.IsCOMPLETEMatcher(), new LifecyclePolicyPreviewComplete.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
