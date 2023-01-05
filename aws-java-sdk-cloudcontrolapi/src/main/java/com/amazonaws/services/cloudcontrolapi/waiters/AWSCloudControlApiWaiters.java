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
package com.amazonaws.services.cloudcontrolapi.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.cloudcontrolapi.AWSCloudControlApi;
import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudControlApiWaiters {

    /**
     * Represents the service client
     */
    private final AWSCloudControlApi client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSCloudControlApiWaiters");

    /**
     * Constructs a new AWSCloudControlApiWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSCloudControlApiWaiters(AWSCloudControlApi client) {
        this.client = client;
    }

    /**
     * Builds a ResourceRequestSuccess waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetResourceRequestStatusRequest> resourceRequestSuccess() {

        return new WaiterBuilder<GetResourceRequestStatusRequest, GetResourceRequestStatusResult>()
                .withSdkFunction(new GetResourceRequestStatusFunction(client))
                .withAcceptors(new ResourceRequestSuccess.IsSUCCESSMatcher(), new ResourceRequestSuccess.IsFAILEDMatcher(),
                        new ResourceRequestSuccess.IsCANCEL_COMPLETEMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(24), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
