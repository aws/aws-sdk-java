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
package com.amazonaws.services.ssmincidents.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.ssmincidents.AWSSSMIncidents;
import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSMIncidentsWaiters {

    /**
     * Represents the service client
     */
    private final AWSSSMIncidents client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSSSMIncidentsWaiters");

    /**
     * Constructs a new AWSSSMIncidentsWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSSSMIncidentsWaiters(AWSSSMIncidents client) {
        this.client = client;
    }

    /**
     * Builds a WaitForReplicationSetDeleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReplicationSetRequest> waitForReplicationSetDeleted() {

        return new WaiterBuilder<GetReplicationSetRequest, GetReplicationSetResult>()
                .withSdkFunction(new GetReplicationSetFunction(client))
                .withAcceptors(new WaitForReplicationSetDeleted.IsResourceNotFoundExceptionMatcher(), new WaitForReplicationSetDeleted.IsDELETINGMatcher(),
                        new WaitForReplicationSetDeleted.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(5), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a WaitForReplicationSetActive waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReplicationSetRequest> waitForReplicationSetActive() {

        return new WaiterBuilder<GetReplicationSetRequest, GetReplicationSetResult>()
                .withSdkFunction(new GetReplicationSetFunction(client))
                .withAcceptors(new WaitForReplicationSetActive.IsACTIVEMatcher(), new WaitForReplicationSetActive.IsCREATINGMatcher(),
                        new WaitForReplicationSetActive.IsUPDATINGMatcher(), new WaitForReplicationSetActive.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(5), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
