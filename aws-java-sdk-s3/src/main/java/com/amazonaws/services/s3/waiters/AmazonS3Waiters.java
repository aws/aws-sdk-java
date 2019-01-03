/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.waiters;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AmazonS3Waiters {

    /**
     * Represents the service client
     */
    private final AmazonS3 client;

    private final ExecutorService executorService = Executors
        .newFixedThreadPool(50);

    /**
     * Constructs a new AmazonS3Waiters with the given client
     *
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonS3Waiters(AmazonS3 client) {
        this.client = client;
    }

    /**
     * Builds a BucketNotExists waiter by using custom parameters
     * waiterParameters and other parameters defined in the waiters
     * specification, and then polls until it determines whether the resource
     * entered the desired state or not, where polling criteria is bound by
     * either default polling strategy or custom polling strategy.
     */
    public Waiter<HeadBucketRequest> bucketNotExists() {

        return new WaiterBuilder<HeadBucketRequest, HeadBucketResult>()
            .withSdkFunction(new HeadBucketFunction(client))
            .withAcceptors(
                new HttpFailureStatusAcceptor<HeadBucketResult>(404, WaiterState.SUCCESS))
            .withDefaultPollingStrategy(
                new PollingStrategy(new MaxAttemptsRetryStrategy(20),
                                    new FixedDelayStrategy(5)))
            .withExecutorService(executorService).build();
    }

    /**
     * Builds a BucketExists waiter by using custom parameters waiterParameters
     * and other parameters defined in the waiters specification, and then polls
     * until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy
     * or custom polling strategy.
     */
    public Waiter<HeadBucketRequest> bucketExists() {

        return new WaiterBuilder<HeadBucketRequest, HeadBucketResult>()
            .withSdkFunction(new HeadBucketFunction(client))
            .withAcceptors(
                new HttpSuccessStatusAcceptor<HeadBucketResult>(WaiterState.SUCCESS),
                new HttpFailureStatusAcceptor<HeadBucketResult>(301, WaiterState.SUCCESS),
                new HttpFailureStatusAcceptor<HeadBucketResult>(403, WaiterState.SUCCESS),
                new HttpFailureStatusAcceptor<HeadBucketResult>(404, WaiterState.RETRY))
            .withDefaultPollingStrategy(
                new PollingStrategy(new MaxAttemptsRetryStrategy(20),
                                    new FixedDelayStrategy(5)))
            .withExecutorService(executorService).build();
    }

    /**
     * Builds a ObjectExists waiter by using custom parameters waiterParameters
     * and other parameters defined in the waiters specification, and then polls
     * until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy
     * or custom polling strategy.
     */
    public Waiter<GetObjectMetadataRequest> objectExists() {

        return new WaiterBuilder<GetObjectMetadataRequest, ObjectMetadata>()
            .withSdkFunction(new HeadObjectFunction(client))
            .withAcceptors(
                new HttpSuccessStatusAcceptor<ObjectMetadata>(WaiterState.SUCCESS),
                new HttpFailureStatusAcceptor<ObjectMetadata>(404, WaiterState.RETRY))
            .withDefaultPollingStrategy(
                new PollingStrategy(new MaxAttemptsRetryStrategy(20),
                                    new FixedDelayStrategy(5)))
            .withExecutorService(executorService).build();
    }

    /**
     * Builds a ObjectNotExists waiter by using custom parameters
     * waiterParameters and other parameters defined in the waiters
     * specification, and then polls until it determines whether the resource
     * entered the desired state or not, where polling criteria is bound by
     * either default polling strategy or custom polling strategy.
     */
    public Waiter<GetObjectMetadataRequest> objectNotExists() {

        return new WaiterBuilder<GetObjectMetadataRequest, ObjectMetadata>()
            .withSdkFunction(new HeadObjectFunction(client))
            .withAcceptors(
                new HttpFailureStatusAcceptor<ObjectMetadata>(404, WaiterState.SUCCESS))
            .withDefaultPollingStrategy(
                new PollingStrategy(new MaxAttemptsRetryStrategy(20),
                                    new FixedDelayStrategy(5)))
            .withExecutorService(executorService).build();
    }

}
