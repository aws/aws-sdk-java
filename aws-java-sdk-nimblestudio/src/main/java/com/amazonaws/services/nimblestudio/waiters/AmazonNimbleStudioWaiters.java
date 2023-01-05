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
package com.amazonaws.services.nimblestudio.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.nimblestudio.AmazonNimbleStudio;
import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNimbleStudioWaiters {

    /**
     * Represents the service client
     */
    private final AmazonNimbleStudio client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonNimbleStudioWaiters");

    /**
     * Constructs a new AmazonNimbleStudioWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonNimbleStudioWaiters(AmazonNimbleStudio client) {
        this.client = client;
    }

    /**
     * Builds a StreamingSessionDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingSessionRequest> streamingSessionDeleted() {

        return new WaiterBuilder<GetStreamingSessionRequest, GetStreamingSessionResult>().withSdkFunction(new GetStreamingSessionFunction(client))
                .withAcceptors(new StreamingSessionDeleted.IsDELETEDMatcher(), new StreamingSessionDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StudioComponentDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStudioComponentRequest> studioComponentDeleted() {

        return new WaiterBuilder<GetStudioComponentRequest, GetStudioComponentResult>().withSdkFunction(new GetStudioComponentFunction(client))
                .withAcceptors(new StudioComponentDeleted.IsDELETEDMatcher(), new StudioComponentDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StudioDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStudioRequest> studioDeleted() {

        return new WaiterBuilder<GetStudioRequest, GetStudioResult>().withSdkFunction(new GetStudioFunction(client))
                .withAcceptors(new StudioDeleted.IsDELETEDMatcher(), new StudioDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingSessionStreamReady waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingSessionStreamRequest> streamingSessionStreamReady() {

        return new WaiterBuilder<GetStreamingSessionStreamRequest, GetStreamingSessionStreamResult>()
                .withSdkFunction(new GetStreamingSessionStreamFunction(client))
                .withAcceptors(new StreamingSessionStreamReady.IsREADYMatcher(), new StreamingSessionStreamReady.IsCREATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(30), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingImageReady waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingImageRequest> streamingImageReady() {

        return new WaiterBuilder<GetStreamingImageRequest, GetStreamingImageResult>()
                .withSdkFunction(new GetStreamingImageFunction(client))
                .withAcceptors(new StreamingImageReady.IsREADYMatcher(), new StreamingImageReady.IsCREATE_FAILEDMatcher(),
                        new StreamingImageReady.IsUPDATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LaunchProfileReady waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetLaunchProfileRequest> launchProfileReady() {

        return new WaiterBuilder<GetLaunchProfileRequest, GetLaunchProfileResult>()
                .withSdkFunction(new GetLaunchProfileFunction(client))
                .withAcceptors(new LaunchProfileReady.IsREADYMatcher(), new LaunchProfileReady.IsCREATE_FAILEDMatcher(),
                        new LaunchProfileReady.IsUPDATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(150), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingSessionStopped waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingSessionRequest> streamingSessionStopped() {

        return new WaiterBuilder<GetStreamingSessionRequest, GetStreamingSessionResult>().withSdkFunction(new GetStreamingSessionFunction(client))
                .withAcceptors(new StreamingSessionStopped.IsSTOPPEDMatcher(), new StreamingSessionStopped.IsSTOP_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingImageDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingImageRequest> streamingImageDeleted() {

        return new WaiterBuilder<GetStreamingImageRequest, GetStreamingImageResult>().withSdkFunction(new GetStreamingImageFunction(client))
                .withAcceptors(new StreamingImageDeleted.IsDELETEDMatcher(), new StreamingImageDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StreamingSessionReady waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStreamingSessionRequest> streamingSessionReady() {

        return new WaiterBuilder<GetStreamingSessionRequest, GetStreamingSessionResult>()
                .withSdkFunction(new GetStreamingSessionFunction(client))
                .withAcceptors(new StreamingSessionReady.IsREADYMatcher(), new StreamingSessionReady.IsCREATE_FAILEDMatcher(),
                        new StreamingSessionReady.IsSTART_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(10)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a LaunchProfileDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetLaunchProfileRequest> launchProfileDeleted() {

        return new WaiterBuilder<GetLaunchProfileRequest, GetLaunchProfileResult>().withSdkFunction(new GetLaunchProfileFunction(client))
                .withAcceptors(new LaunchProfileDeleted.IsDELETEDMatcher(), new LaunchProfileDeleted.IsDELETE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(150), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StudioReady waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStudioRequest> studioReady() {

        return new WaiterBuilder<GetStudioRequest, GetStudioResult>().withSdkFunction(new GetStudioFunction(client))
                .withAcceptors(new StudioReady.IsREADYMatcher(), new StudioReady.IsCREATE_FAILEDMatcher(), new StudioReady.IsUPDATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a StudioComponentReady waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetStudioComponentRequest> studioComponentReady() {

        return new WaiterBuilder<GetStudioComponentRequest, GetStudioComponentResult>()
                .withSdkFunction(new GetStudioComponentFunction(client))
                .withAcceptors(new StudioComponentReady.IsREADYMatcher(), new StudioComponentReady.IsCREATE_FAILEDMatcher(),
                        new StudioComponentReady.IsUPDATE_FAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(2)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
