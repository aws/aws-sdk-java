/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.groundstation.AWSGroundStation;
import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGroundStationWaiters {

    /**
     * Represents the service client
     */
    private final AWSGroundStation client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AWSGroundStationWaiters");

    /**
     * Constructs a new AWSGroundStationWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSGroundStationWaiters(AWSGroundStation client) {
        this.client = client;
    }

    /**
     * Builds a ContactScheduled waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeContactRequest> contactScheduled() {

        return new WaiterBuilder<DescribeContactRequest, DescribeContactResult>().withSdkFunction(new DescribeContactFunction(client))
                .withAcceptors(new ContactScheduled.IsFAILED_TO_SCHEDULEMatcher(), new ContactScheduled.IsSCHEDULEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
