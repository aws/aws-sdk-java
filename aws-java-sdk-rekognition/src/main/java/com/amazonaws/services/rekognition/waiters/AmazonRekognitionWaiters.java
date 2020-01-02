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
package com.amazonaws.services.rekognition.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRekognitionWaiters {

    /**
     * Represents the service client
     */
    private final AmazonRekognition client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonRekognitionWaiters");

    /**
     * Constructs a new AmazonRekognitionWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonRekognitionWaiters(AmazonRekognition client) {
        this.client = client;
    }

    /**
     * Builds a ProjectVersionTrainingCompleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeProjectVersionsRequest> projectVersionTrainingCompleted() {

        return new WaiterBuilder<DescribeProjectVersionsRequest, DescribeProjectVersionsResult>()
                .withSdkFunction(new DescribeProjectVersionsFunction(client))
                .withAcceptors(new ProjectVersionTrainingCompleted.IsTRAINING_COMPLETEDMatcher(),
                        new ProjectVersionTrainingCompleted.IsTRAINING_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(360), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ProjectVersionRunning waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeProjectVersionsRequest> projectVersionRunning() {

        return new WaiterBuilder<DescribeProjectVersionsRequest, DescribeProjectVersionsResult>().withSdkFunction(new DescribeProjectVersionsFunction(client))
                .withAcceptors(new ProjectVersionRunning.IsRUNNINGMatcher(), new ProjectVersionRunning.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
