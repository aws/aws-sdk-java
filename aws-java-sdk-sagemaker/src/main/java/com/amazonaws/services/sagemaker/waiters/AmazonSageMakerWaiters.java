/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.sagemaker.AmazonSageMaker;
import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerWaiters {

    /**
     * Represents the service client
     */
    private final AmazonSageMaker client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonSageMakerWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonSageMakerWaiters(AmazonSageMaker client) {
        this.client = client;
    }

    /**
     * Builds a NotebookInstanceStopped waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstanceStopped() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstanceStopped.IsStoppedMatcher(), new NotebookInstanceStopped.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NotebookInstanceDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstanceDeleted() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstanceDeleted.IsValidationExceptionMatcher(), new NotebookInstanceDeleted.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EndpointInService waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointRequest> endpointInService() {

        return new WaiterBuilder<DescribeEndpointRequest, DescribeEndpointResult>()
                .withSdkFunction(new DescribeEndpointFunction(client))
                .withAcceptors(new EndpointInService.IsInServiceMatcher(), new EndpointInService.IsFailedMatcher(),
                        new EndpointInService.IsValidationExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(120), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EndpointDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEndpointRequest> endpointDeleted() {

        return new WaiterBuilder<DescribeEndpointRequest, DescribeEndpointResult>().withSdkFunction(new DescribeEndpointFunction(client))
                .withAcceptors(new EndpointDeleted.IsValidationExceptionMatcher(), new EndpointDeleted.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NotebookInstanceInService waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNotebookInstanceRequest> notebookInstanceInService() {

        return new WaiterBuilder<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult>()
                .withSdkFunction(new DescribeNotebookInstanceFunction(client))
                .withAcceptors(new NotebookInstanceInService.IsInServiceMatcher(), new NotebookInstanceInService.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TransformJobCompletedOrStopped waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTransformJobRequest> transformJobCompletedOrStopped() {

        return new WaiterBuilder<DescribeTransformJobRequest, DescribeTransformJobResult>()
                .withSdkFunction(new DescribeTransformJobFunction(client))
                .withAcceptors(new TransformJobCompletedOrStopped.IsCompletedMatcher(), new TransformJobCompletedOrStopped.IsStoppedMatcher(),
                        new TransformJobCompletedOrStopped.IsFailedMatcher(), new TransformJobCompletedOrStopped.IsValidationExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(60)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TrainingJobCompletedOrStopped waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeTrainingJobRequest> trainingJobCompletedOrStopped() {

        return new WaiterBuilder<DescribeTrainingJobRequest, DescribeTrainingJobResult>()
                .withSdkFunction(new DescribeTrainingJobFunction(client))
                .withAcceptors(new TrainingJobCompletedOrStopped.IsCompletedMatcher(), new TrainingJobCompletedOrStopped.IsStoppedMatcher(),
                        new TrainingJobCompletedOrStopped.IsFailedMatcher(), new TrainingJobCompletedOrStopped.IsValidationExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(180), new FixedDelayStrategy(120)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
