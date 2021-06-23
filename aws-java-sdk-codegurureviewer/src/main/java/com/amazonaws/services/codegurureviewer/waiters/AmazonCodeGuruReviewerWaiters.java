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
package com.amazonaws.services.codegurureviewer.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.codegurureviewer.AmazonCodeGuruReviewer;
import com.amazonaws.services.codegurureviewer.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruReviewerWaiters {

    /**
     * Represents the service client
     */
    private final AmazonCodeGuruReviewer client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonCodeGuruReviewerWaiters");

    /**
     * Constructs a new AmazonCodeGuruReviewerWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonCodeGuruReviewerWaiters(AmazonCodeGuruReviewer client) {
        this.client = client;
    }

    /**
     * Builds a RepositoryAssociationSucceeded waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeRepositoryAssociationRequest> repositoryAssociationSucceeded() {

        return new WaiterBuilder<DescribeRepositoryAssociationRequest, DescribeRepositoryAssociationResult>()
                .withSdkFunction(new DescribeRepositoryAssociationFunction(client))
                .withAcceptors(new RepositoryAssociationSucceeded.IsAssociatedMatcher(), new RepositoryAssociationSucceeded.IsAssociatingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a CodeReviewCompleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCodeReviewRequest> codeReviewCompleted() {

        return new WaiterBuilder<DescribeCodeReviewRequest, DescribeCodeReviewResult>().withSdkFunction(new DescribeCodeReviewFunction(client))
                .withAcceptors(new CodeReviewCompleted.IsCompletedMatcher(), new CodeReviewCompleted.IsPendingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
